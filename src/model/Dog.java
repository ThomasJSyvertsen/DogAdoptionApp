package model;

import java.util.Date;

/**
 * @author Thomas Syvertsen - tjsyvertsen CIS175 - Fall 2021 Sep 9, 2021
 */
public class Dog {
	private String name;
	private String demeanor;
	private String breed;
	private int age;
	private Date dateFound;
	private int id;

	/**
	 * @param name
	 * @param date
	 * @param id
	 */
	public Dog(String name, Date date, int id) {
		this.name = name;
		this.dateFound = date;
		this.id = id;
	}

	/**
	 * @param name
	 * @param demeanor
	 * @param breed
	 * @param age
	 * @param dateFound
	 * @param id
	 */
	public Dog(String name, String demeanor, String breed, int age, Date dateFound, int id) {
		this(name, dateFound, id);
		this.demeanor = demeanor;
		this.breed = breed;
		this.age = age;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
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
	 * @return the dateFound
	 */
	public Date getDateFound() {
		return dateFound;
	}

	/**
	 * @param dateFound the dateFound to set
	 */
	public void setDateFound(Date dateFound) {
		this.dateFound = dateFound;
	}

}
