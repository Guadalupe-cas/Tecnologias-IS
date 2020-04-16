package controlador;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import database.conexion;

public class RutaDAO {
	private String IdRuta;
	private String NombreRuta;
	
	
	
	
	private conexion database;
	
	/**
	 * Constructor de CLIENTE para registrar al cliente
	 * @param nombre, apellido, telefono, correo, formaPago
	 */
	public RutaDAO(String IdRUta,String NombreRuta) {
		this.IdRuta = IdRuta;
		this.NombreRuta = NombreRuta;
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
			this.database.connect().createStatement().execute(
					"INSERT INTO Ruta (IdRuta,NombreRuta) VALUES "
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
			this.database.connect().createStatement().execute(
					"UPDATE clientes SET "
					+ "IdRuta = '"+this.IdRuta+"'"
					+ "NombreRuta = '"+this.NombreRuta+"'"
					+ "WHERE IdRuta = "+this.IdRuta);
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
			this.database.connect().createStatement().execute(
					"DELETE FROM Ruta WHERE IdRuta = "+this.IdRuta);
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
		if (NombreRuta == null) {
			try {
				this.database.connect().createStatement().execute(
						"SELECT nombre FROM Ruta WHERE IdRuta = "+this.IdRuta);
								
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return NombreRuta;
	}

	

	/**
	 * @return the apellido
	 */

	
	public boolean ConsultarIdRuta() {
		boolean existe = false;
		this.database = new conexion();
			try {
				final String queryCheck = "SELECT * FROM Ruta WHERE IdRuta = "+this.IdRuta;
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

	public String getIdRuta() {
		// TODO Auto-generated method stub
		return null;
	}
}


