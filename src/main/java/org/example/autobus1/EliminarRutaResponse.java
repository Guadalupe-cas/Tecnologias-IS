//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.04.07 a las 08:18:59 PM CDT 
//


package org.example.autobus1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IdRuta" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NombreRuta" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "idRuta",
    "nombreRuta"
})
@XmlRootElement(name = "EliminarRutaResponse")
public class EliminarRutaResponse {

    @XmlElement(name = "IdRuta", required = true)
    protected String idRuta;
    @XmlElement(name = "NombreRuta", required = true)
    protected String nombreRuta;

    /**
     * Obtiene el valor de la propiedad idRuta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdRuta() {
        return idRuta;
    }

    /**
     * Define el valor de la propiedad idRuta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdRuta(String value) {
        this.idRuta = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreRuta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreRuta() {
        return nombreRuta;
    }

    /**
     * Define el valor de la propiedad nombreRuta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreRuta(String value) {
        this.nombreRuta = value;
    }

}
