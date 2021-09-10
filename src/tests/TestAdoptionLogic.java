package tests;

import model.AdoptionLogic;
import model.Applicant;
import model.Dog;
import model.Shelter;

import java.util.*;
import org.junit.Before;
import org.junit.Test;
import java.util.Date;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author Thomas Syvertsen - tjsyvertsen
 * CIS175 - Fall 2021
 * Sep 9, 2021
 */
public class TestAdoptionLogic {
	Date date = new Date();
	Dog dog1 = new Dog("Dash", date, 1);
	Dog dog2 = new Dog("Bolt", date, 2);
	ArrayList<Dog> dogs = new ArrayList<Dog>();	
	Shelter shelter;
	Applicant applicant;
	AdoptionLogic aL1;
	
	@Before
	public void setUp() throws Exception {
		dogs.add(dog1);
		dogs.add(dog2);
		shelter = new Shelter("Ames Dog Shelter", "123 main", dogs, 10, dogs.size());
		applicant = new Applicant("Bob", "Danger", "221b baker st", dogs);
		aL1 = new AdoptionLogic(dog1, shelter, applicant);
	}
	
	@Test
	public void testLocate1() {
		assertEquals("123 main", aL1.locate());
	}
	
	@Test
	public void testLocate2() {
		aL1.approve();
		assertEquals("221b baker st", aL1.locate());
	}
	
	@Test
	public void approve1() {
		aL1.approve();
		assertTrue(aL1.getCompleted());
	}
	
	@Test
	public void approve2() {
		assertFalse(aL1.getCompleted());
	}
	
	@Test
	public void meet() {
		assertEquals(aL1.getDog().getName() + " is meeting " + aL1.getApplicant().getfName() + "!", aL1.meet());
	}
	
}
