package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Cliente {
	
	private String NombreCliente;
	private String  Apellidos;
	private String IdCliente;
	
	
	public Cliente(String nombreCliente, String apellidos, String idCliente) {
		
		NombreCliente = nombreCliente;
		Apellidos = apellidos;
		IdCliente = idCliente;
	}
	
	public String getNombreCliente() {
		return NombreCliente;
	}
	
	public void setNombreCliente(String nombreCliente) {
		NombreCliente = nombreCliente;
	}
	public String getApellidos() {
		return Apellidos;
	}
	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}
	public String getIdCliente() {
		return IdCliente;
	}
	public void setIdCliente(String idCliente) {
		IdCliente = idCliente;
	}
	
	
	
	
	
	

}