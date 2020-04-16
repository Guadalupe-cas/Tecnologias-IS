package modelo;




public class Cliente {
	
	private String NombreCliente;
	private String Apellidos;
	private String IdCliente;
	
	
	
	public Cliente(String NombreCliente, String Apellidos, String IdCliente) {
		this.NombreCliente = NombreCliente;
		this.Apellidos = Apellidos;
		this.IdCliente = IdCliente;
	}


	public String getNombreCliente() {
		return NombreCliente;
	}

	public void setNombre(String NombreCliente) {
		this.NombreCliente = NombreCliente;
	}

	public String getApellidos() {
		return Apellidos;
	}

	public void setApellidos(String Apellidos) {
		this.Apellidos = Apellidos;
	}

	public String getIdCliente() {
		return IdCliente;
	}

	public void setIdCliente(String IdCliente) {
		this.IdCliente = IdCliente;
	}
}