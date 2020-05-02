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

import controlador.BoletoDAO;
import controlador.ClienteDAO;
import controlador.RutaDAO;
/*
import controlador.BoletoDAO;
import controlador.RutaDAO;
*/
import modelo.Ruta;
import modelo.Boleto;
import modelo.Cliente;




@Endpoint
public class EndPoint {
	
	/*
	@PayloadRoot(namespace = "http://www.example.org/Autobus1",localPart = "AgregarRutaRequest")

	@ResponsePayload
	public AgregarRutaResponse getNombreRuta(@RequestPayload AgregarRutaRequest peticion) {
		AgregarRutaResponse respuesta= new AgregarRutaResponse();
		respuesta.setRespuesta( "La ruta a sido agregada con exito" +peticion.getIdRuta() 
		+ peticion.getNombreRuta());
		return respuesta;
	}
	*/
	
	
		
	
	

 	@PayloadRoot(namespace = "http://www.example.org/Autobus1",localPart = "AgregarRutaRequest")

@ResponsePayload
public AgregarRutaResponse  getAgregarRuta( @RequestPayload  AgregarRutaRequest  peticion ) {
	AgregarRutaResponse respuesta = new  AgregarRutaResponse ();
	RutaDAO Ruta =  new  RutaDAO ( peticion . getIdRuta(), peticion . getNombreRuta());
	if(Ruta.AgregarRuta()){
		respuesta . setRespuesta ( " Se ha agregado la ruta al sistema " + Ruta.getIdRuta() + "" + Ruta.getNombreRuta()
		+ "");
	} else {
		respuesta . setRespuesta ( " No se ha añadido la ruta   al sistema "  + Ruta.getIdRuta() + "" + Ruta.getNombreRuta()
		+ "");
	}
	return respuesta;
	
	}
 
	
	
	
	
	/*
	
	@PayloadRoot(namespace = "http://www.example.org/Autobus1",localPart ="ConsultarRutaRequest")

	@ResponsePayload
	
	public ConsultarRutaResponse getNombreRuta (@RequestPayload ConsultarRutaRequest peticion) {
		ConsultarRutaResponse NombreRuta= new ConsultarRutaResponse();
		NombreRuta.setNombreRuta("La ruta Consultada es: " + peticion.getNombreRuta() + peticion.getIdRuta());
		return NombreRuta;

	}
	*/
	
	
	@PayloadRoot(namespace = "http://www.example.org/Autobus1",localPart = "ConsultarRutaRequest")

	@ResponsePayload
	public ConsultarRutaResponse  getConsultarRuta ( @RequestPayload  ConsultarRutaRequest  peticion ) {
		ConsultarRutaResponse respuesta = new  ConsultarRutaResponse ();
		RutaDAO ruta =  new  RutaDAO ( peticion . getIdRuta ());
		
		Ruta r = ruta.ConsultarIdRuta();
		if(r != null){
			respuesta.setIdRuta (r.getIdRuta());  	
			respuesta.setNombreRuta(r.getNombreRuta());
		} else {
			respuesta. setNombreRuta ( " No se pudo consultar la ruta intente mas tarde " );
		}
		return respuesta;
	}
	
	/*
	 * @PayloadRoot(namespace = "http://www.example.org/Hotel",localPart = "MostrarClienteRequest")
	@ResponsePayload
	public MostrarClienteResponse getConsultarCliente (@RequestPayload MostrarClienteRequest peticion) {
		MostrarClienteResponse respuesta = new MostrarClienteResponse();
		ClientesDao cliente = new ClientesDao(peticion.getIdCliente());
		
		Cliente c = cliente.MostrarCliente(peticion.getIdCliente());
		
		
		if (c != null) {
			respuesta.setNombre(c.getNombre());
			respuesta.setApellido(c.getApellido());
			respuesta.setCorreo(c.getCorreo());
			respuesta.setTelefono(c.getTelefono());
			respuesta.setTipoPago(c.getTipoPago());
		}
		
		return respuesta;
	}
	 */
	
	
	/*
	
	@PayloadRoot(namespace = "http://www.example.org/Autobus1",localPart ="EliminarRutaRequest")

	@ResponsePayload
	  
	public EliminarRutaResponse getIdRuta(@RequestPayload EliminarRutaRequest peticion) {
		EliminarRutaResponse IdRuta  =  new EliminarRutaResponse();
		IdRuta.setNombreRuta("La ruta a sido eliminada: " + peticion.getNombreRuta() + peticion.getIdRuta());
		return IdRuta;
	}
	*/
	
