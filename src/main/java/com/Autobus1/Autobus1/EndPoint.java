package com.Autobus1.Autobus1;
import org.example.autobus1.AgregarBoletoRequest;
import org.example.autobus1.AgregarBoletoResponse;
import org.example.autobus1.AgregarClienteRequest;
import org.example.autobus1.AgregarClienteResponse;
import org.example.autobus1.AgregarRutaRequest;
/*
import org.example.autobus1.AgregarRequest;
import org.example.autobus1.AgregarResponse;
*/
import org.example.autobus1.AgregarRutaResponse;
import org.example.autobus1.CancelarBoletoRequest;
import org.example.autobus1.CancelarBoletoResponse;
import org.example.autobus1.ConsultarBoletoRequest;
import org.example.autobus1.ConsultarBoletoResponse;
import org.example.autobus1.ConsultarClienteRequest;
import org.example.autobus1.ConsultarClienteResponse;
/*
import org.example.autobus1.ConsultarRequest;
import org.example.autobus1.ConsultarResponse;

*/
import org.example.autobus1.ConsultarRutaRequest;
import org.example.autobus1.ConsultarRutaResponse;
import org.example.autobus1.EliminarClienteRequest;
import org.example.autobus1.EliminarClienteResponse;
/*
import org.example.autobus1.EliminarRequest;
import org.example.autobus1.EliminarResponse;
*/
import org.example.autobus1.EliminarRutaRequest;
import org.example.autobus1.EliminarRutaResponse;
import org.example.autobus1.ModificarClienteRequest;
import org.example.autobus1.ModificarClienteResponse;
/*
import org.example.autobus1.ModificarRequest;
import org.example.autobus1.ModificarResponse;
*/
import org.example.autobus1.ModificarRutaRequest;
import org.example.autobus1.ModificarRutaResponse;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
/*
import controlador.BoletoDAO;
import controlador.RutaDAO;
*/




@Endpoint
public class EndPoint {
	
	@PayloadRoot(namespace = "http://www.example.org/Autobus1",localPart = "AgregarRutaRequest")

	@ResponsePayload
	public AgregarRutaResponse getNombreRuta(@RequestPayload AgregarRutaRequest peticion) {
		AgregarRutaResponse respuesta= new AgregarRutaResponse();
		respuesta.setRespuesta( "La ruta a sido agregada con exito" +peticion.getIdRuta() 
		+ peticion.getNombreRuta());
		return respuesta;
	}
	
	
	/*
	@PayloadRoot(namespace = "http://www.example.org/Autobus1",localPart = "AgregarRutaRequest")

	@ResponsePayload
	public AgregarRutaResponse  getAgregarRuta ( @RequestPayload  AgregarRutaRequest  peticion ) {
		AgregarRutaResponse respuesta = new  AgregarRutaResponse ();
		RutaDAO Ruta =  new  RutaDAO ( peticion . getIdRuta (), peticion . getNombreRuta ());
		if(Ruta.AgregarRuta()){
			respuesta . setRespuesta ( " Se ha agregado la ruta "  + Ruta . getIdRuta() +" al sistema " );
		} else {
			respuesta . setRespuesta ( " No se ha añadido agregar la ruta al sistema " );
		}
		return respuesta;
	}
	*/
	
	
	
	
	@PayloadRoot(namespace = "http://www.example.org/Autobus1",localPart ="ConsultarRutaRequest")

	@ResponsePayload
	
	public ConsultarRutaResponse getNombreRuta (@RequestPayload ConsultarRutaRequest peticion) {
		ConsultarRutaResponse NombreRuta= new ConsultarRutaResponse();
		NombreRuta.setNombreRuta("La ruta Consultada es: " + peticion.getNombreRuta() + peticion.getIdRuta());
		return NombreRuta;

	}
	
	/*
	@PayloadRoot(namespace = "http://www.example.org/Autobus1",localPart = "ConsultarRutaRequest")

	@ResponsePayload
	public ConsultarRutaResponse  getConsultarrRuta ( @RequestPayload  ConsultarRutaRequest  peticion ) {
		ConsultarRutaResponse NombreRuta = new  ConsultarRutaResponse ();
		RutaDAO Ruta =  new  RutaDAO ( peticion . getIdRuta (), peticion . getNombreRuta ());
		if(Ruta.AgregarRuta()){
			NombreRuta . setNombreRuta( " Se ha agregado la ruta "  + Ruta . getIdRuta() +" al sistema " );
		} else {
			NombreRuta . setNombreRuta ( " No se ha añadido agregar la ruta al sistema " );
		}
		return NombreRuta;
	}
	
	*/
	
	
	
