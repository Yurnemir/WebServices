package fr.adaming.dao;

import java.util.List;

import fr.adaming.model.Etudiant;

public interface IEtudiantDAO {

	public Etudiant getById(int idEtu);

	public List<Etudiant> getAll();

	public Etudiant addEtudiant(Etudiant etu);
	
	public Etudiant updateEtudiant(Etudiant etu);
	
	public void deleteEtudiant(Etudiant etu);
}
