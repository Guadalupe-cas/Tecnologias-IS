package controlador;




import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import database.conexion;

public class ClienteDAO {

	private String NombreCliente;
	private String Apellidos;
	private String IdCliente;
	
	
	private conexion database;
	
	/**
	 * Constructor de CLIENTE para registrar al cliente
	 * @param nombre, apellido, telefono, correo, formaPago
	 */
	public ClienteDAO(String NombreCliente,String Apellidos, String IdCliente) {
		this.NombreCliente = NombreCliente;
		this.Apellidos = Apellidos;
		this.IdCliente = IdCliente;
	}
	
	/**
	 * Constructor de CLIENTE para actualizar al cliente
	 * @param idCliente, nombre, apellido, telefono, correo, formaPago
	 */

	
	
	/**
	 * Constructor de CLIENTE para eliminar al cliente
	 * @param idCliente
	 */
	public ClienteDAO(String IdCliente) {
		this.IdCliente = IdCliente;
	}
	
	/**
	 * Metodo para registrar un cliente en la Base de Datos
	 * @return true si se registro el cliente de forma exitosa en la BD
	 */
	public boolean AgregarCliente() {
		boolean resultado = false;
		this.database = new conexion();
		try {
			this.database.connect().createStatement().execute(
					"INSERT INTO Cliente (NombreCliente,Apellidos,IdCliente,correo) VALUES "
					+ "('"+this.NombreCliente+"','"+this.Apellidos+"','"+this.IdCliente+"')");
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
	public boolean ModificarCliente() {
		boolean resultado = false;
		this.database = new conexion();
		try {
			this.database.connect().createStatement().execute(
					"UPDATE Cliente SET "
					+ "NombreCliente = '"+this.NombreCliente+"'"
					+ "Apellidos = '"+this.Apellidos+"'"
					+ "IdCliente = '"+this.IdCliente+"'"
					+ "WHERE IdCliente = "+this.IdCliente);
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
	public boolean EliminarCliente() {
		boolean resultado = false;
		this.database = new conexion();
		try {
			this.database.connect().createStatement().execute(
					"DELETE FROM Clientes WHERE IdCliente = "+this.IdCliente);
			resultado = true;				
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return resultado;
	}

	/**
	 * @return the nombre
	 */
	public String getNombreCliente() {
		this.database = new conexion();
		if (NombreCliente == null) {
			try {
				this.database.connect().createStatement().execute(
						"SELECT nombre FROM Cliente WHERE idCliente = "+this.IdCliente);
								
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return NombreCliente;
	}

	

	/**
	 * @return the apellido
	 */
	public String getApellidos() {
		this.database = new conexion();
		if (Apellidos == null) {
			try {
				this.database.connect().createStatement().execute(
						"SELECT apellido FROM Cliente WHERE idCliente = "+this.IdCliente);
								
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return Apellidos;
	}
	
	public boolean ConsultarIdCliente() {
		boolean existe = false;
		this.database = new conexion();
			try {
				final String queryCheck = "SELECT * FROM Cliente WHERE IdCliente = "+this.IdCliente;
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