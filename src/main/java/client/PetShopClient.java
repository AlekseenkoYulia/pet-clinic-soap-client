package client;

import java.util.List;

import soap.service.*;

public class PetShopClient {
    public static void main(String[] args) {
        PetClinicServiceImplService petClinicServiceImplService = new PetClinicServiceImplService();
        PetClinicServiceInterface petClinic = petClinicServiceImplService.getPetClinicServiceImplPort();

        try{
            //getDoctorLastName
            //List<String> lastNames = petClinic.getDoctorLastName("Ivanov");
            //System.out.println(lastNames);

            //getDoctorScheduleByLastName
            //List<Workday> workdays = petClinic.getDoctorScheduleByLastName("Ivanov");
            //System.out.println(workdays);

            //getAllDoctors
            //List<Doctor> allDoctors = petClinic.getAllDoctors();
            //System.out.println(allDoctors);

            //registerNewPatient
            //petClinic.registerNewPatient("yulia", "08-10-2018", "08:00", "ivanov");
            //System.out.println(petClinic.getDoctorScheduleByLastName("Ivanov"));


            //addWorkday
            //System.out.println(petClinic.getDoctorScheduleByLastName("Sidorov"));
            //petClinic.addWorkday("Sidorov", new Workday());
            //System.out.println(petClinic.getDoctorScheduleByLastName("Sidorov"));

        } catch (Exception e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

    }
}

