package controlador;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelo.Ruta;
import database.conexion;
import modelo.Ruta;
import java.util.logging.Level;
import java.util.logging.Logger;

import database.conexion;

public class RutaDAO {
	private String IdRuta;
	private String NombreRuta;
	
	
	
	
	private conexion database;
	
	/**
	 * Constructor de CLIENTE para registrar al cliente
	 * @param nombre, apellido, telefono, correo, formaPago
	 */
	public RutaDAO(String IdRuta,String NombreRuta) {
		this.IdRuta =  IdRuta;
		this.NombreRuta = NombreRuta;
	}
	

public RutaDAO() throws ClassNotFoundException{
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
	public RutaDAO(String IdRuta) {
		this.IdRuta = IdRuta;
	}
	
	/**
	 * Metodo para registrar un cliente en la Base de Datos
	 * @return true si se registro el cliente de forma exitosa en la BD
	 */
	public boolean AgregarRuta() {
		boolean resultado = false;
		this.database = new conexion();
		try {
			this.database.connection().createStatement().execute(
					"INSERT INTO rutas(IdRuta,NombreRuta) VALUES "
					+ "('"+this.IdRuta+"','"+this.NombreRuta+"')");
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
	public boolean ModificarRuta() {
		boolean resultado = false;
		this.database = new conexion();
		try {
			this.database.connection().createStatement().execute(
					"UPDATE rutas SET "
					+ "IdRuta = '"+this.IdRuta+"',"
					+ "NombreRuta = '"+this.NombreRuta+"',"
					+ "WHERE IdRuta = "+this.IdRuta + "'");
			resultado = true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resultado;
	}
	
	
	/**
	 * Metodo para eliminar a un cliente de la Base de Datos
	 * @return true si se elimina el cliente de forma exitosa
	 */
	public boolean EliminarRuta() {
		boolean resultado = false;
		this.database = new conexion();
		try {
			this.database.connection().createStatement().execute(
					"DELETE FROM rutas WHERE IdRuta = '"+this.IdRuta +"'");
			resultado = true;				
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return resultado;
	}

	/**
	 * @return the nombre
	 */
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

	

	/**
	 * @return the apellido
	 */

	
	public Ruta  ConsultarIdRuta() {
		Ruta ruta = null;
	
		this.database = new conexion();
			try {
				ResultSet rs = this.database.connection().createStatement().executeQuery("SELECT * FROM rutas WHERE IdRuta = '"+this.IdRuta + "'");
				while(rs.next()) {
					ruta = new Ruta (rs.getString("NombreRuta"), IdRuta);
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
		return ruta;
	}

	public String getIdRuta() {
		// TODO Auto-generated method stub
		return IdRuta ;
	}


	public boolean ConsultarRuta() {
		// TODO Auto-generated method stub
		return false;
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


