package fr.adaming.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fr.adaming.model.Etudiant;
import fr.adaming.service.IEtudiantService;

@Path("/ecole")
@Component
public class EtudiantRest {
	
	@Autowired
	private IEtudiantService etuServ;
	
	@GET
	@Path("/etudiant")
	@Produces(MediaType.APPLICATION_JSON)
	public Etudiant getById(@QueryParam("idEtu") int id){
		return etuServ.getById(id);
	}
	
	@GET
	@Path("/etudiants")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Etudiant> getAll(){
		return etuServ.getAll();
	}
	
//	@GET
//	@Path("/addEtudiant")
//	@Produces(MediaType.APPLICATION_JSON)
//	public Etudiant addEtudiantParam(@QueryParam("nomEtu") String nom,@QueryParam("prenomEtu") String prenom,@QueryParam("ageEtu") int age){
//		return etuServ.addEtudiant(new Etudiant(nom, prenom, age));
//	}

	@POST
	@Path("/etudiant")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)//la requete se fera sous la forme d'un objet json
	public Etudiant addEtudiant(Etudiant e){
		return etuServ.addEtudiant(e);
	}
	
	@PUT
	@Path("/etudiant")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Etudiant updateEtudiant(Etudiant etu){
		return etuServ.updateEtudiant(etu);
	}
	
	@DELETE
	@Path("/etudiant")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public void deleteEtudiant(Etudiant etu){
		etuServ.deleteEtudiant(etu);
	}
	
	@DELETE
	@Path("/etudiant/{idEtu}")
	@Produces(MediaType.TEXT_PLAIN)
	public void deleteEtudiant(@PathParam("idEtu")int id){
		Etudiant delEtu = new Etudiant();
		delEtu.setId(id);
		etuServ.deleteEtudiant(delEtu);
	}
	
	@POST
	@Path("etudiant")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.APPLICATION_JSON)
	public Etudiant addEtudiant(@FormParam("nom") String nom, @FormParam("prenom") String prenom, @FormParam("age") int age){
		Etudiant addEtu = new Etudiant(nom, prenom, age);
		return etuServ.addEtudiant(addEtu);
	}
	
}
