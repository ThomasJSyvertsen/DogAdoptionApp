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
@Table(name = "SHELTER")
public class Shelter {
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
	@Column(name = "name")
	private String name;
	@Column(name = "address")
	private String address;
	@Column(name = "maxCapacity")
	private int maxCapacity;
	@Column(name = "currentCapacity")
	private int currentCapacity;

	public Shelter() {
		super();
	}

	/**
	 * @param name
	 * @param address
	 * @param currentDogs
	 * @param maxCapacity
	 * @param currentCapacity
	 */
	public Shelter(String name, String address, int maxCapacity, int currentCapacity) {
		super();
		this.name = name;
		this.address = address;
		this.maxCapacity = maxCapacity;
		this.currentCapacity = currentCapacity;
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
