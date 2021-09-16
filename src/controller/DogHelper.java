package controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

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
	
	public List<Dog> showAllDogs() {
		EntityManager em = emfactory.createEntityManager();
		List<Dog> allDogs = em.createQuery("SELECT i FROM Dog i").getResultList();
		return allDogs;
	}
	
	/**
	 * 
	 * @param toDelete
	 */
	public void deleteDog(Dog toDelete) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<Dog> typedQuery = em.createQuery("select dog from "
				+ "Dog dog where dog.name = :selectedName", Dog.class);
		
		//Substitute parameter with actual data from the toDelete dog
		typedQuery.setParameter("selectedName", toDelete.getName());
		
		//We only want one result
		typedQuery.setMaxResults(1);
		
		//Get the result and save it into a new Dog item
		Dog result = typedQuery.getSingleResult();
		
		//Remove it
		em.remove(result);
		em.getTransaction().commit();
		em.close();
	}
	

	/**
	 * @param toEdit
	 */
	public void updateDog(Dog toEdit) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.merge(toEdit);
		em.getTransaction().commit();
		em.close();
	}
	

	/**
	 * @param idToEdit
	 * @return
	 */
	public Dog searchForDogById(long idToEdit) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		Dog found = em.find(Dog.class, idToEdit);
		em.close();
		return found;
	}
	
	/**
	 * @param storeName
	 * @return
	 */
	public List<Dog> searchForDogByName(String dogName) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<Dog> typedQuery = em.createQuery("select dog from "
				+ "Dog dog where dog.name = :selectedName", Dog.class);
		typedQuery.setParameter("selectedName", dogName);
		
		List<Dog> foundDogs = typedQuery.getResultList();
		em.close();
		return foundDogs;
	}

	public void cleanUp() {
		emfactory.close();
	}
}
