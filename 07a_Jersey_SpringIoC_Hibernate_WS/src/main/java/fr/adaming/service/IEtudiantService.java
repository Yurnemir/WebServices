package fr.adaming.service;

import java.util.List;

import fr.adaming.dao.IEtudiantDAO;
import fr.adaming.model.Etudiant;

public interface IEtudiantService {
	
	public Etudiant getById(int idEtu);
	
	public List<Etudiant> getAll();
	
	public Etudiant addEtudiant(Etudiant etu);
	
	public Etudiant updateEtudiant(Etudiant etu);
	
	public void deleteEtudiant(Etudiant etu);

}
