package fr.adaming.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.adaming.dao.IEtudiantDAO;
import fr.adaming.model.Etudiant;

@Service
@Transactional
public class EtudiantServiceImpl implements IEtudiantService {
	
	@Autowired
	private IEtudiantDAO etuDAO;
	
	public void setEtuDAO(IEtudiantDAO etuDAO) {
		this.etuDAO = etuDAO;
	}

	@Override
	public Etudiant getById(int idEtu) {
		return etuDAO.getById(idEtu);
	}

	@Override
	public List<Etudiant> getAll() {
		return etuDAO.getAll();
	}

	@Override
	public Etudiant addEtudiant(Etudiant etu) {
		return etuDAO.addEtudiant(etu);
	}

	@Override
	public Etudiant updateEtudiant(Etudiant etu) {
		return etuDAO.updateEtudiant(etu);
	}

	@Override
	public void deleteEtudiant(Etudiant etu) {
		etuDAO.deleteEtudiant(etu);
	}
	
	

}
