package modelo;

public class Boleto {


	private String IdBoleto;
	private String NombreRuta;
	private String Destino;
	private String NombreCliente;
	private String TipoBoleto;
	private int Costo;
	private int NumAsiento;
	
	
	
	
	public Boleto(String IdBoleto, String NombreRuta, String Destino,String NombreCliente, String TipoBoleto,int Costo, int NumAsiento) {
		this.IdBoleto = IdBoleto;
		this.NombreRuta = NombreRuta;
		this.Destino = Destino;
		this.NombreCliente = NombreCliente;
		this.TipoBoleto = TipoBoleto;
		this.Costo = Costo;
		this.NumAsiento = NumAsiento;
		
	
	}




	public String getIdBoleto() {
		return IdBoleto;
	}




	public void setIdBoleto(String idBoleto) {
		IdBoleto = idBoleto;
	}




	public String getNombreRuta() {
		return NombreRuta;
	}




	public void setNombreRuta(String nombreRuta) {
		NombreRuta = nombreRuta;
	}




	public String getDestino() {
		return Destino;
	}




	public void setDestino(String destino) {
		Destino = destino;
	}




	public String getNombreCliente() {
		return NombreCliente;
	}




	public void setNombreCliente(String nombreCliente) {
		NombreCliente = nombreCliente;
	}




	public String getTipoBoleto() {
		return TipoBoleto;
	}




	public void setTipoBoleto(String tipoBoleto) {
		TipoBoleto = tipoBoleto;
	}




	public int getCosto() {
		return Costo;
	}




	public void setCosto(int costo) {
		Costo = costo;
	}




	public int getNumAsiento() {
		return NumAsiento;
	}




	public void setNumAsiento(int numAsiento) {
		NumAsiento = numAsiento;
	}
	
}
