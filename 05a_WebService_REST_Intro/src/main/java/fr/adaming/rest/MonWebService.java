package fr.adaming.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/salutation")
public class MonWebService {
	
	@Path("/tous")
	@GET
	@Produces(MediaType.TEXT_PLAIN) //specifie le format que produit la méthode
	public String disBonjour(){
		
		return "Bonjour tout le monde";
	}
	
	@Path("/html/{pNom}")
	@GET
	@Produces(MediaType.TEXT_HTML)//PathParam: parametre en /valeur/
	public String disBonjourPathHTML(@PathParam("pNom") String nom ){
		return "<h1>Bonjour "+nom+"</h1>";
	}
	
	@Path("/xml")
	@GET
	@Produces(MediaType.TEXT_XML)//QueryParam: parametres en ?param=valeur
	public String disBonjourQueryHTML(@QueryParam("pNom") String nom ){
		return "<salutation>Bonjour "+nom+"</salutation>";
	}
	
	
}
