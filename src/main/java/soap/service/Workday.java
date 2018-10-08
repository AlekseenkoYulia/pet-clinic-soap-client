
package soap.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for workday complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="workday">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dayOfWeek" type="{http://service.soap/}dayOfWeek" minOccurs="0"/>
 *         &lt;element name="timeSlots" type="{http://service.soap/}timeSlot" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "workday", propOrder = {
    "dayOfWeek",
    "timeSlots"
})
public class Workday {

    @XmlSchemaType(name = "string")
    protected DayOfWeek dayOfWeek;
    @XmlElement(nillable = true)
    protected List<TimeSlot> timeSlots;

    /**
     * Gets the value of the dayOfWeek property.
     * 
     * @return
     *     possible object is
     *     {@link DayOfWeek }
     *     
     */
    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    /**
     * Sets the value of the dayOfWeek property.
     * 
     * @param value
     *     allowed object is
     *     {@link DayOfWeek }
     *     
     */
    public void setDayOfWeek(DayOfWeek value) {
        this.dayOfWeek = value;
    }

    /**
     * Gets the value of the timeSlots property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the timeSlots property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTimeSlots().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TimeSlot }
     * 
     * 
     */
    public List<TimeSlot> getTimeSlots() {
        if (timeSlots == null) {
            timeSlots = new ArrayList<TimeSlot>();
        }
        return this.timeSlots;
    }

    @Override
    public String toString() {
        return "Workday{" +
                "dayOfWeek=" + dayOfWeek +
                ", timeSlots=" + timeSlots +
                '}';
    }

}
