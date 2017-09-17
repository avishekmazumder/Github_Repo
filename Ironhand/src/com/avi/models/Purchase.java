
package com.avi.models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrderDetail" type="{ironhand:urn:OrderTypes}OrderType"/>
 *         &lt;element name="PaymentMethod" type="{ironhand:urn:CommonTypes}PaymentMethodType"/>
 *         &lt;element ref="{ironhand:urn:Purchase}CustomerDetails"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "orderDetail",
    "paymentMethod",
    "customerDetails"
})
@XmlRootElement(name = "Purchase", namespace = "ironhand:urn:Purchase")
public class Purchase {

    @XmlElement(name = "OrderDetail", namespace = "ironhand:urn:Purchase", required = true)
    protected OrderType orderDetail;
    @XmlElement(name = "PaymentMethod", namespace = "ironhand:urn:Purchase", required = true)
    @XmlSchemaType(name = "string")
    protected PaymentMethodType paymentMethod;
    @XmlElement(name = "CustomerDetails", namespace = "ironhand:urn:Purchase", required = true)
    protected CustomerType customerDetails;

    /**
     * Gets the value of the orderDetail property.
     * 
     * @return
     *     possible object is
     *     {@link OrderType }
     *     
     */
    public OrderType getOrderDetail() {
        return orderDetail;
    }

    /**
     * Sets the value of the orderDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderType }
     *     
     */
    public void setOrderDetail(OrderType value) {
        this.orderDetail = value;
    }

    /**
     * Gets the value of the paymentMethod property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentMethodType }
     *     
     */
    public PaymentMethodType getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Sets the value of the paymentMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentMethodType }
     *     
     */
    public void setPaymentMethod(PaymentMethodType value) {
        this.paymentMethod = value;
    }

    /**
     * Gets the value of the customerDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerType }
     *     
     */
    public CustomerType getCustomerDetails() {
        return customerDetails;
    }

    /**
     * Sets the value of the customerDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerType }
     *     
     */
    public void setCustomerDetails(CustomerType value) {
        this.customerDetails = value;
    }

}
