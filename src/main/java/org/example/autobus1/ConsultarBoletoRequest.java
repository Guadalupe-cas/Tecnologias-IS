//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.05.01 a las 02:27:11 PM CDT 
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
    "idBoleto"
})
@XmlRootElement(name = "ConsultarBoletoRequest")
public class ConsultarBoletoRequest {

    @XmlElement(name = "IdBoleto", required = true)
    protected String idBoleto;

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

	public String getNombreRuta() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getCosto() {
		// TODO Auto-generated method stub
		return null;
	}

	public String NombreCliente() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getTipoBoleto() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getNumAsiento() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getDestino() {
		// TODO Auto-generated method stub
		return null;
	}

}
