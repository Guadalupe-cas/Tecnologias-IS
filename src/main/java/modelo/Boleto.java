package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Boleto {


	private String Id;
	private String Destino;
	private String FechaSalida;
	private String Hora;
	private String NombreCliente;
	private String TipoBoleto;
	private String Costo;
	private String NumAsiento;
	
	
	
	
	public Boleto(String Id, String Destino,String FechaSalida,String Hora,String NombreCliente, String TipoBoleto,String Costo, String NumAsiento) {
		this.Id = Id;
		this.Destino = Destino;
		this.FechaSalida = FechaSalida;
		this.Hora = Hora;
		this.NombreCliente = NombreCliente;
		this.TipoBoleto = TipoBoleto;
		this.Costo = Costo;
		this.NumAsiento = NumAsiento;
		
	
	}




	public Boleto(String string) {
		// TODO Auto-generated constructor stub
	}





	public String getId() {
		return Id;
	}




	public void setIdBoleto(String id) {
		Id= id;
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




	public String getFechaSalida() {
		return FechaSalida;
	}




	public void setFechaSalida(String fechaSalida) {
		FechaSalida = fechaSalida;
	}




	public String getHora() {
		return Hora;
	}




	public void setHora(String hora) {
		Hora = hora;
	}
	
	

}