package model;

import java.util.ArrayList;

/**
 * @author Thomas Syvertsen - tjsyvertsen
 * CIS175 - Fall 2021
 * Sep 9, 2021
 */
public class Foster {
	private String fName;
	private String lName;
	private String address;
	private boolean authorized;
	private boolean hasDog;
	private ArrayList<Dog> currentDogs;
	private boolean hasRoom;
	
	
	/**
	 * @param fName
	 * @param lName
	 * @param hasDog
	 * @param currentDogs
	 */
	public Foster(String fName, String lName, String address, boolean hasDog, ArrayList<Dog> currentDogs) {
		this.fName = fName;
		this.lName = lName;
		this.address = address;
		this.hasDog = hasDog;
		this.currentDogs = currentDogs;
	}
	
	/**
	 * @param fName
	 * @param lName
	 * @param authorized
	 * @param hasDog
	 * @param currentDogs
	 * @param hasRoom
	 */
	public Foster(String fName, String lName, String address, boolean authorized, boolean hasDog, ArrayList<Dog> currentDogs,
			boolean hasRoom) {
		this(fName, lName, address, hasDog, currentDogs);
		this.authorized = authorized;
		this.hasRoom = hasRoom;
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
	 * @return the hasDog
	 */
	public boolean isHasDog() {
		return hasDog;
	}

	/**
	 * @param hasDog the hasDog to set
	 */
	public void setHasDog(boolean hasDog) {
		this.hasDog = hasDog;
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
	 * @return the hasRoom
	 */
	public boolean isHasRoom() {
		return hasRoom;
	}

	/**
	 * @param hasRoom the hasRoom to set
	 */
	public void setHasRoom(boolean hasRoom) {
		this.hasRoom = hasRoom;
	}

}
