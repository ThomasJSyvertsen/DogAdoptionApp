package model;

import java.util.ArrayList;

/**
 * @author Thomas Syvertsen - tjsyvertsen
 * CIS175 - Fall 2021
 * Sep 9, 2021
 */
public class Applicant {
	private String fName;
	private String lName;
	private String address;
	private ArrayList<Dog> dogsRequested;
	private boolean approved;
	private boolean paid;
	
	public Applicant(String fName, String lName, String address, ArrayList<Dog> dogsRequested) {
		this.fName = fName;
		this.lName = lName;
		this.address = address;
		this.dogsRequested = dogsRequested;
	}
	
	public Applicant(String fName, String lName, String address, ArrayList<Dog> dogsRequested, 
			boolean approved, boolean paid) {
		this(fName, lName, address, dogsRequested);
		this.approved = approved;
		this.paid = paid;
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
	 * @param dogsRequested the dogsRequested to set
	 */
	public void setDogsRequested(ArrayList<Dog> dogsRequested) {
		this.dogsRequested = dogsRequested;
	}

	/**
	 * @return the dogRequested
	 */
	public ArrayList<Dog> getDogsRequested() {
		return dogsRequested;
	}

	/**
	 * @param dogRequested the dogRequested to set
	 */
	public void setDogRequested(ArrayList<Dog> dogsRequested) {
		this.dogsRequested = dogsRequested;
	}

	/**
	 * @return the approved
	 */
	public boolean isApproved() {
		return approved;
	}

	/**
	 * @param approved the approved to set
	 */
	public void setApproved(boolean approved) {
		this.approved = approved;
	}

	/**
	 * @return the paid
	 */
	public boolean isPaid() {
		return paid;
	}

	/**
	 * @param paid the paid to set
	 */
	public void setPaid(boolean paid) {
		this.paid = paid;
	}

}
