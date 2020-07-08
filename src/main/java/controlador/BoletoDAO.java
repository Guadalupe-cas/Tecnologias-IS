package controlador;



import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelo.Boleto;
import modelo.Ruta;
import database.conexion;
import modelo.Boleto;
import java.util.logging.Level;
import java.util.logging.Logger;

import database.conexion;


public class BoletoDAO {
	private String Id;
	private String Destino;
	private String FechaSalida;
	private String Hora;
	private String NombreCliente;
	private String TipoBoleto;
	private String Costo;
	private String NumAsiento;
	
	private conexion database;
	
	
	
	public BoletoDAO(String Id, String Destino,String FechaSalida,String Hora,String NombreCliente, String TipoBoleto,String Costo, String NumAsiento) {
		this.Id = Id;
		this.Destino = Destino;
		this.FechaSalida = FechaSalida;
		this.Hora = Hora;
		this.NombreCliente = NombreCliente;
		this.TipoBoleto = TipoBoleto;
		this.Costo = Costo;
		this.NumAsiento = NumAsiento;
		
	}
	

public BoletoDAO() throws ClassNotFoundException{
	database = new conexion();
}

	
/*
	public BoletoDAO(String IdBoleto, String NombreRuta, String Destino,String NombreCliente, String TipoBoleto,int Costo, int NumAsiento) {
		this.IdBoleto = IdBoleto;
		this.NombreRuta = NombreRuta;
		this.Destino = Destino;
		this.NombreCliente = NombreCliente;
		this.TipoBoleto = TipoBoleto;
		this.Costo = Costo;
		this.NumAsiento = NumAsiento;
		
	}
	*/
	
	/**
	 * @param idReservacion
	 */
	public BoletoDAO(String Id) {
		this.Id = Id;
	}

	/**
	 * @return the idReservacion
	 */
	public String getId() {
		return Id;
	}

	
	/**
	 * Metodo para agregar una reservacion
	 * @return
	 */
	public boolean AgregarBoleto() {
		boolean resultado = false;
		this.database = new conexion();
		try {
			this.database.connection().createStatement().execute(
					"INSERT INTO boleto(Id,Destino,FechaSalida,Hora,NombreCliente,TipoBoleto,Costo,NumAsiento) VALUES "
					+ "('"+this.Id+"','"+this.Destino+"','"+this.FechaSalida+"','"+this.Hora+"','"+this.NombreCliente+"','"+this.TipoBoleto+"','"+this.Costo+"','"+this.NumAsiento+"')");
			resultado = true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resultado;


	}

	
	
	/*
	 * 	public boolean AgregarBoleto() {
		boolean resultado = false;
		this.database = new conexion();
		try {
			this.database.connection().createStatement().execute(
					"INSERT INTO clientes (NombreCliente,Apellidos,IdCliente) VALUES "
					+ "('"+this.NombreCliente+"','"+this.Apellidos+"','"+this.IdCliente+"')");
			resultado = true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resultado;
	}

	public String getApellidos() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getNombreCliente() {
		// TODO Auto-generated method stub
		return null;
	}
	
	 * 
	 * 
	 * 
	 */
	
	
	
	/**
	 * Metodo para actualizar una reservacion en la Base de Datos
	 * @return true si se actualizo la reservacion de forma exitosa en la BD
	 */
	
	
	/**
	 * @return true si se elimina la reservacion de forma exitosa
	 */
	public boolean CancelarBoleto() {
		boolean resultado = false;
		this.database = new conexion();
		try {
			this.database.connection().createStatement().execute(
					"DELETE FROM boleto WHERE Id = '"+this.Id + "'");
			resultado = true;				
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return resultado;
	}
	
	/**
	 * Metodo para obtener el precio aproximado de la estancia
	 * @return precio
	 */

	
	/**
	 * Metodo para consultar una reservacion
	 * @param id
	 * @return
	 */
	public Boleto  ConsultarBoleto() {
		Boleto boleto = null;
	
		this.database = new conexion();
			try {
				ResultSet rs = this.database.connection().createStatement().executeQuery("SELECT * FROM boleto WHERE Id= '"+this.Id + "'");
				while(rs.next()) {
					boleto = new Boleto (rs.getString("Id"), rs.getString("Destino"),rs.getString("FechaSalida"),rs.getString("Hora"),rs.getString("NombreCliente")
							,rs.getString("TipoBoleto"),rs.getString("Costo"),rs.getString("NumAsiento"));
				}
				
				/*
				final String queryCheck = "SELECT * FROM rutas WHERE IdRuta = '"+this.IdRuta + "'";
				final PreparedStatement ps = this.database.connection().prepareStatement(queryCheck);
				//ps.setString(1, msgid);
				final ResultSet resultSet = ps.executeQuery();
				if(resultSet.next()) {
					 final String count = resultSet.getString("NombreRuta");
				}
				*/
				
				//this.database.connect().createStatement().execute("SELECT * FROM clientes WHERE idCliente = "+this.idCliente);
								
			} catch(SQLException e) {
				e.printStackTrace();
			}
		return boleto;
	}


	
	
	/*
	public boolean ConsultarIdBoleto() {
		boolean existe = false;
		this.database = new conexion();
			try {
				final String queryCheck = "SELECT * FROM boleto WHERE IdBoleto = '"+this.IdBoleto + "'";
				final PreparedStatement ps = this.database.connection().prepareStatement(queryCheck);
				//ps.setString(1, msgid);
				final ResultSet resultSet = ps.executeQuery();
				if(resultSet.next()) {
					 final String count = resultSet.getString("IdBoleto");
				}
				
				
				//this.database.connect().createStatement().execute("SELECT * FROM clientes WHERE idCliente = "+this.idCliente);
				existe = true;				
			} catch(SQLException e) {
				e.printStackTrace();
			}
		return existe;
	}*/
	
	
	
	


	public String getNumAsiento() {
		// TODO Auto-generated method stub
		return null;
	}


	public String getCosto() {
		// TODO Auto-generated method stub
		return null;
	}



	


	public String getDestino() {
		// TODO Auto-generated method stub
		return null;
	}


	public String getTipoBoleto() {
		// TODO Auto-generated method stub
		return null;
	}


	public String getNombreCliente() {
		// TODO Auto-generated method stub
		return null;
	}
}