package fr.adaming.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement()//annotation jaxb pour specifier l'element racine du fichier xml correspondant � un Compte
public class Compte {
	
	private int id;
	private String nom;
	private double solde;
	public Compte() {
		super();
	}
	public Compte(String nom, double solde) {
		super();
		this.nom = nom;
		this.solde = solde;
	}
	public Compte(int id, String nom, double solde) {
		super();
		this.id = id;
		this.nom = nom;
		this.solde = solde;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
	@Override
	public String toString() {
		return "Compte [id=" + id + ", nom=" + nom + ", solde=" + solde + "]";
	}
	
	
}