	@PayloadRoot(namespace = "http://www.example.org/Autobus1",localPart ="EliminarRutaRequest")

	@ResponsePayload
	  
	public EliminarRutaResponse getIdRuta(@RequestPayload EliminarRutaRequest peticion) {
		EliminarRutaResponse IdRuta  =  new EliminarRutaResponse();
		IdRuta.setNombreRuta("La ruta a sido eliminada: " + peticion.getNombreRuta() + peticion.getIdRuta());
		return IdRuta;
	}
	/*
	
	@PayloadRoot(namespace = "http://www.example.org/Autobus1",localPart = "EliminarRutaRequest")

	@ResponsePayload
	public EliminarRutaResponse  getConsultarRuta ( @RequestPayload  ConsultarRutaRequest  peticion ) {
		EliminarRutaResponse IdRuta = new  EliminarRutaResponse ();
		RutaDAO Ruta =  new  RutaDAO ( peticion . getIdRuta (), peticion . getNombreRuta ());
		if(Ruta.AgregarRuta()){
			IdRuta . setIdRuta( " Se ha agregado la ruta "  + Ruta . getIdRuta() +" al sistema " );
		} else {
			IdRuta . setIdRuta ( " No se ha añadido agregar la ruta al sistema " );
		}
		return IdRuta;
	}
	
	/*
	 * 
	 */
	
	@PayloadRoot(namespace = "http://www.example.org/Autobus1",localPart ="ModificarRutaRequest")

	@ResponsePayload
	
	public ModificarRutaResponse getNombreRuta(@RequestPayload ModificarRutaRequest peticion) {
		ModificarRutaResponse NombreRuta= new ModificarRutaResponse();
		NombreRuta.setNombreRuta("La ruta a sido Modificada: " + peticion.getNombreRuta() + peticion.getIdRuta());
		return NombreRuta;
	}
	
	/*
	
	@PayloadRoot(namespace = "http://www.example.org/Autobus1",localPart = "ModificarRutaRequest")

	@ResponsePayload
	public ModificarRutaResponse  getModificarRuta ( @RequestPayload  ModificarRutaRequest  peticion ) {
		ModificarRutaResponse IdRuta = new  ModificarRutaResponse ();
		RutaDAO Ruta =  new  RutaDAO ( peticion . getIdRuta (), peticion . getNombreRuta ());
		if(Ruta.AgregarRuta()){
			IdRuta . setIdRuta( " Se ha agregado la ruta "  + Ruta . getIdRuta() +" al sistema " );
		} else {
			IdRuta . setIdRuta ( " No se ha añadido agregar la ruta al sistema " );
		}
		return IdRuta;
	}
	*/
	
	
/* Aqui terminar el de RUtas ************************************************************************
 * /*
 */
	
	@PayloadRoot(namespace = "http://www.example.org/Autobus1",localPart = "AgregarClienteRequest")

	@ResponsePayload
	public AgregarClienteResponse getNombreCliente(@RequestPayload AgregarClienteRequest peticion) {
		AgregarClienteResponse respuesta= new AgregarClienteResponse();
		respuesta.setRespuesta("El cliente  a sido  Agregado con exito: " 
		+ peticion.getNombreCliente() 
		+ peticion.getApellidos() + peticion.getIdCliente());
		return respuesta;
	}
	
	/*
	 	@PayloadRoot(namespace = "http://www.example.org/Autobus1",localPart = "AgregarClientequest")

	@ResponsePayload
	public AgregarClienteResponse  getAgregarRuta ( @RequestPayload  AgregarClienteRequest  peticion ) {
		AgregarClienteResponse respuesta = new  AgregarClienteResponse ();
		RutaDAO Cliente =  new  ClienteDAO ( peticion . getNombreCliente (), peticion . getApellidos(), peticion . getIdCliente());
		if(Cliente.AgregarCliente()){
			respuesta . setRespuesta ( " Se ha agregado el cliente al sistema " );
		} else {
			respuesta . setRespuesta ( " No se ha añadido agregar la ruta al sistema " );
		}
		return respuesta;
		
		}
	 */
	
	
	
	
	@PayloadRoot(namespace = "http://www.example.org/Autobus1",localPart = "ConsultarClienteRequest")

