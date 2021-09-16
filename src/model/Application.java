package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

/**
 * @author Thomas Syvertsen - tjsyvertsen 
 * CIS175 - Fall 2021 
 * Sep 14, 2021
 */

@Entity
@Table(name = "APPLICATION")
public class Application {
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
	@JoinColumn(name = "DOG")
	private Dog dog;
    @JoinColumn(name = "SHELTER")
	private Shelter shelter;
    @JoinColumn(name = "FOSTER")
	private Foster foster;
    @JoinColumn(name = "APPLICANT")
	private Applicant applicant;
	@JoinColumn(name = "COMPLETED")
	private boolean completed;
	
	
	public Application() {
		super();
	}

	/**
	 * @param dog
	 * @param shelter
	 * @param foster
	 * @param applicant
	 * @param completed
	 */
	public Application(Dog dog, Shelter shelter, Foster foster, Applicant applicant) {
		super();
		this.dog = dog;
		this.shelter = shelter;
		this.foster = foster;
		this.applicant = applicant;
		this.updateLocation();
	}
	
	public String updateLocation() {
		String location;
		
		if (completed) {
			location = this.applicant.getAddress();
		} else {
			if (foster == null) {
				location = this.shelter.getAddress();
			} else {
				location = this.foster.getAddress();
			}
		}
		
		dog.setLocation(location);
		return location;
	}
	
	public String meet() {
		return (dog.getName() + " is meeting " + applicant.getfName() + "!");
	}
	
	
	/**
	 * @return the dog
	 */
	public Dog getDog() {
		return dog;
	}
	/**
	 * @param dog the dog to set
	 */
	public void setDog(Dog dog) {
		this.dog = dog;
	}
	/**
	 * @return the shelter
	 */
	public Shelter getShelter() {
		return shelter;
	}
	/**
	 * @param shelter the shelter to set
	 */
	public void setShelter(Shelter shelter) {
		this.shelter = shelter;
	}
	/**
	 * @return the foster
	 */
	public Foster getFoster() {
		return foster;
	}
	/**
	 * @param foster the foster to set
	 */
	public void setFoster(Foster foster) {
		this.foster = foster;
	}
	/**
	 * @return the applicant
	 */
	public Applicant getApplicant() {
		return applicant;
	}
	/**
	 * @param applicant the applicant to set
	 */
	public void setApplicant(Applicant applicant) {
		this.applicant = applicant;
	}
	/**
	 * @return the completed
	 */
	public boolean isCompleted() {
		return completed;
	}
	/**
	 * @param completed the completed to set
	 */
	public void setCompleted(boolean completed) {
		this.completed = completed;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @return the dogLocation
	 */
	public String getDogLocation() {
		return dog.getLocation();
	}
}
