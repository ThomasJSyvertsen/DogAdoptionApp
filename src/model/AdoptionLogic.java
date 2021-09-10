package model;

/**
 * @author Thomas Syvertsen - tjsyvertsen 
 * CIS175 - Fall 
 * 2021 Sep 9, 2021
 */
public class AdoptionLogic {
	private Dog dog;
	private Shelter shelter;
	private Foster foster;
	private Applicant applicant;
	private boolean completed;

	public AdoptionLogic(Dog dog, Shelter shelter, Applicant applicant) {
		this.dog = dog;
		this.shelter = shelter;
		this.applicant = applicant;
		this.foster = null;
		this.completed = false;
	}
	
	public AdoptionLogic(Dog dog, Shelter shelter, Foster foster, Applicant applicant) {
		this(dog, shelter, applicant);
		this.applicant = applicant;
	}

	public String locate() {
		String location;
		
		if (completed) {
			location = this.applicant.getAddress();
		} else {
			if (foster == null) {
				location = (this.shelter.getAddress());
			} else {
				location = (this.foster.getAddress());
			}
		}
		
		return location;
	}

	public void approve() {
		this.completed = true;
	}
	
	public String meet() {
		return (dog.getName() + " is meeting " + applicant.getfName() + "!");
	}
	
	/**
	 * @return the completed
	 */
	public boolean getCompleted() {
		return completed;
	}

	/**
	 * @param completed the completed to set
	 */
	public void setCompleted(boolean completed) {
		this.completed = completed;
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

}