	@PayloadRoot(namespace = "http://www.example.org/Autobus1",localPart = "EliminarRutaRequest")

	@ResponsePayload
	public EliminarRutaResponse  getEliminarRuta ( @RequestPayload  EliminarRutaRequest  peticion ) {
		EliminarRutaResponse respuesta = new  EliminarRutaResponse ();
		RutaDAO Ruta =  new  RutaDAO ( peticion . getIdRuta ());
		if(Ruta.EliminarRuta()){
			respuesta.setRespuesta ( " Se elimino la ruta  del sistema" );
		} else {
			respuesta.setRespuesta ( " No se puedo eliminar la ruta del sistema " );
		}
		return respuesta;
	}
	
	/*
	 * 
	 */
	
	/*
	@PayloadRoot(namespace = "http://www.example.org/Autobus1",localPart ="ModificarRutaRequest")

	@ResponsePayload
	
	public ModificarRutaResponse getNombreRuta(@RequestPayload ModificarRutaRequest peticion) {
		ModificarRutaResponse NombreRuta= new ModificarRutaResponse();
		NombreRuta.setNombreRuta("La ruta a sido Modificada: " + peticion.getNombreRuta() + peticion.getIdRuta());
		return NombreRuta;
	}
	
	*/
	
	
	
	@PayloadRoot(namespace = "http://www.example.org/Autobus1",localPart = "ModificarRutaRequest")

	@ResponsePayload
	public ModificarRutaResponse  getModificarRuta ( @RequestPayload  ModificarRutaRequest  peticion ) {
		ModificarRutaResponse IdRuta = new  ModificarRutaResponse ();
		RutaDAO Ruta =  new  RutaDAO ( peticion . getIdRuta (), peticion . getNombreRuta ());
		if(Ruta.ModificarRuta()){
			IdRuta . setIdRuta( " Se modifico la ruta "  + Ruta . getIdRuta() + Ruta.getNombreRuta() + " al sistema " );
		} else {
			IdRuta . setIdRuta ( " No se pudo modificar  la ruta del  sistema " );
		}
		return IdRuta;
	}
	
	
	
/* Aqui terminar el de RUtas ************************************************************************
 * /*
 */
	/*
	@PayloadRoot(namespace = "http://www.example.org/Autobus1",localPart = "AgregarClienteRequest")

	@ResponsePayload
	public AgregarClienteResponse getNombreCliente(@RequestPayload AgregarClienteRequest peticion) {
		AgregarClienteResponse respuesta= new AgregarClienteResponse();
		respuesta.setRespuesta("El cliente  a sido  Agregado con exito: " 
		+ peticion.getNombreCliente() 
		+ peticion.getApellidos() + peticion.getIdCliente());
		return respuesta;
	}*/
	
	
	
	 	@PayloadRoot(namespace = "http://www.example.org/Autobus1",localPart = "AgregarClienteRequest")

	@ResponsePayload
	public AgregarClienteResponse  getAgregarCliente ( @RequestPayload  AgregarClienteRequest  peticion ) {
		AgregarClienteResponse respuesta = new  AgregarClienteResponse ();
		ClienteDAO Cliente =  new  ClienteDAO ( peticion . getNombreCliente (), peticion . getApellidos(), peticion . getIdCliente());
		if(Cliente.AgregarCliente()){
			respuesta . setRespuesta ( " Se ha agregado el cliente al sistema " + Cliente.getNombreCliente() + "" + Cliente.getApellidos()
			+ "");
		} else {
			respuesta . setRespuesta ( " No se ha añadido agregar el cliente  al sistema " + Cliente.getNombreCliente() + "" + Cliente.getApellidos()
			+ "");
		}
		return respuesta;
		
		}
	 
	
	/*
	
	
	@PayloadRoot(namespace = "http://www.example.org/Autobus1",localPart = "ConsultarClienteRequest")

	@ResponsePayload
	public ConsultarClienteResponse getNombreCliente(@RequestPayload ConsultarClienteRequest peticion) {
		ConsultarClienteResponse NombreCliente = new ConsultarClienteResponse();
		NombreCliente.setIdCliente("El Cliente que consulto es:" 
		+ peticion.getNombreCliente() 
		+ peticion.getApellidos() + peticion.getIdCliente());
		return NombreCliente;

	}*/
	 	
/*
	
	 	@PayloadRoot(namespace = "http://www.example.org/Autobus1",localPart = "ConsultarClienteRequest")

	@ResponsePayload
	public ConsultarClienteResponse  getConsultarCliente( @RequestPayload  ConsultarClienteRequest  peticion ) {
		ConsultarClienteResponse IdCliente = new  ConsultarClienteResponse ();
		ClienteDAO Cliente =  new  ClienteDAO ( peticion . getNombreCliente (), peticion .getApellidos(), peticion . getIdCliente());
		if(Cliente.ConsultarCliente()){
			IdCliente. setIdCliente ( " El cliente que consulto es: "+ Cliente.getIdCliente() + Cliente .getNombreCliente() + Cliente .getApellidos());
		} else {
			IdCliente. setIdCliente ( " No se pudo consultar el cliente, intente de nuevo" );
		}
		return IdCliente;
		
		}*/
	 	
	 	
		@PayloadRoot(namespace = "http://www.example.org/Autobus1",localPart = "ConsultarClienteRequest")

