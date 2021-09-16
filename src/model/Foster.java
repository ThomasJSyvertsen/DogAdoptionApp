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
@Table(name = "FOSTER")
public class Foster {
	@Id
	@GeneratedValue
	@Column(name = "ID")
	private int id;
	@Column(name="FNAME")
	private String fName;
	@Column(name="LNAME")
	private String lName;
	@Column(name="ADDRESS")
	private String address;
	@Column(name="AUTHORIZED")
	private boolean authorized;	
	@Column(name="MAXCAPACITY")
	private int maxCapacity;
	@Column(name="CURRENTCAPACITY")
	private int currentCapacity;
	
	public Foster() {
		super();
	}

	/**
	 * @param fName
	 * @param lName
	 * @param address
	 * @param authorized
	 * @param currentDogs
	 * @param maxCapacity
	 * @param currentCapacity
	 */
	public Foster(String fName, String lName, String address, boolean authorized,
			int maxCapacity, int currentCapacity) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.address = address;
		this.authorized = authorized;
		this.maxCapacity = maxCapacity;
		this.currentCapacity = currentCapacity;
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
	 * @return the maxCapacity
	 */
	public int getMaxCapacity() {
		return maxCapacity;
	}

	/**
	 * @param maxCapacity the maxCapacity to set
	 */
	public void setMaxCapacity(int maxCapacity) {
		this.maxCapacity = maxCapacity;
	}

	/**
	 * @return the currentCapacity
	 */
	public int getCurrentCapacity() {
		return currentCapacity;
	}

	/**
	 * @param currentCapacity the currentCapacity to set
	 */
	public void setCurrentCapacity(int currentCapacity) {
		this.currentCapacity = currentCapacity;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
}
