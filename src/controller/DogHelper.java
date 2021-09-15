package controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Dog;


/**
 * @author Thomas Syvertsen - tjsyvertsen
 * CIS175 - Fall 2021
 * Sep 14, 2021
 */
public class DogHelper {
	static EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("DogAdoptionApp");
	
	public void insertDog(Dog dog) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(dog);
		em.getTransaction().commit();
		em.close();
	}

	public void cleanUp() {
		emfactory.close();
	}
}
