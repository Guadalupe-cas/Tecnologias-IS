package modelo;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ruta {
	
	private String IdRuta;
	private String NombreRuta;
	
	
	public Ruta(String idRuta, String nombreRuta) {
		
		IdRuta = idRuta;
		NombreRuta = nombreRuta();
		
		
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



}
	