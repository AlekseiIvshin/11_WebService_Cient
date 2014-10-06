
package webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for salesDomain complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="salesDomain">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="car" type="{http://webservice/}carDomain" minOccurs="0"/>
 *         &lt;element name="customer" type="{http://webservice/}customerDomain" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="merchant" type="{http://webservice/}merchantDomain" minOccurs="0"/>
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="saleDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "salesDomain", propOrder = {
    "car",
    "customer",
    "id",
    "merchant",
    "price",
    "saleDate"
})
public class SalesDomain {

    protected CarDomain car;
    protected CustomerDomain customer;
    protected int id;
    protected MerchantDomain merchant;
    protected float price;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar saleDate;

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
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
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
     * Gets the value of the price property.
     * 
     */
    public float getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     */
    public void setPrice(float value) {
        this.price = value;
    }

    /**
     * Gets the value of the saleDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSaleDate() {
        return saleDate;
    }

    /**
     * Sets the value of the saleDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSaleDate(XMLGregorianCalendar value) {
        this.saleDate = value;
    }

}