	@ResponsePayload
	public ConsultarClienteResponse getNombreCliente(@RequestPayload ConsultarClienteRequest peticion) {
		ConsultarClienteResponse NombreCliente = new ConsultarClienteResponse();
		NombreCliente.setIdCliente("El Cliente que consulto es:" 
		+ peticion.getNombreCliente() 
		+ peticion.getApellidos() + peticion.getIdCliente());
		return NombreCliente;

	}
	
	
	/*
	 	@PayloadRoot(namespace = "http://www.example.org/Autobus1",localPart = "ConsultarClientequest")

	@ResponsePayload
	public ConsultarClienteResponse  getConsultarCliente( @RequestPayload  ConsultarClienteRequest  peticion ) {
		ConsultarClienteResponse IdCliente = new  ConsultarClienteResponse ();
		RutaDAO Cliente =  new  ClienteDAO ( peticion . getNombreCliente (), peticion . getApellidos(), peticion . getIdCliente());
		if(Cliente.ConsultarCliente()){
			IdCliente. setIdCliente ( " Se ha agregado el cliente al sistema " );
		} else {
			IdCliente. setIdCliente ( " No se ha añadido agregar la ruta al sistema " );
		}
		return IdCliente;
		
		}
	 */
	@PayloadRoot(namespace = "http://www.example.org/Autobus1",localPart = "ModificarClienteRequest")

	@ResponsePayload
	public ModificarClienteResponse getNombreCliente(@RequestPayload ModificarClienteRequest peticion) {
		ModificarClienteResponse NombreCliente = new ModificarClienteResponse();
		NombreCliente.setIdCliente("El cliente a sido modificado:" 
		+ peticion.getNombreCliente() 
		+ peticion.getApellidos() + peticion.getIdCliente());
		return NombreCliente;
	}
	
	/*
	 	 	@PayloadRoot(namespace = "http://www.example.org/Autobus1",localPart = "ModificarClientequest")

	@ResponsePayload
	public ModificarClienteResponse  getModificarCliente( @RequestPayload  ModificarClienteRequest  peticion ) {
		ModificarClienteResponse IdCliente = new  ModificarClienteResponse ();
		RutaDAO Cliente =  new  ClienteDAO ( peticion . getNombreCliente (), peticion . getApellidos(), peticion . getIdCliente());
		if(Cliente.AgregarCliente()){
			IdCliente. setIdCliente ( " Se ha agregado el cliente al sistema " );
		} else {
			IdCliente. setIdCliente ( " No se ha añadido agregar la ruta al sistema " );
		}
		return IdCliente;
		
		}
	 */
	
	@PayloadRoot(namespace = "http://www.example.org/Autobus1",localPart = "EliminarClienteRequest")

	@ResponsePayload
	public EliminarClienteResponse getNombreCliente(@RequestPayload EliminarClienteRequest peticion) {
		EliminarClienteResponse NombreCliente = new EliminarClienteResponse();
		NombreCliente.setIdCliente("El Cliente a sido eliminado del sistema:" 
		+ peticion.getNombreCliente() 
		+ peticion.getApellidos() + peticion.getIdCliente());
		return NombreCliente;
	}
	
	/*
	 	 	 	@PayloadRoot(namespace = "http://www.example.org/Autobus1",localPart = "EliminarClientequest")

	@ResponsePayload
	public EliminarClienteResponse  getEliminarCliente( @RequestPayload  EliminarClienteRequest  peticion ) {
		EliminarClienteResponse IdCliente = new  EliminarClienteResponse ();
		RutaDAO Cliente =  new  ClienteDAO ( peticion . getNombreCliente (), peticion . getApellidos(), peticion . getIdCliente());
		if(Cliente.EliminarCliente()){
			IdCliente. setIdCliente ( " Se ha agregado el cliente al sistema " );
		} else {
			IdCliente. setIdCliente ( " No se ha añadido agregar la ruta al sistema " );
		}
		return IdCliente;
		
		}
	 */
	
	/* Aqui terminar el de Clientes ************************************************************************
	 * /*
	 */
	
	@PayloadRoot(namespace = "http://www.example.org/Autobus1",localPart = "AgregarBoletoRequest")

	@ResponsePayload
	public AgregarBoletoResponse getIdBoleto(@RequestPayload AgregarBoletoRequest peticion) {
		AgregarBoletoResponse respuesta= new AgregarBoletoResponse();
		respuesta.setRespuesta("El Boleto  a sido  Agregado con exito: " 
		+ peticion.getIdBoleto() 
		+ peticion.getNombreRuta() 
		+ peticion.getDestino()
		+ peticion.getNombreCliente()
		+ peticion.getTipoBoleto()
		+ peticion.getCosto()
		+ peticion.getNumAsiento());
		return respuesta;
	}
	
