
package webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for newSaleAndUpdateStore complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="newSaleAndUpdateStore">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="customer" type="{http://webservice/}customerDomain" minOccurs="0"/>
 *         &lt;element name="merchant" type="{http://webservice/}merchantDomain" minOccurs="0"/>
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
@XmlType(name = "newSaleAndUpdateStore", propOrder = {
    "customer",
    "merchant",
    "car"
})
public class NewSaleAndUpdateStore {

    protected CustomerDomain customer;
    protected MerchantDomain merchant;
    protected CarDomain car;

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerDomain }
     *     
     */
    public CustomerDomain getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerDomain }
     *     
     */
    public void setCustomer(CustomerDomain value) {
        this.customer = value;
    }

    /**
     * Gets the value of the merchant property.
     * 
     * @return
     *     possible object is
     *     {@link MerchantDomain }
     *     
     */
    public MerchantDomain getMerchant() {
        return merchant;
    }

    /**
     * Sets the value of the merchant property.
     * 
     * @param value
     *     allowed object is
     *     {@link MerchantDomain }
     *     
     */
    public void setMerchant(MerchantDomain value) {
        this.merchant = value;
    }

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
