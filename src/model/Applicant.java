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
@Table(name = "APPLICANT")
public class Applicant {
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
	@Column(name = "fName")
	private String fName;
	@Column(name = "lName")
	private String lName;
	@Column(name = "address")
	private String address;
	@Column(name = "authorized")
	private boolean authorized;
	@Column(name = "hasPaid")
	private boolean hasPaid;
	
	/*
	 *     @OneToMany(mappedBy = "applicantDog", cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinTable
    (
        name="APPLICANTDOG",
        joinColumns={ @JoinColumn(name="APPLICANTID", referencedColumnName="APPLICANTID") },
        inverseJoinColumns={ @JoinColumn(name="DOGID", referencedColumnName="ID", unique=true) }
    )
	private ArrayList<Dog> currentDogs;
    @OneToMany(mappedBy = "applicantDogRequested", cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinTable
    (
        name="APPLICANTDOGREQUESTED",
        joinColumns={ @JoinColumn(name="APPLICANTID", referencedColumnName="APPLICANTID") },
        inverseJoinColumns={ @JoinColumn(name="DOGID", referencedColumnName="ID", unique=true) }
    )
	private ArrayList<Dog> dogsRequested;
	 */

	/**
	 * 
	 */
	public Applicant() {
		super();
	}

	/**
	 * @param fName
	 * @param lName
	 * @param address
	 * @param authorized
	 * @param hasPaid
	 */
	public Applicant(String fName, String lName, String address, boolean authorized, boolean hasPaid) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.address = address;
		this.authorized = authorized;
		//this.currentDogs = currentDogs;
		//this.dogsRequested = dogsRequested;
		this.hasPaid = hasPaid;
	}
	
	public String returnApplicantDetails() {
		return (this.fName + " " + this.lName + " Address: " + this.address 
				+ " Authorized: " + this.authorized + " Has Paid: " + this.hasPaid);
	}

	/**
	 * @return the fName
	 */
	public String getfName() {
		return fName;
	}

	/**
	 * @param fName the fName to set
	 */
	public void setfName(String fName) {
		this.fName = fName;
	}

	/**
	 * @return the lName
	 */
	public String getlName() {
		return lName;
	}

	/**
	 * @param lName the lName to set
	 */
	public void setlName(String lName) {
		this.lName = lName;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the authorized
	 */
	public boolean isAuthorized() {
		return authorized;
	}

	/**
	 * @param authorized the authorized to set
	 */
	public void setAuthorized(boolean authorized) {
		this.authorized = authorized;
	}

	/**
	 * @return the hasPaid
	 */
	public boolean isHasPaid() {
		return hasPaid;
	}

	/**
	 * @param hasPaid the hasPaid to set
	 */
	public void setHasPaid(boolean hasPaid) {
		this.hasPaid = hasPaid;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
}
