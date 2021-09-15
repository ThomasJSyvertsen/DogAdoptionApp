package model;

import java.util.ArrayList;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author Thomas Syvertsen - tjsyvertsen 
 * CIS175 - Fall 2021 
 * Sep 9, 2021
 */

@Entity
@Table(name = "shelter")
public class Shelter {
	@Id
	@GeneratedValue
	@Column(name = "ID")
	private int id;
	@Column(name = "NAME")
	private String name;
	@Column(name = "ADDRESS")
	private String address;
    @OneToMany(mappedBy = "shelter", cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinTable
    (
        name="SHELTERDOG",
        joinColumns={ @JoinColumn(name="SHELTERID", referencedColumnName="SHELTERID") },
        inverseJoinColumns={ @JoinColumn(name="DOGID", referencedColumnName="ID", unique=true) }
    )
	private ArrayList<Dog> currentDogs = new ArrayList<>();
	@Column(name = "MAXCAPACITY")
	private int maxCapacity;
	@Column(name = "CURRENTCAPACITY")
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
	public Shelter(String name, String address, ArrayList<Dog> currentDogs, int maxCapacity, int currentCapacity) {
		super();
		this.name = name;
		this.address = address;
		this.currentDogs = currentDogs;
		this.maxCapacity = maxCapacity;
		this.currentCapacity = currentCapacity;
	}
	
	public void addDog(Dog dog) {
		currentDogs.add(dog);
		currentDogs.set(currentCapacity, dog);
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
	 * @return the currentDogs
	 */
	public ArrayList<Dog> getCurrentDogs() {
		return currentDogs;
	}

	/**
	 * @param currentDogs the currentDogs to set
	 */
	public void setCurrentDogs(ArrayList<Dog> currentDogs) {
		this.currentDogs = currentDogs;
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
