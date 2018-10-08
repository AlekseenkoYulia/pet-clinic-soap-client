
package soap.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the soap.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _WorkdayNotFreeException_QNAME = new QName("http://service.soap/", "WorkdayNotFreeException");
    private final static QName _GetAllDoctorsResponse_QNAME = new QName("http://service.soap/", "getAllDoctorsResponse");
    private final static QName _GetDoctorLastNameResponse_QNAME = new QName("http://service.soap/", "getDoctorLastNameResponse");
    private final static QName _RegisterNewPatientResponse_QNAME = new QName("http://service.soap/", "registerNewPatientResponse");
    private final static QName _AddWorkday_QNAME = new QName("http://service.soap/", "addWorkday");
    private final static QName _AddWorkdayResponse_QNAME = new QName("http://service.soap/", "addWorkdayResponse");
    private final static QName _GetDoctorScheduleByLastNameResponse_QNAME = new QName("http://service.soap/", "getDoctorScheduleByLastNameResponse");
    private final static QName _DoctorNotFoundException_QNAME = new QName("http://service.soap/", "DoctorNotFoundException");
    private final static QName _GetAllDoctors_QNAME = new QName("http://service.soap/", "getAllDoctors");
    private final static QName _GetDoctorScheduleByLastName_QNAME = new QName("http://service.soap/", "getDoctorScheduleByLastName");
    private final static QName _TimeSlotIsNotFreeException_QNAME = new QName("http://service.soap/", "TimeSlotIsNotFreeException");
    private final static QName _RegisterNewPatient_QNAME = new QName("http://service.soap/", "registerNewPatient");
    private final static QName _WorkdayNotFoundException_QNAME = new QName("http://service.soap/", "WorkdayNotFoundException");
    private final static QName _GetDoctorLastName_QNAME = new QName("http://service.soap/", "getDoctorLastName");
    private final static QName _Dao_QNAME = new QName("http://service.soap/", "dao");
    private final static QName _TimeSlotNotFoundException_QNAME = new QName("http://service.soap/", "TimeSlotNotFoundException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: soap.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetDoctorScheduleByLastNameResponse }
     * 
     */
    public GetDoctorScheduleByLastNameResponse createGetDoctorScheduleByLastNameResponse() {
        return new GetDoctorScheduleByLastNameResponse();
    }

    /**
     * Create an instance of {@link DoctorNotFoundException }
     * 
     */
    public DoctorNotFoundException createDoctorNotFoundException() {
        return new DoctorNotFoundException();
    }

    /**
     * Create an instance of {@link GetAllDoctors }
     * 
     */
    public GetAllDoctors createGetAllDoctors() {
        return new GetAllDoctors();
    }

    /**
     * Create an instance of {@link RegisterNewPatientResponse }
     * 
     */
    public RegisterNewPatientResponse createRegisterNewPatientResponse() {
        return new RegisterNewPatientResponse();
    }

    /**
     * Create an instance of {@link GetDoctorLastNameResponse }
     * 
     */
    public GetDoctorLastNameResponse createGetDoctorLastNameResponse() {
        return new GetDoctorLastNameResponse();
    }

    /**
     * Create an instance of {@link WorkdayNotFreeException }
     * 
     */
    public WorkdayNotFreeException createWorkdayNotFreeException() {
        return new WorkdayNotFreeException();
    }

    /**
     * Create an instance of {@link GetAllDoctorsResponse }
     * 
     */
    public GetAllDoctorsResponse createGetAllDoctorsResponse() {
        return new GetAllDoctorsResponse();
    }

    /**
     * Create an instance of {@link AddWorkday }
     * 
     */
    public AddWorkday createAddWorkday() {
        return new AddWorkday();
    }

    /**
     * Create an instance of {@link AddWorkdayResponse }
     * 
     */
    public AddWorkdayResponse createAddWorkdayResponse() {
        return new AddWorkdayResponse();
    }

    /**
     * Create an instance of {@link Doctor }
     * 
     */
    public Doctor createDoctor() {
        return new Doctor();
    }

    /**
     * Create an instance of {@link TimeSlotNotFoundException }
     * 
     */
    public TimeSlotNotFoundException createTimeSlotNotFoundException() {
        return new TimeSlotNotFoundException();
    }

    /**
     * Create an instance of {@link RegisterNewPatient }
     * 
     */
    public RegisterNewPatient createRegisterNewPatient() {
        return new RegisterNewPatient();
    }

    /**
     * Create an instance of {@link TimeSlotIsNotFreeException }
     * 
     */
    public TimeSlotIsNotFreeException createTimeSlotIsNotFreeException() {
        return new TimeSlotIsNotFreeException();
    }

    /**
     * Create an instance of {@link GetDoctorScheduleByLastName }
     * 
     */
    public GetDoctorScheduleByLastName createGetDoctorScheduleByLastName() {
        return new GetDoctorScheduleByLastName();
    }

    /**
     * Create an instance of {@link GetDoctorLastName }
     * 
     */
    public GetDoctorLastName createGetDoctorLastName() {
        return new GetDoctorLastName();
    }

    /**
     * Create an instance of {@link WorkdayNotFoundException }
     * 
     */
    public WorkdayNotFoundException createWorkdayNotFoundException() {
        return new WorkdayNotFoundException();
    }

    /**
     * Create an instance of {@link Workday }
     * 
     */
    public Workday createWorkday() {
        return new Workday();
    }

    /**
     * Create an instance of {@link TimeSlot }
     * 
     */
    public TimeSlot createTimeSlot() {
        return new TimeSlot();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkdayNotFreeException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.soap/", name = "WorkdayNotFreeException")
    public JAXBElement<WorkdayNotFreeException> createWorkdayNotFreeException(WorkdayNotFreeException value) {
        return new JAXBElement<WorkdayNotFreeException>(_WorkdayNotFreeException_QNAME, WorkdayNotFreeException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllDoctorsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.soap/", name = "getAllDoctorsResponse")
    public JAXBElement<GetAllDoctorsResponse> createGetAllDoctorsResponse(GetAllDoctorsResponse value) {
        return new JAXBElement<GetAllDoctorsResponse>(_GetAllDoctorsResponse_QNAME, GetAllDoctorsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDoctorLastNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.soap/", name = "getDoctorLastNameResponse")
    public JAXBElement<GetDoctorLastNameResponse> createGetDoctorLastNameResponse(GetDoctorLastNameResponse value) {
        return new JAXBElement<GetDoctorLastNameResponse>(_GetDoctorLastNameResponse_QNAME, GetDoctorLastNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterNewPatientResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.soap/", name = "registerNewPatientResponse")
    public JAXBElement<RegisterNewPatientResponse> createRegisterNewPatientResponse(RegisterNewPatientResponse value) {
        return new JAXBElement<RegisterNewPatientResponse>(_RegisterNewPatientResponse_QNAME, RegisterNewPatientResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddWorkday }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.soap/", name = "addWorkday")
    public JAXBElement<AddWorkday> createAddWorkday(AddWorkday value) {
        return new JAXBElement<AddWorkday>(_AddWorkday_QNAME, AddWorkday.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddWorkdayResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.soap/", name = "addWorkdayResponse")
    public JAXBElement<AddWorkdayResponse> createAddWorkdayResponse(AddWorkdayResponse value) {
        return new JAXBElement<AddWorkdayResponse>(_AddWorkdayResponse_QNAME, AddWorkdayResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDoctorScheduleByLastNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.soap/", name = "getDoctorScheduleByLastNameResponse")
    public JAXBElement<GetDoctorScheduleByLastNameResponse> createGetDoctorScheduleByLastNameResponse(GetDoctorScheduleByLastNameResponse value) {
        return new JAXBElement<GetDoctorScheduleByLastNameResponse>(_GetDoctorScheduleByLastNameResponse_QNAME, GetDoctorScheduleByLastNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoctorNotFoundException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.soap/", name = "DoctorNotFoundException")
    public JAXBElement<DoctorNotFoundException> createDoctorNotFoundException(DoctorNotFoundException value) {
        return new JAXBElement<DoctorNotFoundException>(_DoctorNotFoundException_QNAME, DoctorNotFoundException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllDoctors }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.soap/", name = "getAllDoctors")
    public JAXBElement<GetAllDoctors> createGetAllDoctors(GetAllDoctors value) {
        return new JAXBElement<GetAllDoctors>(_GetAllDoctors_QNAME, GetAllDoctors.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDoctorScheduleByLastName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.soap/", name = "getDoctorScheduleByLastName")
    public JAXBElement<GetDoctorScheduleByLastName> createGetDoctorScheduleByLastName(GetDoctorScheduleByLastName value) {
        return new JAXBElement<GetDoctorScheduleByLastName>(_GetDoctorScheduleByLastName_QNAME, GetDoctorScheduleByLastName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeSlotIsNotFreeException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.soap/", name = "TimeSlotIsNotFreeException")
    public JAXBElement<TimeSlotIsNotFreeException> createTimeSlotIsNotFreeException(TimeSlotIsNotFreeException value) {
        return new JAXBElement<TimeSlotIsNotFreeException>(_TimeSlotIsNotFreeException_QNAME, TimeSlotIsNotFreeException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterNewPatient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.soap/", name = "registerNewPatient")
    public JAXBElement<RegisterNewPatient> createRegisterNewPatient(RegisterNewPatient value) {
        return new JAXBElement<RegisterNewPatient>(_RegisterNewPatient_QNAME, RegisterNewPatient.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkdayNotFoundException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.soap/", name = "WorkdayNotFoundException")
    public JAXBElement<WorkdayNotFoundException> createWorkdayNotFoundException(WorkdayNotFoundException value) {
        return new JAXBElement<WorkdayNotFoundException>(_WorkdayNotFoundException_QNAME, WorkdayNotFoundException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDoctorLastName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.soap/", name = "getDoctorLastName")
    public JAXBElement<GetDoctorLastName> createGetDoctorLastName(GetDoctorLastName value) {
        return new JAXBElement<GetDoctorLastName>(_GetDoctorLastName_QNAME, GetDoctorLastName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Doctor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.soap/", name = "dao")
    public JAXBElement<Doctor> createDao(Doctor value) {
        return new JAXBElement<Doctor>(_Dao_QNAME, Doctor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeSlotNotFoundException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.soap/", name = "TimeSlotNotFoundException")
    public JAXBElement<TimeSlotNotFoundException> createTimeSlotNotFoundException(TimeSlotNotFoundException value) {
        return new JAXBElement<TimeSlotNotFoundException>(_TimeSlotNotFoundException_QNAME, TimeSlotNotFoundException.class, null, value);
    }

}
