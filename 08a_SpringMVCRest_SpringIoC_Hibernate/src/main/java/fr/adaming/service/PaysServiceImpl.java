package fr.adaming.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.adaming.dao.IPaysDAO;
import fr.adaming.model.Pays;

@Service
@Transactional
public class PaysServiceImpl implements IPaysService {

	@Autowired
	private IPaysDAO paysDAO;
	
	@Override
	public List<Pays> getAllPays() {
		return paysDAO.getAllPays();
	}

	@Override
	public Pays getPaysById(int id) {
		return paysDAO.getPaysById(id);
	}

	@Override
	public Pays addPays(Pays pays) {
		return paysDAO.addPays(pays);
	}

	@Override
	public Pays updatePays(Pays pays) {
		return paysDAO.updatePays(pays);
	}

	@Override
	public void deletePays(Pays pays) {
		paysDAO.deletePays(pays);
		
	}

}
