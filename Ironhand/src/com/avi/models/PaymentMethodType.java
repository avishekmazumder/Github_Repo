
package com.avi.models;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentMethodType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PaymentMethodType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="VISA"/>
 *     &lt;enumeration value="MasterCard"/>
 *     &lt;enumeration value="Cash"/>
 *     &lt;enumeration value="AMEX"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PaymentMethodType", namespace = "ironhand:urn:CommonTypes")
@XmlEnum
public enum PaymentMethodType {

    VISA("VISA"),
    @XmlEnumValue("MasterCard")
    MASTER_CARD("MasterCard"),
    @XmlEnumValue("Cash")
    CASH("Cash"),
    AMEX("AMEX");
    private final String value;

    PaymentMethodType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PaymentMethodType fromValue(String v) {
        for (PaymentMethodType c: PaymentMethodType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
