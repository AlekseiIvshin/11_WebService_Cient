
package webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getStore complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getStore">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="car" type="{http://webservice/}carDomain" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getStore", propOrder = {
    "car"
})
public class GetStore {

    protected CarDomain car;

    /**
     * Gets the value of the car property.
     * 
     * @return
     *     possible object is
     *     {@link CarDomain }
     *     
     */
    public CarDomain getCar() {
        return car;
    }

    /**
     * Sets the value of the car property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarDomain }
     *     
     */
    public void setCar(CarDomain value) {
        this.car = value;
    }

}
