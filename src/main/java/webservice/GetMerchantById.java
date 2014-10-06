
package webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getMerchantById complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getMerchantById">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="merchantId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getMerchantById", propOrder = {
    "merchantId"
})
public class GetMerchantById {

    protected int merchantId;

    /**
     * Gets the value of the merchantId property.
     * 
     */
    public int getMerchantId() {
        return merchantId;
    }

    /**
     * Sets the value of the merchantId property.
     * 
     */
    public void setMerchantId(int value) {
        this.merchantId = value;
    }

}