	/*
	 @PayloadRoot(namespace = "http://www.example.org/Autobus1",localPart = "AgregarBoletoRequest")

	@ResponsePayload
	public AgregarBoletoResponse  getAgregarBoleto ( @RequestPayload  AgregarBoletoRequest  peticion ) {
		AgregarBoletoResponse respuesta = new  AgregarBoletoResponse ();
		BoletoDAO Boleto =  new  BoletoDAO ( peticion . getIdBoleto (), peticion . getNombreRuta (), 
		peticion.getDestino() , peticion.NombreCliente(), peticion.getTipoBoleto(), peticion.getCosto(), peticion.getNumAsiento());
		if(Boleto.AgregarBoleto()){
			respuesta . setRespuesta ( " Se ha agregado la ruta "  + Ruta . getIdRuta() +" al sistema " );
		} else {
			respuesta . setRespuesta ( " No se ha añadido agregar la ruta al sistema " );
		}
		return respuesta;
	}
	 */
	
	@PayloadRoot(namespace = "http://www.example.org/Autobus1",localPart = "ConsultarBoletoRequest")

	@ResponsePayload
	public ConsultarBoletoResponse getIdBoleto(@RequestPayload ConsultarBoletoRequest peticion) {
		ConsultarBoletoResponse IdBoleto= new ConsultarBoletoResponse();
		IdBoleto.setIdBoleto("El Boleto  consultado tiene los siguientes datos: " 
		+ peticion.getIdBoleto() 
		+ peticion.getNombreRuta() 
		+ peticion.getDestino()
		+ peticion.getNombreCliente()
		+ peticion.getTipoBoleto()
		+ peticion.getCosto()
		+ peticion.getNumAsiento());
		return IdBoleto;
	}
	
	/*
	 @PayloadRoot(namespace = "http://www.example.org/Autobus1",localPart = "ConsultarBoletoRequest")

	@ResponsePayload
	public ConsultarBoletoResponse  getConsultarBoleto( @RequestPayload ConsultarBoletoRequest  peticion ) {
		ConsultarBoletoResponse IdBoleto = new  ConsultarBoletoResponse ();
		BoletoDAO Boleto =  new  BoletoDAO ( peticion . getIdBoleto (), peticion . getNombreRuta (), 
		peticion.getDestino() , peticion.NombreCliente(), peticion.getTipoBoleto(), peticion.getCosto(), peticion.getNumAsiento());
		if(Boleto.ConsultarBoleto()){
			IdBoleto . setIdBoleto( " Se ha agregado la ruta "  + Ruta . getIdRuta() +" al sistema " );
		} else {
			IdBoleto. setRespuesta ( " No se ha añadido agregar la ruta al sistema " );
		}
		return IdBoleto;
	}
	*/
	
	@PayloadRoot(namespace = "http://www.example.org/Autobus1",localPart = "CancelarBoletoRequest")

	@ResponsePayload
	public CancelarBoletoResponse getCancelarIdBoleto(@RequestPayload CancelarBoletoRequest peticion) {
		CancelarBoletoResponse IdBoleto= new CancelarBoletoResponse();
		 IdBoleto.setIdBoleto("El Boleto  a sido  Cancelado con exito: " 
				+ peticion.getIdBoleto() 
				+ peticion.getNombreRuta() 
				+ peticion.getDestino()
				+ peticion.getNombreCliente()
				+ peticion.getTipoBoleto()
				+ peticion.getCosto()
				+ peticion.getNumAsiento());
	
		return  IdBoleto;
	}
	
	
	/*
	 	 @PayloadRoot(namespace = "http://www.example.org/Autobus1",localPart = "CancelarBoletoRequest")

	@ResponsePayload
	public CancelarBoletoResponse  getCancelarBoleto( @RequestPayload CancelarBoletoRequest  peticion ) {
		CancelarBoletoResponse IdBoleto = new  CancelarBoletoResponse ();
		BoletoDAO Boleto =  new  BoletoDAO ( peticion . getIdBoleto (), peticion . getNombreRuta (), 
		peticion.getDestino() , peticion.NombreCliente(), peticion.getTipoBoleto(), peticion.getCosto(), peticion.getNumAsiento());
		if(Boleto.CancelarBoleto()){
			IdBoleto . setIdBoleto( " Se ha agregado la ruta "  + Ruta . getIdRuta() +" al sistema " );
		} else {
			IdBoleto. setRespuesta ( " No se ha añadido agregar la ruta al sistema " );
		}
		return IdBoleto;
	}
*/
}