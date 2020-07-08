package controlador;




import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelo.Cliente;
import modelo.Ruta;
import database.conexion;
import modelo.Cliente;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClienteDAO {

	private String NombreCliente;
	private String Apellidos;
	private String IdCliente;
	
	
	private conexion database;
	
	/**
	 * Constructor de CLIENTE para registrar al cliente
	 * @param nombre, apellido, telefono, correo, formaPago
	 */
	public ClienteDAO(String NombreCliente,String Apellidos) {
		this.NombreCliente = NombreCliente;
		this.Apellidos = Apellidos;
		
	}
	
	public ClienteDAO() throws ClassNotFoundException{
		database = new conexion();
	}
	
	/**
	 * Constructor de CLIENTE para actualizar al cliente
	 * @param idCliente, nombre, apellido
	 */

	
	
	/**
	 * Constructor de CLIENTE para eliminar al cliente
	 * @param idCliente
	 */
	public ClienteDAO(String IdCliente) {
		this.IdCliente = IdCliente;
	}
	
	
	
	public ClienteDAO(String nombreCliente, String apellidos, String idCliente) {
	
		NombreCliente = nombreCliente;
		Apellidos = apellidos;
		IdCliente = idCliente;
	}

	/**
	 * Metodo para registrar un cliente en la Base de Datos
	 * @return true si se registro el cliente de forma exitosa en la BD
	 */
	public boolean AgregarCliente() {
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


	
	
	
	/**
	 * Metodo para actualizar a un cliente en la Base de Datos
	 * @return true si se actualizo el cliente de forma exitosa en la BD
	 */
	
	
	public boolean modificarCliente() {
		boolean resultado = false;
		this.database = new conexion();
		try {
			this.database.connection().createStatement().execute(
					"UPDATE clientes SET "
					+ " ,NombreCliente = '"+this.NombreCliente+"'"
					+ " ,Apellidos = '"+this.Apellidos+"'"
					+ "WHERE IdCliente = "+this.IdCliente);
			resultado = true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resultado;
	}
	
	
	public boolean verificarIdCliente() {
		boolean existe = false;
		this.database = new conexion();
			try {
				final String queryCheck = "SELECT * FROM clientes WHERE IdCliente = "+this.IdCliente + "'";
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
	
	public boolean eliminarCliente() {
		boolean resultado = false;
		this.database = new conexion();
		try {
			this.database.connection().createStatement().execute(
					"DELETE FROM clientes WHERE IdCliente = '"+this.IdCliente +"'");
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
				this.database.connection().createStatement().execute(
						"SELECT NombreCliente FROM clientes WHERE IdCliente = '"+this.IdCliente + "'");
								
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
				this.database.connection().createStatement().execute(
						"SELECT Apellidos FROM clientes WHERE IdCliente = '"+this.IdCliente + "'");
								
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return Apellidos;
	}
	
	
	/*
	public boolean ConsultarCliente() {
		boolean existe = false;
		this.database = new conexion();
			try {
				final String queryCheck = "SELECT * FROM clientes WHERE IdCliente = '"+this.IdCliente + "'";
				final PreparedStatement ps = this.database.connection().prepareStatement(queryCheck);
				//ps.setString(1, msgid);
				final ResultSet resultSet = ps.executeQuery();
				if(resultSet.next()) {
				    final String count = resultSet.getString("NombreCliente");
				}
				
				
				//this.database.connect().createStatement().execute("SELECT * FROM clientes WHERE idCliente = "+this.idCliente);
				existe = true;				
			} catch(SQLException e) {
				e.printStackTrace();
			}
		return existe;
	}
*/
	public Cliente  ConsultarCliente() {
		Cliente cliente = null;
	
		this.database = new conexion();
			try {
				ResultSet rs = this.database.connection().createStatement().executeQuery("SELECT * FROM clientes WHERE IdCliente = '"+this.IdCliente + "'");
				while(rs.next()) {
					cliente = new Cliente (rs.getString("NombreCliente"),rs.getString("Apellidos"),rs.getString("IdCliente"));
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
		return cliente;
	}
	
	
	
	public String getIdCliente() {
		// TODO Auto-generated method stub
		String idCliente= "12345";
		return idCliente;
	}

	public boolean ModificarCliente() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean EliminarCliente() {
		// TODO Auto-generated method stub
		return false;
	}

	

	
}