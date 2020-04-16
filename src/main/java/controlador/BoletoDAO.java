package controlador;



import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import database.conexion;


public class BoletoDAO {
	private String IdBoleto;
	private String NombreRuta;
	private String Destino;
	private String NombreCliente;
	private String TipoBoleto;
	private int Costo;
	private int NumAsiento;
	
	private conexion database;
	
	
	
	public BoletoDAO(String IdBoleto, String NombreRuta, String Destino,String NombreCliente, String TipoBoleto,int Costo, int NumAsiento) {
		this.IdBoleto = IdBoleto;
		this.NombreRuta = NombreRuta;
		this.Destino = Destino;
		this.NombreCliente = NombreCliente;
		this.TipoBoleto = TipoBoleto;
		this.Costo = Costo;
		this.NumAsiento = NumAsiento;
		
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
	public BoletoDAO(String IdBoleto) {
		this.IdBoleto = IdBoleto;
	}

	/**
	 * @return the idReservacion
	 */
	public String getIdBoleto() {
		return IdBoleto;
	}

	
	/**
	 * Metodo para agregar una reservacion
	 * @return
	 */
	public boolean AgregarBoleto() {
		boolean resultado = false;
		this.database = new conexion();
		try {
			this.database.connect().createStatement().execute(
					"INSERT INTO Boleto (IdBoleto,NombreRuta,Destino,NombreCliente,TipoBoleto,Costo,NumAsiento) VALUES "
					+ "('"+this.IdBoleto+"','"+this.NombreRuta+"','"+this.Destino+"','"+this.NombreCliente+"','"+this.TipoBoleto
					+"','"+this.Costo+"','"+this.NumAsiento+"')");
			resultado = true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resultado;
	}
	
	
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
			this.database.connect().createStatement().execute(
					"DELETE FROM reservaciones WHERE IdBoleto = "+this.IdBoleto);
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
	public boolean ConsultarIdBoleto() {
		boolean existe = false;
		this.database = new conexion();
			try {
				final String queryCheck = "SELECT * FROM clientes WHERE IdBoleto = "+this.IdBoleto;
				final PreparedStatement ps = this.database.connect().prepareStatement(queryCheck);
				//ps.setString(1, msgid);
				final ResultSet resultSet = ps.executeQuery();
				if(resultSet.next()) {
				    final int count = resultSet.getInt(1);
				}
				
				
				//this.database.connect().createStatement().execute("SELECT * FROM clientes WHERE idCliente = "+this.idCliente);
				existe = true;				
			} catch(SQLException e) {
				e.printStackTrace();
			}
		return existe;
	}
}