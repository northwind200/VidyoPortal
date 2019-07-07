//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-558 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.30 at 11:24:41 AM IST 
//


package com.vidyo.parser.xsd.networkconfig;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IPV4SubnetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IPV4SubnetType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Candidate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IPAddr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CIDRBits" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IPV4SubnetType", propOrder = {
    "candidate",
    "ipAddr",
    "cidrBits"
})
public class IPV4SubnetType {

    @XmlElement(name = "Candidate", required = true)
    protected String candidate;
    @XmlElement(name = "IPAddr", required = true)
    protected String ipAddr;
    @XmlElement(name = "CIDRBits", required = true)
    protected BigInteger cidrBits;

    /**
     * Gets the value of the candidate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCandidate() {
        return candidate;
    }

    /**
     * Sets the value of the candidate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCandidate(String value) {
        this.candidate = value;
    }

    /**
     * Gets the value of the ipAddr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPAddr() {
        return ipAddr;
    }

    /**
     * Sets the value of the ipAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPAddr(String value) {
        this.ipAddr = value;
    }

    /**
     * Gets the value of the cidrBits property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCIDRBits() {
        return cidrBits;
    }

    /**
     * Sets the value of the cidrBits property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCIDRBits(BigInteger value) {
        this.cidrBits = value;
    }

}