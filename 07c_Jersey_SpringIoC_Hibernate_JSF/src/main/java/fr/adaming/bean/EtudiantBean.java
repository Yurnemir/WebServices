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
		etudiant = new Etudiant();
		liste = etuWS.getEtudiants();
	}

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

}
