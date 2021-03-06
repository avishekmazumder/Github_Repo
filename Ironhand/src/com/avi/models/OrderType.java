
package com.avi.models;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Item" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ProductName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="UnitPrice" type="{ironhand:urn:CommonTypes}PriceType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderType", namespace = "ironhand:urn:OrderTypes", propOrder = {
    "item"
})
public class OrderType {

    @XmlElement(name = "Item", namespace = "ironhand:urn:OrderTypes", required = true)
    protected List<OrderType.Item> item;

    /**
     * Gets the value of the item property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the item property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderType.Item }
     * 
     * 
     */
    public List<OrderType.Item> getItem() {
        if (item == null) {
            item = new ArrayList<OrderType.Item>();
        }
        return this.item;
    }


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
     *         &lt;element name="ProductName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="UnitPrice" type="{ironhand:urn:CommonTypes}PriceType"/>
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
        "productName",
        "quantity",
        "unitPrice"
    })
    public static class Item {

        @XmlElement(name = "ProductName", namespace = "ironhand:urn:OrderTypes", required = true)
        protected String productName;
        @XmlElement(name = "Quantity", namespace = "ironhand:urn:OrderTypes")
        protected int quantity;
        @XmlElement(name = "UnitPrice", namespace = "ironhand:urn:OrderTypes", required = true)
        protected BigDecimal unitPrice;

        /**
         * Gets the value of the productName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProductName() {
            return productName;
        }

        /**
         * Sets the value of the productName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProductName(String value) {
            this.productName = value;
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

        /**
         * Gets the value of the unitPrice property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getUnitPrice() {
            return unitPrice;
        }

        /**
         * Sets the value of the unitPrice property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setUnitPrice(BigDecimal value) {
            this.unitPrice = value;
        }

    }

}
