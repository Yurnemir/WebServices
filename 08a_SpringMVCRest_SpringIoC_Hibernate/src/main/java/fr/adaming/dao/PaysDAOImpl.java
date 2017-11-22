package fr.adaming.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import fr.adaming.model.Pays;

@Repository
public class PaysDAOImpl implements IPaysDAO {
	
	@Autowired
	private SessionFactory sf;

	@Override
	public List<Pays> getAllPays() {
		//requete simple pour obtenir tous les éléments
		String req = "FROM Pays";
		
		//création de l'objet requete
		Query query = sf.getCurrentSession().createQuery(req);

		//recuperation et retour de la liste
		return query.list();
	}

	@Override
	public Pays getPaysById(int id) {
		return (Pays) sf.getCurrentSession().get(Pays.class, id);
	}

	@Override
	public Pays addPays(Pays pays) {
		sf.getCurrentSession().save(pays);
		return pays;
	}

	@Override
	public Pays updatePays(Pays pays) {
		sf.getCurrentSession().update(pays);
		return pays;
	}

	@Override
	public void deletePays(Pays pays) {
		sf.getCurrentSession().delete(pays);
	}

}
