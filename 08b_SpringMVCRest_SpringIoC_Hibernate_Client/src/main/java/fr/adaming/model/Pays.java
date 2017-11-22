package fr.adaming.model;

import java.io.Serializable;

public class Pays implements Serializable {


	private int id;
	private String nom;
	private String capitale;
	private long population;
	public Pays() {
		super();
	}
	public Pays(String nom, String capitale, long population) {
		super();
		this.nom = nom;
		this.capitale = capitale;
		this.population = population;
	}
	public Pays(int id, String nom, String capitale, long population) {
		super();
		this.id = id;
		this.nom = nom;
		this.capitale = capitale;
		this.population = population;
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
	public String getCapitale() {
		return capitale;
	}
	public void setCapitale(String capitale) {
		this.capitale = capitale;
	}
	public long getPopulation() {
		return population;
	}
	public void setPopulation(long population) {
		this.population = population;
	}
	@Override
	public String toString() {
		return "Pays [id=" + id + ", nom=" + nom + ", capitale=" + capitale + ", population=" + population + "]";
	}
}
