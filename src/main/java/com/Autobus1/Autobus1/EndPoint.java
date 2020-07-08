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
import org.example.autobus1.AgregarViajeRequest;
import org.example.autobus1.AgregarViajeResponse;
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
import org.example.autobus1.ConsultarViajeRequest;
import org.example.autobus1.ConsultarViajeResponse;
import org.example.autobus1.EliminarClienteRequest;
import org.example.autobus1.EliminarClienteResponse;
/*
import org.example.autobus1.EliminarRequest;
import org.example.autobus1.EliminarResponse;
*/
import org.example.autobus1.EliminarRutaRequest;
import org.example.autobus1.EliminarRutaResponse;
import org.example.autobus1.EliminarViajeRequest;
import org.example.autobus1.EliminarViajeResponse;
import org.example.autobus1.ModificarClienteRequest;
import org.example.autobus1.ModificarClienteResponse;
/*
import org.example.autobus1.ModificarRequest;
import org.example.autobus1.ModificarResponse;
*/
import org.example.autobus1.ModificarRutaRequest;
import org.example.autobus1.ModificarRutaResponse;
import org.example.autobus1.ModificarViajeRequest;
import org.example.autobus1.ModificarViajeResponse;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import controlador.BoletoDAO;
import controlador.ClienteDAO;
import controlador.RutaDAO;
import controlador.ViajeDAO;
/*
import controlador.BoletoDAO;
import controlador.RutaDAO;
*/
import modelo.Ruta;
import modelo.Viaje;
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
	RutaDAO Ruta =  new  RutaDAO ( peticion . getIdRuta(), peticion . getNombreRuta(),peticion .getDestino(),peticion .getFechaSalida(), 
			peticion.getHora(), peticion .getCosto() , peticion .getNumAsiento());
	if(Ruta.AgregarRuta()){
		respuesta . setRespuesta ( " Se  agrego con exito la ruta al sistema " + Ruta.getNombreRuta() +"" );
	} else {
		respuesta . setRespuesta ( " No se ha añadido la ruta   al sistema "  + Ruta.getNombreRuta()
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
			respuesta.setDestino(r.getDestino());
			respuesta.setFechaSalida( r.getFechaSalida());
			respuesta.setHora( r.getHora());
			respuesta.setCosto( r.getCosto());
			respuesta.setNumAsiento( r.getNumAsiento());
			
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
	/*
	
	
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
	}*/
	


	@PayloadRoot(namespace = "http://www.example.org/Autobus1",localPart = "ModificarRutaRequest")
	@ResponsePayload
	public ModificarRutaResponse getModificarRuta(@RequestPayload ModificarRutaRequest peticion) {
		ModificarRutaResponse respuesta = new ModificarRutaResponse();
		RutaDAO ruta= new RutaDAO(peticion . getIdRuta(), peticion . getNombreRuta(),peticion .getDestino(),peticion .getFechaSalida(), 
				peticion.getHora(), peticion .getCosto() , peticion .getNumAsiento());
		if (ruta.verificarIdRuta()) {
			if (ruta.ModificarRuta()) {
				respuesta.setIdRuta("Se ha actualizado la ruta"+ruta.getIdRuta()+ " " + ruta.getNombreRuta() + " en el sistema");
			} else {
				respuesta.setIdRuta("No se ha podido actualizar la Ruta ");
				}
		
		
	}
	
		return respuesta;
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
			respuesta . setRespuesta ( " Se ha agregado el cliente  " + Cliente.getNombreCliente() + "" + Cliente.getApellidos()
			+ "");
		} else {
			respuesta . setRespuesta ( " No se ha añadido el cliente  al sistema " + Cliente.getNombreCliente() + "" + Cliente.getApellidos()
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
		ModificarClienteResponse respuesta = new  ModificarClienteResponse ();
		ClienteDAO Cliente =  new  ClienteDAO ( peticion . getNombreCliente (), peticion . getApellidos(), peticion . getIdCliente());
		
			if(Cliente.modificarCliente()) {
			 respuesta.setRespuesta( " Se a modificado el cliente " );
		} else {
			 respuesta.setRespuesta( " No se pudo modificar el cliente intente de nuevo  " );
		}
		
	
		return  respuesta;
		
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
		BoletoDAO Boleto =  new  BoletoDAO ( peticion . getId () ,
				peticion.getDestino(),peticion.getFechaSalida(),peticion.getHora(),peticion.getNombreCliente(),
				peticion.getTipoBoleto(),peticion.getCosto(),peticion.getNumAsiento());
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
			BoletoDAO boleto =  new  BoletoDAO ( peticion . getId ());
			
			Boleto b = boleto.ConsultarBoleto();
			
			if(b != null){
				respuesta.setId (b.getId());
				respuesta.setDestino(b.getDestino());
				respuesta.setFechaSalida(b.getFechaSalida());
				respuesta.setHora(b.getHora());
				respuesta.setNombreCliente(b.getNombreCliente());
				respuesta.setTipoBoleto(b.getDestino());
				respuesta.setCosto(b.getCosto());
				respuesta.setNumAsiento(b.getNumAsiento());
			
			} else {
				respuesta. setId ( " No se pudo consultar el boleto intente mas tarde " );
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
		BoletoDAO Boleto =  new  BoletoDAO ( peticion . getId ());
		if(Boleto.CancelarBoleto()){
			respuesta.setRespuesta ( " Se ha cancelado el boleto"  + Boleto.getId());
		} else {
			respuesta.setRespuesta ( " No se ha podido cancelar el boleto del sistema" );
		}
		return respuesta;
	}

	 	 
	 /*	 ********************** Viajes****************************************/
	 	 
	

	  	@PayloadRoot(namespace = "http://www.example.org/Autobus1",localPart = "AgregarViajeRequest")

	 @ResponsePayload
	 public AgregarViajeResponse  getAgregarViaje( @RequestPayload  AgregarViajeRequest  peticion ) {
	 	AgregarViajeResponse respuesta = new  AgregarViajeResponse ();
	 	ViajeDAO Viaje =  new  ViajeDAO ( peticion . getId(),peticion .getDestino(),peticion .getFechaSalida(), 
	 			peticion.getHora(),peticion.getNombreCliente(), peticion .getCosto() , peticion .getNumAsiento());
	 	if(Viaje.AgregarViaje()){
	 		respuesta . setRespuesta ( " Se  agrego con exito el Viaje al sistema " );
	 	} else {
	 		respuesta . setRespuesta ( " No se ha añadido el Viaje al sistema " 
	 		+ "");
	 	}
	 	return respuesta;
	 	
	 	}
	  
	 	
	 
	 	
	 	
	 	@PayloadRoot(namespace = "http://www.example.org/Autobus1",localPart = "ConsultarViajeRequest")

	 	@ResponsePayload
	 	public ConsultarViajeResponse  getConsultarViaje( @RequestPayload  ConsultarViajeRequest  peticion ) {
	 		ConsultarViajeResponse respuesta = new  ConsultarViajeResponse ();
	 		ViajeDAO viaje =  new  ViajeDAO ( peticion . getId ());
	 		
	 		Viaje v = viaje.ConsultarId();
	 		if(v != null){
	 			respuesta.setId (v.getId());  	
	 		
	 			respuesta.setDestino(v.getDestino());
	 			respuesta.setFechaSalida( v.getFechaSalida());
	 			respuesta.setHora( v.getHora());
	 			respuesta.setNombreCliente( v.getNombreCliente());
	 			respuesta.setCosto( v.getCosto());
	 			respuesta.setNumAsiento( v.getNumAsiento());
	 			
	 		} else {
	 			respuesta. setId ( " No se pudo consultar el viaje intente mas tarde " );
	 		}
	 		return respuesta;
	 	}
	 	
	 
	
	 	
	 	@PayloadRoot(namespace = "http://www.example.org/Autobus1",localPart = "EliminarViajeRequest")

	 	@ResponsePayload
	 	public EliminarViajeResponse  getEliminarViaje ( @RequestPayload  EliminarViajeRequest  peticion ) {
	 		EliminarViajeResponse respuesta = new  EliminarViajeResponse ();
	 		ViajeDAO  Viaje =  new  ViajeDAO ( peticion . getId ());
	 		if(Viaje.EliminarViaje()){
	 			respuesta.setRespuesta ( " Se elimino el viaje del sistema" );
	 		} else {
	 			respuesta.setRespuesta ( " No se puedo eliminar el viaje del sistema " );
	 		}
	 		return respuesta;
	 	}
	 	



	 	@PayloadRoot(namespace = "http://www.example.org/Autobus1",localPart = "ModificarViajeRequest")
	 	@ResponsePayload
	 	public ModificarViajeResponse getModificarViaje(@RequestPayload ModificarViajeRequest peticion) {
	 		ModificarViajeResponse respuesta = new ModificarViajeResponse();
	 		ViajeDAO viaje = new ViajeDAO(peticion . getId(),peticion .getDestino(),peticion .getFechaSalida(), 
	 				peticion.getHora(),peticion.getNombreCliente(), peticion .getCosto() , peticion .getNumAsiento());
	 		
	 			if (viaje.ModificarViaje()) {
	 				respuesta.setRespuesta("Se ha actualizado el viaje "+viaje.getId()+  " en el sistema");
	 			} else {
	 				respuesta.setRespuesta("No se ha podido actualizar el viaje");
	 				}
	 		
	 		
	 	
	 	
	 		return respuesta;
	 	}
	 	
	 	 
	 	 
	 	 
	 	 
	 	 
	 	 
}