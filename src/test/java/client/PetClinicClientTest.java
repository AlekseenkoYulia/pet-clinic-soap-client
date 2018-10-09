package client;

import org.junit.Before;
import org.junit.Test;
import soap.service.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class PetShopClientTest {
    private PetClinicServiceImplService petClinicServiceImplService;
    private PetClinicServiceInterface petClinic;

    @Before
    public void initData() {
        petClinicServiceImplService = new PetClinicServiceImplService();
        petClinic = petClinicServiceImplService.getPetClinicServiceImplPort();
    }

    @Test

    public void shouldGetDoctorLastName() throws DoctorNotFoundException_Exception {
        List<String> lastNames = petClinic.getDoctorLastName("Ivanov");
        List<String> expected = new ArrayList<>();
        expected.add("Ivanov");
        assertTrue(lastNames.size() == 1);
        assertEquals(expected, lastNames);
    }

    @Test(expected = DoctorNotFoundException_Exception.class)
    public void shouldThrowsExceptionIfDoctorNotFound() throws DoctorNotFoundException_Exception {
        petClinic.getDoctorLastName("A");
    }

    @Test
    public void shouldGetDoctorSchedule() throws DoctorNotFoundException_Exception {
        List<Workday> workdays = petClinic.getDoctorScheduleByLastName("Petrov");
        assertEquals(3, workdays.size());
    }

    @Test(expected = DoctorNotFoundException_Exception.class)
    public void shouldNotReturnScheduleIfDoctorNotFound() throws DoctorNotFoundException_Exception {
        petClinic.getDoctorScheduleByLastName("A");
    }

    @Test
    public void shouldGetAllDoctors() {
        List<Doctor> allDoctors = petClinic.getAllDoctors();
        assertTrue(allDoctors.size() == 3);
    }

    @Test
    public void shouldRegisterNewPatient() throws DoctorNotFoundException_Exception, WorkdayNotFoundException_Exception, TimeSlotIsNotFreeException_Exception, TimeSlotNotFoundException_Exception {
        List<Workday> workdays = petClinic.getDoctorScheduleByLastName("Ivanov");
        Workday monday = workdays.get(0);
        List<TimeSlot> timeSlots = monday.getTimeSlots();
        int index = timeSlots.size() + 1;
        for (int i = 0; i < timeSlots.size(); i++) {
            if (timeSlots.get(i).getPatient() == null) {
                petClinic.registerNewPatient("Yulia", "08-10-2018", timeSlots.get(i).getStartTime(), "Ivanov");
                index = i;
                break;
            }
        }
        assertEquals("Yulia", petClinic
                .getDoctorScheduleByLastName("Ivanov")
                .get(0)
                .getTimeSlots()
                .get(index)
                .getPatient()
        );
    }

    @Test (expected = WorkdayNotFoundException_Exception.class)
    public void shouldThrowExceptionIfWorkdayNotFound() throws TimeSlotIsNotFreeException_Exception, DoctorNotFoundException_Exception, WorkdayNotFoundException_Exception, TimeSlotNotFoundException_Exception {
        petClinic.registerNewPatient("yulia", "10-10-2018", "08:00", "ivanov");
    }

    @Test(expected = TimeSlotNotFoundException_Exception.class)
    public void shouldThrowExceptionIfTimeslotNotFound() throws TimeSlotIsNotFreeException_Exception, DoctorNotFoundException_Exception, WorkdayNotFoundException_Exception, TimeSlotNotFoundException_Exception {
        petClinic.registerNewPatient("yulia", "09-10-2018", "20:00", "ivanov");
    }

    @Test(expected = TimeSlotIsNotFreeException_Exception.class)
    public void shouldThrowExceptionIfTimeslotNotFree() throws TimeSlotIsNotFreeException_Exception, DoctorNotFoundException_Exception, WorkdayNotFoundException_Exception, TimeSlotNotFoundException_Exception {
        petClinic.registerNewPatient("yulia", "08-10-2018", "10:00", "ivanov");
        petClinic.registerNewPatient("maria", "08-10-2018", "10:00", "ivanov");
    }

    @Test
    public void shouldAddWorkday() throws DoctorNotFoundException_Exception, WorkdayNotFreeException_Exception {
        int beforeAdding = petClinic.getDoctorScheduleByLastName("Sidorov").size();
        Workday workday = new Workday();
        petClinic.addWorkday("Sidorov", workday);
        int afterAdding = petClinic.getDoctorScheduleByLastName("Sidorov").size();
        assertEquals(beforeAdding + 1, afterAdding);
    }

    @Test(expected = WorkdayNotFreeException_Exception.class)
    public void shouldNotAddWorkdayIfItAlreadyExsist() throws DoctorNotFoundException_Exception, WorkdayNotFreeException_Exception {
        Workday workday = new Workday();
        workday.setDayOfWeek(DayOfWeek.TUESDAY);
        petClinic.addWorkday("Sidorov", workday);
    }
}