package fr.adaming.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import fr.adaming.model.Employe;

@Path("/ssii")
public class EmployeREST {

	@GET
	@Path("/employe/{pId}")
	@Produces(MediaType.APPLICATION_JSON)//application_XML, avec ajout des annotation jaxb dans Employe
	public Employe getEmployeById (@PathParam("pId") int id){
		return new Employe(id,"Toto","Titi");
	}
	
	@GET
	@Path("/employes/json")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Employe> getAllEmployeJSON(){
		List<Employe> liste = new ArrayList<Employe>();
		
		liste.add(new Employe(1,"Toto" , "Titi"));
		liste.add(new Employe(2,"Roro" , "Riri"));
		liste.add(new Employe(3,"Fofo" , "Fifi"));
		liste.add(new Employe(4,"Yoyo" , "Yiyi"));
		
		return liste;
	}
	
	@GET
	@Path("/employes/xml")
	@Produces(MediaType.APPLICATION_XML)
	public List<Employe> getAllEmployeXML(){
		List<Employe> liste = new ArrayList<Employe>();
		
		liste.add(new Employe(1,"Toto" , "Titi"));
		liste.add(new Employe(2,"Roro" , "Riri"));
		liste.add(new Employe(3,"Fofo" , "Fifi"));
		liste.add(new Employe(4,"Yoyo" , "Yiyi"));
		
		return liste;
	}
	
}
