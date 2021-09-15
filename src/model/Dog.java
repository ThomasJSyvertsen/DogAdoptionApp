package model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author Thomas Syvertsen - tjsyvertsen 
 * CIS175 - Fall 2021 
 * Sep 9, 2021
 */

@Entity
@Table(name = "dog")
public class Dog {
	@Id
	//@GeneratedValue
	@Column(name = "ID")
	private Long id;
	@Column(name = "NAME")
	private String name;
	@Column(name = "DEMEANOR")
	private String demeanor;
	@Column(name = "BREED")
	private String breed;
	@Column(name = "AGE")
	private int age;
	@Temporal(TemporalType.DATE)
	@Column(name = "DATEFOUND")
	private Date dateFound;
    @ManyToOne(fetch = FetchType.LAZY)
    private Shelter shelter;
    @ManyToOne(fetch = FetchType.LAZY)
    private Foster foster;
    @ManyToOne(fetch = FetchType.LAZY)
    private Application applicationDog;
    @ManyToOne(fetch = FetchType.LAZY)
    private Applicant applicantDog;
    @ManyToOne(fetch = FetchType.LAZY)
    private Applicant applicantDogRequested;
	@Column(name = "LOCATION")
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
	public Dog(String name, String demeanor, String breed, int age, Date dateFound) {
		super();
		this.name = name;
		this.demeanor = demeanor;
		this.breed = breed;
		this.age = age;
		this.dateFound = dateFound;
	}
 
    @Override
    public int hashCode() {
        return getClass().hashCode();
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

	/**
	 * @return the id
	 */
	//public Long getId() {
		//return id;
	//}
	
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
}
