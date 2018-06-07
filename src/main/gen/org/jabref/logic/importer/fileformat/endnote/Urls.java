//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.06.07 at 05:50:47 PM BRT 
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
    "webUrls",
    "pdfUrls",
    "textUrls",
    "relatedUrls",
    "imageUrls"
})
@XmlRootElement(name = "urls")
public class Urls {

    @XmlElement(name = "web-urls")
    protected WebUrls webUrls;
    @XmlElement(name = "pdf-urls")
    protected PdfUrls pdfUrls;
    @XmlElement(name = "text-urls")
    protected TextUrls textUrls;
    @XmlElement(name = "related-urls")
    protected RelatedUrls relatedUrls;
    @XmlElement(name = "image-urls")
    protected ImageUrls imageUrls;

    /**
     * Gets the value of the webUrls property.
     * 
     * @return
     *     possible object is
     *     {@link WebUrls }
     *     
     */
    public WebUrls getWebUrls() {
        return webUrls;
    }

    /**
     * Sets the value of the webUrls property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebUrls }
     *     
     */
    public void setWebUrls(WebUrls value) {
        this.webUrls = value;
    }

    /**
     * Gets the value of the pdfUrls property.
     * 
     * @return
     *     possible object is
     *     {@link PdfUrls }
     *     
     */
    public PdfUrls getPdfUrls() {
        return pdfUrls;
    }

    /**
     * Sets the value of the pdfUrls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PdfUrls }
     *     
     */
    public void setPdfUrls(PdfUrls value) {
        this.pdfUrls = value;
    }

    /**
     * Gets the value of the textUrls property.
     * 
     * @return
     *     possible object is
     *     {@link TextUrls }
     *     
     */
    public TextUrls getTextUrls() {
        return textUrls;
    }

    /**
     * Sets the value of the textUrls property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextUrls }
     *     
     */
    public void setTextUrls(TextUrls value) {
        this.textUrls = value;
    }

    /**
     * Gets the value of the relatedUrls property.
     * 
     * @return
     *     possible object is
     *     {@link RelatedUrls }
     *     
     */
    public RelatedUrls getRelatedUrls() {
        return relatedUrls;
    }

    /**
     * Sets the value of the relatedUrls property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelatedUrls }
     *     
     */
    public void setRelatedUrls(RelatedUrls value) {
        this.relatedUrls = value;
    }

    /**
     * Gets the value of the imageUrls property.
     * 
     * @return
     *     possible object is
     *     {@link ImageUrls }
     *     
     */
    public ImageUrls getImageUrls() {
        return imageUrls;
    }

    /**
     * Sets the value of the imageUrls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImageUrls }
     *     
     */
    public void setImageUrls(ImageUrls value) {
        this.imageUrls = value;
    }

}