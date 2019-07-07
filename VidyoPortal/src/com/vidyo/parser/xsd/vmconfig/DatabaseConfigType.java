//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-558 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.30 at 11:22:11 AM IST 
//


package com.vidyo.parser.xsd.vmconfig;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DatabaseConfigType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DatabaseConfigType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DBAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OdbcDSN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OdbcType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OdbcUID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OdbcPwd" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatabaseConfigType", propOrder = {
    "dbAddress",
    "odbcDSN",
    "odbcType",
    "odbcUID",
    "odbcPwd"
})
public class DatabaseConfigType {

    @XmlElement(name = "DBAddress", required = true)
    protected String dbAddress;
    @XmlElement(name = "OdbcDSN", required = true)
    protected String odbcDSN;
    @XmlElement(name = "OdbcType", required = true)
    protected String odbcType;
    @XmlElement(name = "OdbcUID", required = true)
    protected String odbcUID;
    @XmlElement(name = "OdbcPwd", required = true)
    protected byte[] odbcPwd;

    /**
     * Gets the value of the dbAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDBAddress() {
        return dbAddress;
    }

    /**
     * Sets the value of the dbAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDBAddress(String value) {
        this.dbAddress = value;
    }

    /**
     * Gets the value of the odbcDSN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOdbcDSN() {
        return odbcDSN;
    }

    /**
     * Sets the value of the odbcDSN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOdbcDSN(String value) {
        this.odbcDSN = value;
    }

    /**
     * Gets the value of the odbcType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOdbcType() {
        return odbcType;
    }

    /**
     * Sets the value of the odbcType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOdbcType(String value) {
        this.odbcType = value;
    }

    /**
     * Gets the value of the odbcUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOdbcUID() {
        return odbcUID;
    }

    /**
     * Sets the value of the odbcUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOdbcUID(String value) {
        this.odbcUID = value;
    }

    /**
     * Gets the value of the odbcPwd property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getOdbcPwd() {
        return odbcPwd;
    }

    /**
     * Sets the value of the odbcPwd property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setOdbcPwd(byte[] value) {
        this.odbcPwd = ((byte[]) value);
    }

}