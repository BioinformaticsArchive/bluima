//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.03.06 at 04:19:48 PM CET 
//


package ch.epfl.bbp.uima.xml.testcase;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 *         &lt;element ref="{}value"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element ref="{}tokens"/>
 *           &lt;element ref="{}rawContent"/>
 *         &lt;/choice>
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
    "value",
    "tokens",
    "rawContent"
})
@XmlRootElement(name = "concentration")
public class Concentration {

    @XmlElement(required = true)
    protected String value;
    protected Tokens tokens;
    protected String rawContent;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the tokens property.
     * 
     * @return
     *     possible object is
     *     {@link Tokens }
     *     
     */
    public Tokens getTokens() {
        return tokens;
    }

    /**
     * Sets the value of the tokens property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tokens }
     *     
     */
    public void setTokens(Tokens value) {
        this.tokens = value;
    }

    /**
     * Gets the value of the rawContent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRawContent() {
        return rawContent;
    }

    /**
     * Sets the value of the rawContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRawContent(String value) {
        this.rawContent = value;
    }

}