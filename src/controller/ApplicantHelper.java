package controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Applicant;


/**
 * @author Thomas Syvertsen - tjsyvertsen
 * CIS175 - Fall 2021
 * Sep 14, 2021
 */
public class ApplicantHelper {
	static EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("DogAdoptionApp");
	
	public void insertApplicant(Applicant app) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(app);
		em.getTransaction().commit();
		em.close();
	}
	
	public void cleanUp() {
		emfactory.close();
	}
}
