
package webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for storeElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="storeElement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="car" type="{http://webservice/}carElement" minOccurs="0"/>
 *         &lt;element name="enableTestDrive" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "storeElement", propOrder = {
    "car",
    "enableTestDrive",
    "id",
    "price",
    "quantity"
})
public class StoreElement {

    protected CarElement car;
    protected boolean enableTestDrive;
    protected int id;
    protected float price;
    protected int quantity;

    /**
     * Gets the value of the car property.
     * 
     * @return
     *     possible object is
     *     {@link CarElement }
     *     
     */
    public CarElement getCar() {
        return car;
    }

    /**
     * Sets the value of the car property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarElement }
     *     
     */
    public void setCar(CarElement value) {
        this.car = value;
    }

    /**
     * Gets the value of the enableTestDrive property.
     * 
     */
    public boolean isEnableTestDrive() {
        return enableTestDrive;
    }

    /**
     * Sets the value of the enableTestDrive property.
     * 
     */
    public void setEnableTestDrive(boolean value) {
        this.enableTestDrive = value;
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
     * Gets the value of the quantity property.
     * 
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     */
    public void setQuantity(int value) {
        this.quantity = value;
    }

}
