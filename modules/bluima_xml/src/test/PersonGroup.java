//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.09.09 at 01:22:27 PM CEST 
//


package test;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element ref="{}anonymous"/>
 *         &lt;element ref="{}collab"/>
 *         &lt;element ref="{}name"/>
 *         &lt;element ref="{}aff"/>
 *         &lt;element ref="{}etal"/>
 *         &lt;element ref="{}string-name"/>
 *       &lt;/choice>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="person-group-type">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="allauthors"/>
 *             &lt;enumeration value="assignee"/>
 *             &lt;enumeration value="author"/>
 *             &lt;enumeration value="compiler"/>
 *             &lt;enumeration value="director"/>
 *             &lt;enumeration value="editor"/>
 *             &lt;enumeration value="guest-editor"/>
 *             &lt;enumeration value="inventor"/>
 *             &lt;enumeration value="translator"/>
 *             &lt;enumeration value="transed"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "anonymousOrCollabOrName"
})
@XmlRootElement(name = "person-group")
public class PersonGroup {

    @XmlElements({
        @XmlElement(name = "collab", type = Collab.class),
        @XmlElement(name = "name", type = Name.class),
        @XmlElement(name = "string-name", type = StringName.class),
        @XmlElement(name = "etal", type = String.class),
        @XmlElement(name = "aff", type = Aff.class),
        @XmlElement(name = "anonymous", type = Anonymous.class)
    })
    protected List<Object> anonymousOrCollabOrName;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "person-group-type")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String personGroupType;

    /**
     * Gets the value of the anonymousOrCollabOrName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the anonymousOrCollabOrName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnonymousOrCollabOrName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Collab }
     * {@link Name }
     * {@link StringName }
     * {@link String }
     * {@link Aff }
     * {@link Anonymous }
     * 
     * 
     */
    public List<Object> getAnonymousOrCollabOrName() {
        if (anonymousOrCollabOrName == null) {
            anonymousOrCollabOrName = new ArrayList<Object>();
        }
        return this.anonymousOrCollabOrName;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the personGroupType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonGroupType() {
        return personGroupType;
    }

    /**
     * Sets the value of the personGroupType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonGroupType(String value) {
        this.personGroupType = value;
    }

}
