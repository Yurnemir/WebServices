package fr.adaming.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import fr.adaming.model.Etudiant;

@Repository
public class EtudiantDAOImpl implements IEtudiantDAO{
	
	@Autowired
	private SessionFactory sf;

	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}

	@Override
	public Etudiant getById(int idEtu) {
		if (idEtu!=0){
			Etudiant etuOut = (Etudiant) sf.getCurrentSession().get(Etudiant.class, idEtu);
			System.out.println(etuOut);
			return etuOut;
		} else {
			return null;
		}
	}

	@Override
	public List<Etudiant> getAll() {
		String requete = "FROM Etudiant";
		
		Query query =  sf.getCurrentSession().createQuery(requete);
		List<Etudiant> listeOut = query.list();
		
		if(listeOut.size()!=0){
			return listeOut;
		} else {
			return null;
		}
	}

	@Override
	public Etudiant addEtudiant(Etudiant etu) {
		sf.getCurrentSession().save(etu);
		return etu;
	}

	@Override
	public Etudiant updateEtudiant(Etudiant etu) {
		sf.getCurrentSession().saveOrUpdate(etu);
		return etu;
	}

	@Override
	public void deleteEtudiant(Etudiant etu) {
		sf.getCurrentSession().delete(etu);
	}

}
