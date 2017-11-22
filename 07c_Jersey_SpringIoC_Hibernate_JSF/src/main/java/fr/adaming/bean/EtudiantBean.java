package fr.adaming.bean;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import fr.adaming.model.Etudiant;
import fr.adaming.rest.IEtudiantWebService;

@ManagedBean(name="etuMB")
@RequestScoped
public class EtudiantBean {
	
	private Etudiant etudiant;
	
	private List<Etudiant> liste;
	
	@ManagedProperty("#{etuWebService}")
	private IEtudiantWebService etuWS;
	
	@PostConstruct
	public void init(){
		System.out.println("Test");
		liste = etuWS.getEtudiants();
	}
	
	public EtudiantBean() {
		super();
		etudiant = new Etudiant();
	}

	//GetSetters
	public Etudiant getEtudiant() {
		return etudiant;
	}

	public void setEtudiant(Etudiant etudiant) {
		this.etudiant = etudiant;
	}

	public List<Etudiant> getListe() {
		return liste;
	}

	public void setListe(List<Etudiant> liste) {
		this.liste = liste;
	}

	public IEtudiantWebService getEtuWS() {
		return etuWS;
	}

	public void setEtuWS(IEtudiantWebService etuWS) {
		this.etuWS = etuWS;
	}
	
	//methodes metier
	public String addEtudiant(){	
		this.etudiant = etuWS.addEtudiant(etudiant);
		liste = etuWS.getEtudiants();
		return "ajout";
	}
	
	public String getEtudiantById(){
		System.out.println(etudiant);
		this.etudiant = etuWS.getEtudiantById(etudiant.getId());
		return "recherche";
	}
	
	public String modEtudiant(){
		this.etudiant = etuWS.updateEtudiant(etudiant);
		liste = etuWS.getEtudiants();
		return "modifier";
	}

	public String delEtudiant(){
		etuWS.deleteEtudiant(etudiant);
		liste = etuWS.getEtudiants();
		return "supprimer";
	}
}
