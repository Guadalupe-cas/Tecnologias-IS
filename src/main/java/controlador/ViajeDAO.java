package controlador;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import modelo.Viaje;
import database.conexion;
import java.util.logging.Level;
import java.util.logging.Logger;

import database.conexion;

public class ViajeDAO {
	private String Id;
	private String Destino;
	private String FechaSalida;
	private String Hora;
	private String NombreCliente;
	private String Costo;
	private String NumAsiento;
	
	
	
	
	private conexion database;
	
	/**
	 * Constructor de CLIENTE para registrar al cliente
	 * @param nombre, apellido, telefono, correo, formaPago
	 */
	public ViajeDAO(String Id,String Destino,String FechaSalida, String Hora,String NombreCliente, String Costo, String NumAsiento) {
		this.Id =  Id;
		this.Destino = Destino;
		this.FechaSalida = FechaSalida;
		this.Hora = Hora;
		this.NombreCliente = NombreCliente;
		this.Costo = Costo;
		this.NumAsiento = NumAsiento;
	}
	

public ViajeDAO() throws ClassNotFoundException{
	database = new conexion();
}

	
	/**
	 * Constructor de CLIENTE para actualizar al cliente
	 * @param idCliente, nombre, apellido, telefono, correo, formaPago
	 */

	
	
	/**
	 * Constructor de CLIENTE para eliminar al cliente
	 * @param idCliente
	 */
	public ViajeDAO(String Id) {
		this.Id = Id;
	}
	






	/**
	 * Metodo para registrar un cliente en la Base de Datos
	 * @return true si se registro el cliente de forma exitosa en la BD
	 */
	public boolean AgregarViaje() {
		boolean resultado = false;
		this.database = new conexion();
		try {
			this.database.connection().createStatement().execute(
					"INSERT INTO viajes(Id,Destino,FechaSalida,Hora,NombreCliente, Costo,NumAsiento) VALUES "
					+ "('"+this.Id+"','"+this.Destino+"','"+this.FechaSalida+"','"+this.Hora+"','"+this.NombreCliente+"','"+this.Costo+"','"+this.NumAsiento+"')");
			resultado = true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resultado;


	}

	



	/**
	 * Metodo para actualizar a un cliente en la Base de Datos
	 * @return true si se actualizo el cliente de forma exitosa en la BD
	 */
	public boolean ModificarViaje() {
		boolean resultado = false;
		this.database = new conexion();
		try {
			this.database.connection().createStatement().execute(
					"UPDATE viajes SET "
					+ "Destino = '"+this.Destino+"'"
					+ " ,FechaSalida =' "+this.FechaSalida+"'"
					+ " ,Hora = '"+this.Hora+"'"
					+ " ,NombreCliente = '"+this.NombreCliente+"'"
					+ " ,Costo = "+this.Costo
					+ " ,NumAsiento = '"+this.NumAsiento+"'"
					+ " WHERE Id = "+this.Id);
			resultado = true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resultado;
	}
	
	
	public boolean verificarId() {
		boolean existe = false;
		this.database = new conexion();
			try {
				final String queryCheck = "SELECT * FROM viajes WHERE Id = '"+this.Id + "'";
				final PreparedStatement ps = this.database.connection().prepareStatement(queryCheck);
				//ps.setString(1, msgid);
				final ResultSet resultSet = ps.executeQuery();
				if(resultSet.next()) {
				
				}
				
				
				existe = true;				
			} catch(SQLException e) {
				e.printStackTrace();
			}
		return existe;
	}
	
	/**
	 * Metodo para eliminar a un cliente de la Base de Datos
	 * @return true si se elimina el cliente de forma exitosa
	 */
	public boolean EliminarViaje() {
		boolean resultado = false;
		this.database = new conexion();
		try {
			this.database.connection().createStatement().execute(
					"DELETE FROM viajes WHERE Id = '"+this.Id +"'");
			resultado = true;				
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return resultado;
	}

	/**
	 * @return the nombre
	 */
	/*
	public String getNombreRuta() {
		this.database = new conexion();
		if (IdRuta == null) {
			try {
				this.database.connection().createStatement().execute(
						"SELECT nombre FROM rutas WHERE IdRuta = '"+this.IdRuta + "'");
								
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return NombreRuta;
	}

	*/

	/**
	 * @return the apellido
	 */

	
	public Viaje  ConsultarId() {
		Viaje viaje = null;
	
		this.database = new conexion();
			try {
				ResultSet rs = this.database.connection().createStatement().executeQuery("SELECT * FROM viajes WHERE Id = '"+this.Id + "'");
				while(rs.next()) {
					viaje = new Viaje (rs.getString("Id"),
							rs.getString("Destino"),rs.getString("FechaSalida"),rs.getString("Hora"),rs.getString("NombreCliente"),rs.getString("Costo"),rs.getString("NumAsiento"));
							
						
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
		return viaje;
	}

	public String getId() {
		// TODO Auto-generated method stub
		return Id ;
	}


	public boolean ConsultarViaje() {
		// TODO Auto-generated method stub
		return false;
	}


	public String getHora() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public String getNombreCliente() {
		// TODO Auto-generated method stub
		return null;
	}
	

	public String getNumAsiento() {
		// TODO Auto-generated method stub
		return null;
	}


	public String getFechaSalida() {
		// TODO Auto-generated method stub
		return null;
	}


	public String getDestino() {
		// TODO Auto-generated method stub
		return null;
	}


	public String getCosto() {
		// TODO Auto-generated method stub
		return null;
	}
	
	/*
	public Ruta consultarRuta(String IdRuta) {
		Ruta ruta = null;
		this.database = new conexion();
		try {
			ResultSet rs = this.database.connection().createStatement().executeQuery("SELECT * FROM rutas WHERE IdRuta="+IdRuta);
			while(rs.next()) {
				ruta= new Ruta(rs.getString("NombreRuta"), "IdRuta");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ruta;
	}


	public String getIdRuta() {
		// TODO Auto-generated method stub
		return null;
	}
	
	*/
	
	
}