		@ResponsePayload
		public ConsultarClienteResponse  getConsultarCliente ( @RequestPayload  ConsultarClienteRequest  peticion ) {
			ConsultarClienteResponse respuesta = new  ConsultarClienteResponse ();
			ClienteDAO cliente =  new  ClienteDAO ( peticion . getIdCliente ());
			
			Cliente c = cliente.ConsultarCliente();
			
			if(c != null){
				respuesta.setIdCliente (c.getIdCliente());  	
				respuesta.setNombreCliente(c.getNombreCliente());
				respuesta.setApellidos(c.getApellidos());
			} else {
				respuesta. setNombreCliente ( " No se pudo consultar Cliente intente mas tarde " );
			}
			return respuesta;
		}
	 
	 	
	 	
	 	/*
	 	
	@PayloadRoot(namespace = "http://www.example.org/Autobus1",localPart = "ModificarClienteRequest")

	@ResponsePayload
	public ModificarClienteResponse getNombreCliente(@RequestPayload ModificarClienteRequest peticion) {
		ModificarClienteResponse NombreCliente = new ModificarClienteResponse();
		NombreCliente.setIdCliente("El cliente a sido modificado:" 
		+ peticion.getNombreCliente() 
		+ peticion.getApellidos() + peticion.getIdCliente());
		return NombreCliente;
	}
	*/
	
	 	 	@PayloadRoot(namespace = "http://www.example.org/Autobus1",localPart = "ModificarClienteRequest")

	@ResponsePayload
	public ModificarClienteResponse  getModificarCliente( @RequestPayload  ModificarClienteRequest  peticion ) {
		ModificarClienteResponse IdCliente = new  ModificarClienteResponse ();
		ClienteDAO Cliente =  new  ClienteDAO ( peticion . getNombreCliente (), peticion . getApellidos(), peticion . getIdCliente());
		if(Cliente.modificarCliente()){
			IdCliente. setIdCliente ( " Se a modificado el cliente " );
		} else {
			IdCliente. setIdCliente ( " No se pudo modificar el cliente intente de nuevo  " );
		}
		return IdCliente;
		
		}
	 
	
	 	 	/*
	@PayloadRoot(namespace = "http://www.example.org/Autobus1",localPart = "EliminarClienteRequest")

	@ResponsePayload
	public EliminarClienteResponse getNombreCliente(@RequestPayload EliminarClienteRequest peticion) {
		EliminarClienteResponse NombreCliente = new EliminarClienteResponse();
		NombreCliente.setIdCliente("El Cliente a sido eliminado del sistema:" 
		+ peticion.getNombreCliente() 
		+ peticion.getApellidos() + peticion.getIdCliente());
		return NombreCliente;
	}*/
	
	
	 	 	 	@PayloadRoot(namespace = "http://www.example.org/Autobus1",localPart = "EliminarClienteRequest")

	@ResponsePayload
	public EliminarClienteResponse  getEliminarCliente( @RequestPayload  EliminarClienteRequest  peticion ) {
		EliminarClienteResponse respuesta = new  EliminarClienteResponse ();
		ClienteDAO Cliente =  new  ClienteDAO ( peticion.getIdCliente());
		if(Cliente.eliminarCliente()){
			respuesta.setRespuesta( " Se ha eliminado el cliente del sistema " );
		} else {
			respuesta.setRespuesta ( " No se pudo eliminar  el cliente del  sistema " );
		}
		return respuesta;
		
		}
	 
	
	/* Aqui terminar el de Clientes ************************************************************************
	 * 		ClienteDAO Cliente =  new  ClienteDAO ( peticion . getNombreCliente (), peticion . getApellidos(), peticion . getIdCliente());

	 */
	  /*
	 */
	
	
	/*
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
	*/
	
	
	 	@PayloadRoot(namespace = "http://www.example.org/Autobus1",localPart = "AgregarBoletoRequest")

