//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.06.07 at 05:39:25 PM BRT 
//


package org.jabref.logic.importer.fileformat.endnote;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "year",
    "pubDates",
    "copyrightDates"
})
@XmlRootElement(name = "dates")
public class Dates {

    protected Year year;
    @XmlElement(name = "pub-dates")
    protected PubDates pubDates;
    @XmlElement(name = "copyright-dates")
    protected CopyrightDates copyrightDates;

    /**
     * Gets the value of the year property.
     * 
     * @return
     *     possible object is
     *     {@link Year }
     *     
     */
    public Year getYear() {
        return year;
    }

    /**
     * Sets the value of the year property.
     * 
     * @param value
     *     allowed object is
     *     {@link Year }
     *     
     */
    public void setYear(Year value) {
        this.year = value;
    }

    /**
     * Gets the value of the pubDates property.
     * 
     * @return
     *     possible object is
     *     {@link PubDates }
     *     
     */
    public PubDates getPubDates() {
        return pubDates;
    }

    /**
     * Sets the value of the pubDates property.
     * 
     * @param value
     *     allowed object is
     *     {@link PubDates }
     *     
     */
    public void setPubDates(PubDates value) {
        this.pubDates = value;
    }

    /**
     * Gets the value of the copyrightDates property.
     * 
     * @return
     *     possible object is
     *     {@link CopyrightDates }
     *     
     */
    public CopyrightDates getCopyrightDates() {
        return copyrightDates;
    }

    /**
     * Sets the value of the copyrightDates property.
     * 
     * @param value
     *     allowed object is
     *     {@link CopyrightDates }
     *     
     */
    public void setCopyrightDates(CopyrightDates value) {
        this.copyrightDates = value;
    }

}
