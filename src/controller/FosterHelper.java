package controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Foster;

/**
 * @author Thomas Syvertsen - tjsyvertsen
 * CIS175 - Fall 2021
 * Sep 14, 2021
 */
public class FosterHelper {
	static EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("DogAdoptionApp");
	
	public void insertFoster(Foster foster) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(foster);
		em.getTransaction().commit();
		em.close();
	}
	
	public void cleanUp() {
		emfactory.close();
	}
}