	@ResponsePayload
	public AgregarBoletoResponse  getAgregarBoleto ( @RequestPayload  AgregarBoletoRequest  peticion ) {
		AgregarBoletoResponse respuesta = new  AgregarBoletoResponse ();
		BoletoDAO Boleto =  new  BoletoDAO ( peticion . getIdBoleto () , peticion . getNombreRuta(), peticion . getDestino(), peticion.getNombreCliente(),
				peticion.getTipoBoleto(), peticion.getCosto(), peticion.getNumAsiento());
		if(Boleto.AgregarBoleto()){
			respuesta . setRespuesta ( " Se ha agregado el boleto al sistema ");
		} else {
			respuesta . setRespuesta ( " No se ha añadio el boleto   al sistema ");
		}
		return respuesta;
		
		}
	
	 
	/*
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
	}*/
	
	/*
	 @PayloadRoot(namespace = "http://www.example.org/Autobus1",localPart = "ConsultarBoletoRequest")

	@ResponsePayload
	public ConsultarBoletoResponse  getConsultarBoleto( @RequestPayload ConsultarBoletoRequest  peticion ) {
		ConsultarBoletoResponse IdBoleto = new  ConsultarBoletoResponse ();
		BoletoDAO Boleto =  new  BoletoDAO ( peticion .getIdBoleto (), peticion . getNombreRuta (), 
		peticion.getDestino() , peticion.NombreCliente(), peticion.getTipoBoleto(), peticion.getCosto(), peticion.getNumAsiento());
		if(Boleto.ConsultarIdBoleto()){
			IdBoleto . setIdBoleto( " El boleto consultado es : "  + Boleto.getIdBoleto()+"" + Boleto.getNombreRuta() + "" + Boleto.getDestino() + "" + 
		Boleto.getNombreCliente() + "" + Boleto.getTipoBoleto() + "" + Boleto.getCosto() + "" + Boleto.getNumAsiento());
		} else {
			IdBoleto. setIdBoleto ( " No se pudo consultar el boleto , intente de nuevo " );
		}
		return IdBoleto;
	}*/
	 	
	 	
	 	
	 	@PayloadRoot(namespace = "http://www.example.org/Autobus1",localPart = "ConsultarBoletoRequest")

		@ResponsePayload
		public ConsultarBoletoResponse  getConsultarBoleto ( @RequestPayload  ConsultarBoletoRequest  peticion ) {
			ConsultarBoletoResponse respuesta = new  ConsultarBoletoResponse ();
			BoletoDAO boleto =  new  BoletoDAO ( peticion . getIdBoleto ());
			
			Boleto b = boleto.ConsultarBoleto();
			
			if(b != null){
				respuesta.setIdBoleto (b.getIdBoleto());
				respuesta.setNombreRuta(b.getNombreRuta());
				respuesta.setDestino(b.getDestino());
				respuesta.setNombreCliente(b.getNombreCliente());
				respuesta.setTipoBoleto(b.getDestino());
				respuesta.setCosto(b.getCosto());
				respuesta.setNumAsiento(b.getNumAsiento());
			
			} else {
				respuesta. setIdBoleto ( " No se pudo consultar Cliente intente mas tarde " );
			}
			return respuesta;
		}
	 
	 	
	 	
	 	
	
	
	/*
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
	*/
	
	
	 	 @PayloadRoot(namespace = "http://www.example.org/Autobus1",localPart = "CancelarBoletoRequest")

	@ResponsePayload
	public CancelarBoletoResponse  getCancelarBoleto( @RequestPayload CancelarBoletoRequest  peticion ) {
		CancelarBoletoResponse respuesta= new  CancelarBoletoResponse ();
		BoletoDAO Boleto =  new  BoletoDAO ( peticion . getIdBoleto ());
		if(Boleto.CancelarBoleto()){
			respuesta.setRespuesta ( " Se ha cancelado el boleto"  + Boleto.getIdBoleto());
		} else {
			respuesta.setRespuesta ( " No se ha podido cancelar el boleto del sistema" );
		}
		return respuesta;
	}

}