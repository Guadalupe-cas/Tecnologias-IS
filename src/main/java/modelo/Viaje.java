package modelo;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Viaje {
	
	private String Id;
	private String Destino;
	private String FechaSalida;
	private String Hora;
	private String NombreCliente;
	private String Costo;
	private String NumAsiento;
	
	
	public Viaje(String Id, String Destino , String FechaSalida,String Hora,String NombreCliente,String Costo,String NumAsiento) {
		
		this.Id = Id;
		this.Destino = Destino;
		this.FechaSalida = FechaSalida;
		this.Hora = Hora;
		this.NombreCliente = NombreCliente;
		this.Costo = Costo;
		this.NumAsiento = NumAsiento;
		
		
		
		
	}



	



	public String getId() {
		return Id;
	}


	public void setId(String id) {
		Id= id;
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


	public String getNombreCliente() {
		return NombreCliente;
	}





	public void setnombreCliente(String nombreCliente) {
		Hora = nombreCliente;
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
	