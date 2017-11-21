package fr.adaming.rest;

import java.util.List;

import fr.adaming.model.Etudiant;

public interface IEtudiantWebService {

	public Etudiant getEtudiantById(int id);
	
	public List<Etudiant> getEtudiants();
	
	public Etudiant addEtudiant(Etudiant etu);
	
	public Etudiant updateEtudiant(Etudiant etu);
	
	public void deleteEtudiant(Etudiant etu);
}
