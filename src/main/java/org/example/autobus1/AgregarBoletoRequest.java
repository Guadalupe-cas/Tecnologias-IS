//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.05.01 a las 02:39:32 PM CDT 
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
 *         &lt;element name="IdBoleto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NombreRuta" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Destino" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NombreCliente" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TipoBoleto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Costo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NumAsiento" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "idBoleto",
    "nombreRuta",
    "destino",
    "nombreCliente",
    "tipoBoleto",
    "costo",
    "numAsiento"
})
@XmlRootElement(name = "AgregarBoletoRequest")
public class AgregarBoletoRequest {

    @XmlElement(name = "IdBoleto", required = true)
    protected String idBoleto;
    @XmlElement(name = "NombreRuta", required = true)
    protected String nombreRuta;
    @XmlElement(name = "Destino", required = true)
    protected String destino;
    @XmlElement(name = "NombreCliente", required = true)
    protected String nombreCliente;
    @XmlElement(name = "TipoBoleto", required = true)
    protected String tipoBoleto;
    @XmlElement(name = "Costo", required = true)
    protected String costo;
    @XmlElement(name = "NumAsiento", required = true)
    protected String numAsiento;

    /**
     * Obtiene el valor de la propiedad idBoleto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdBoleto() {
        return idBoleto;
    }

    /**
     * Define el valor de la propiedad idBoleto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdBoleto(String value) {
        this.idBoleto = value;
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

    /**
     * Obtiene el valor de la propiedad destino.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestino() {
        return destino;
    }

    /**
     * Define el valor de la propiedad destino.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestino(String value) {
        this.destino = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreCliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreCliente() {
        return nombreCliente;
    }

    /**
     * Define el valor de la propiedad nombreCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreCliente(String value) {
        this.nombreCliente = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoBoleto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoBoleto() {
        return tipoBoleto;
    }

    /**
     * Define el valor de la propiedad tipoBoleto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoBoleto(String value) {
        this.tipoBoleto = value;
    }

    /**
     * Obtiene el valor de la propiedad costo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCosto() {
        return costo;
    }

    /**
     * Define el valor de la propiedad costo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCosto(String value) {
        this.costo = value;
    }

    /**
     * Obtiene el valor de la propiedad numAsiento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumAsiento() {
        return numAsiento;
    }

    /**
     * Define el valor de la propiedad numAsiento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumAsiento(String value) {
        this.numAsiento = value;
    }

}
