package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Boleto {


	private String IdBoleto;
	private String NombreRuta;
	private String Destino;
	private String NombreCliente;
	private String TipoBoleto;
	private String Costo;
	private String NumAsiento;
	
	
	
	
	public Boleto(String IdBoleto, String NombreRuta, String Destino,String NombreCliente, String TipoBoleto,String Costo, String NumAsiento) {
		this.IdBoleto = IdBoleto;
		this.NombreRuta = NombreRuta;
		this.Destino = Destino;
		this.NombreCliente = NombreCliente;
		this.TipoBoleto = TipoBoleto;
		this.Costo = Costo;
		this.NumAsiento = NumAsiento;
		
	
	}




	public Boleto(String string) {
		// TODO Auto-generated constructor stub
	}




	public String getIdBoleto() {
		return IdBoleto;
	}




	public void setIdBoleto(String idBoleto) {
		IdBoleto = idBoleto;
	}




	public String getNombreRuta() {
		return NombreRuta;
	}




	public void setNombreRuta(String nombreRuta) {
		NombreRuta = nombreRuta;
	}




	public String getDestino() {
		return Destino;
	}




	public void setDestino(String destino) {
		Destino = destino;
	}




	public String getNombreCliente() {
		return NombreCliente;
	}




	public void setNombreCliente(String nombreCliente) {
		NombreCliente = nombreCliente;
	}




	public String getTipoBoleto() {
		return TipoBoleto;
	}




	public void setTipoBoleto(String tipoBoleto) {
		TipoBoleto = tipoBoleto;
	}




	public String getCosto() {
		return Costo;
	}




	public void setCosto(String costo) {
		Costo = costo;
	}




	public String getNumAsiento() {
		return NumAsiento;
	}




	public void setNumAsiento(String numAsiento) {
		NumAsiento = numAsiento;
	}

}