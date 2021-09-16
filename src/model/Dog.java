package model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Thomas Syvertsen - tjsyvertsen 
 * CIS175 - Fall 2021 
 * Sep 9, 2021
 */

@Entity
@Table(name = "DOG")
public class Dog {
	@Id
	@GeneratedValue
	@Column(name = "id")
	private Long id;
	@Column(name = "name")
	private String name;
	@Column(name = "demeanor")
	private String demeanor;
	@Column(name = "breed")
	private String breed;
	@Column(name = "age")
	private int age;
	//@Temporal(TemporalType.DATE)
	//@Column(name = "dateFound")
	//private Date dateFound;
	@Column(name = "location")
	private String location;


	public Dog() {
		super();
	}

	/**
	 * @param name
	 * @param demeanor
	 * @param breed
	 * @param age
	 * @param dateFound
	 */
	public Dog(String name, String demeanor, String breed, int age) {
		super();
		this.name = name;
		this.demeanor = demeanor;
		this.breed = breed;
		this.age = age;
		//this.dateFound = dateFound;
	}
	
	public String returnDogDetails() {
		return ("Name: " + this.name + " Demeanor: " + this.demeanor + " Breed: " + this.breed
				+ " Age: " + this.age + " Location: " + this.location);
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the demeanor
	 */
	public String getDemeanor() {
		return demeanor;
	}

	/**
	 * @param demeanor the demeanor to set
	 */
	public void setDemeanor(String demeanor) {
		this.demeanor = demeanor;
	}

	/**
	 * @return the breed
	 */
	public String getBreed() {
		return breed;
	}

	/**
	 * @param breed the breed to set
	 */
	public void setBreed(String breed) {
		this.breed = breed;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
}
