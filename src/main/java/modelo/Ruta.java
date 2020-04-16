package modelo;

public class Ruta {
	
	private String IdRuta;
	private String NombreRuta;
	
	public Ruta(String IdRuta, String NombreRuta) {
		this.setIdRuta(IdRuta);
		this.setNombreRuta(NombreRuta);
	}

	public String getNombreRuta() {
		return NombreRuta;
	}

	public void setNombreRuta(String nombreRuta) {
		NombreRuta = nombreRuta;
	}

	public String getIdRuta() {
		return IdRuta;
	}

	public void setIdRuta(String idRuta) {
		IdRuta = idRuta;
	}
	

}
