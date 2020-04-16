package database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class conexion {

	/*
	String url = "jdbc:mysql://"+ 34.207.215.173 +":"+ 3306 +"/"+database+"?useTimezone=true&serverTimezone=UTC";
	*/
	conexion conn = null;

	String driver = "com.mysql.jdbc.Driver";
	String database =  "dbautobus1";
	String hostname = "34.207.215.173";
	String port = "3306";
	String username = "root";
	String password = "12345678";
	String url = "jdbc:mysql://"+ hostname +":"+
	port + "/" + database + "?user="+ username + "&password=" + password; 
	
	public Connection connect() {
		
		try {
			this.conn = (conexion) DriverManager.getConnection(this.url,this.username,this.password);
		} catch (SQLException e) {
			System.out.println("Conexion Fallida!:\n" + e.getMessage());
		}

		if (conn != null) {
			System.out.println("Conexion establecida");
		} else {
			System.out.println("No se pudo establecer conexion");
		}
		
		return (Connection) this.conn;
		
	}

}