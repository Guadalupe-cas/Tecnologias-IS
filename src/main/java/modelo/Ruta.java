package modelo;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ruta {
	
	private String IdRuta;
	private String NombreRuta;
	private String Destino;
	private String FechaSalida;
	private String Hora;
	private String Costo;
	private String NumAsiento;
	
	
	public Ruta(String idRuta, String nombreRuta,String destino , String fechaSalida,String hora,String costo,String numAsiento) {
		
		IdRuta = idRuta;
		NombreRuta = nombreRuta;
		Destino = destino;
		FechaSalida = fechaSalida;
		Hora = hora;
		Costo = costo;
		NumAsiento = numAsiento;
		
		
		
		
	}



	private String nombreRuta() {
		// TODO Auto-generated method stub
		return null;
	}


	public String getIdRuta() {
		return IdRuta;
	}


	public void setIdRuta(String idRuta) {
		IdRuta = idRuta;
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
	