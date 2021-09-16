package controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Shelter;


/**
 * @author Thomas Syvertsen - tjsyvertsen
 * CIS175 - Fall 2021
 * Sep 14, 2021
 */
public class ShelterHelper {
	static EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("DogAdoptionApp");
	
	public void insertShelter(Shelter shelter) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(shelter);
		em.getTransaction().commit();
		em.close();
	}
	
	public void cleanUp() {
		emfactory.close();
	}
}
