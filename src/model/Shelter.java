package model;

import java.util.ArrayList;

/**
 * @author Thomas Syvertsen - tjsyvertsen
 * CIS175 - Fall 2021
 * Sep 9, 2021
 */
public class Shelter {
	private String name;
	private String address;
	private ArrayList<Dog> currentDogs;
	private int maxCapacity;
	private int currentCapacity;
	
	/**
	 * @param name
	 * @param address
	 * @param currentDogs
	 * @param maxCapacity
	 * @param currentCapacity
	 */
	public Shelter(String name, String address, ArrayList<Dog> currentDogs, int maxCapacity, int currentCapacity) {
		this.name = name;
		this.address = address;
		this.currentDogs = currentDogs;
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

}
