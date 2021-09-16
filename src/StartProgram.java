
import java.util.List;
import java.util.Scanner;

import controller.ApplicantHelper;
import controller.ApplicationHelper;
import controller.DogHelper;
import controller.FosterHelper;
import controller.ShelterHelper;
import model.Application;
import model.Dog;
import model.Shelter;

/**
 * @author Thomas Syvertsen - tjsyvertsen CIS175 - Fall 2021 Sep 14, 2021
 */

public class StartProgram {

	static Scanner in = new Scanner(System.in);
	static DogHelper dh = new DogHelper();
	static FosterHelper fh = new FosterHelper();
	static ShelterHelper sh = new ShelterHelper();
	static ApplicantHelper apph = new ApplicantHelper();
	static ApplicationHelper aph = new ApplicationHelper();

	private static void addADog() {
		System.out.print("Enter a name: ");
		String name = in.nextLine();

		String demeanor;
		System.out.print("Enter demeanor? y/n ");
		if (getYorN()) {
			System.out.println("Enter a demeanor: ");
			demeanor = in.nextLine();
		} else {
			demeanor = null;
		}

		String breed;
		System.out.println("Enter breed? y/n ");
		if (getYorN()) {
			System.out.println("Enter breed: ");
			breed = in.nextLine();
		} else {
			breed = null;
		}

		int age;
		System.out.println("Enter age? y/n ");
		if (getYorN()) {
			System.out.println("Enter age: ");
			age = in.nextInt();
		} else {
			age = -1;
		}

		Dog toAdd = new Dog(name, demeanor, breed, age);
		dh.insertDog(toAdd);
	}

	private static void deleteADog() {
		System.out.print("Enter the dog name to delete: ");
		String item = in.nextLine();

		Dog toDelete = new Dog(item, null, null, -1);
		toDelete.setName(item);
		dh.deleteDog(toDelete);
	}
	
	/**
	 * 
	 */
	private static void editADog() {
		List<Dog> foundDogs;
			System.out.print("Enter dog name: ");
			String dogName = in.nextLine();
			foundDogs = dh.searchForDogByName(dogName);

			if (!foundDogs.isEmpty()) {
				System.out.println("Found Results.");
				for (Dog d : foundDogs) {
					System.out.println(d.getId() + " : " + d.toString());
				}
				System.out.print("Which ID to edit: ");
				long idToEdit = in.nextLong();
				
				Dog toEdit = dh.searchForDogById(idToEdit);
				System.out.println("Retrieved " + toEdit.getName());
				System.out.println("1 : Update Name");
				System.out.println("2 : Update Age");
				int update = in.nextInt();
				in.nextLine();

				if (update == 1) {
					System.out.print("New Name: ");
					String newName = in.nextLine();
					toEdit.setName(newName);
				} else if (update == 2) {
					System.out.print("New Age: ");
					int newAge = in.nextInt();
					in.nextLine();
					toEdit.setAge(newAge);
				}

				dh.updateDog(toEdit);

			} else {
				System.out.println("---- No results found");
			}

	}
	
	private static void viewTheDogList() {
		List<Dog> allDogs = dh.showAllDogs();
		
		for(Dog singleDog : allDogs) {
			System.out.println(singleDog.returnDogDetails());
		}
	}

	private static void addAShelter() {
		System.out.println("Enter a name: ");
		String name = in.nextLine();
		System.out.println("Enter an address: ");
		String address = in.nextLine();
		System.out.println("Enter max capacity: ");
		int maxCap = in.nextInt();

		Shelter toAdd = new Shelter(name, address, maxCap, 0);
		sh.insertShelter(toAdd);
	}

	public static void main(String[] args) {
		runMenu();
	}

	public static void runMenu() {
		boolean goAgain = true;
		System.out.println("--- Welcome to our dog shelter! ---");
		while (goAgain) {
			System.out.println("*  Select an item:");
			System.out.println("*  1 -- Add an object");
			System.out.println("*  2 -- Edit an object");
			System.out.println("*  3 -- Delete an object");
			System.out.println("*  4 -- View a list of objects");
			System.out.println("*  5 -- Exit the awesome program");
			System.out.print("*  Your selection: ");
			int selection = in.nextInt();
			in.nextLine();

			if (selection == 1) {
				System.out.println("*  Select an item:");
				System.out.println("*  1 -- Add a dog");
				System.out.println("*  2 -- Add a foster parent");
				System.out.println("*  3 -- Add a shelter");
				System.out.println("*  4 -- Add an applicant");
				System.out.println("*  5 -- Create a new application");
				System.out.println("*  6 -- Exit the awesome program");
				System.out.print("*  Your selection: ");
				int addSelection = in.nextInt();
				in.nextLine();

				if (addSelection == 1) {
					addADog();
				} else if (addSelection == 2) {
					//addAFoster();
				} else if (addSelection == 3) {
					addAShelter();
				} else if (addSelection == 4) {
					//addAnApplicant();
				} else if (addSelection == 5) {
					//addAnApplication();
				} else {
					endCleanUp();
					goAgain = false;
				}
			} else if (selection == 2) {
				editADog();
			} else if (selection == 3) {
				System.out.println("*  Select an item:");
				System.out.println("*  1 -- Delete a dog");
				System.out.println("*  2 -- Delete a foster parent");
				System.out.println("*  3 -- Delete a shelter");
				System.out.println("*  4 -- Delete an applicant");
				System.out.println("*  5 -- Delete an application");
				System.out.println("*  6 -- Exit the awesome program");
				System.out.print("*  Your selection: ");
				int addSelection = in.nextInt();
				in.nextLine();

				if (addSelection == 1) {
					deleteADog();
				} else if (addSelection == 2) {
					//addAFoster();
				} else if (addSelection == 3) {
					addAShelter();
				} else if (addSelection == 4) {
					//addAnApplicant();
				} else if (addSelection == 5) {
					//addAnApplication();
				} else {
					endCleanUp();
					goAgain = false;
				}
			} else if (selection == 4) {
				viewTheDogList();
			} else {
				endCleanUp();
				System.out.println("   Goodbye!   ");
				goAgain = false;
			}
		}
	}

	private static boolean getYorN() {
		while (true) {
			String yOrn = in.nextLine();

			if (yOrn.equalsIgnoreCase("y")) {
				return true;
			} else if (yOrn.equalsIgnoreCase("n")) {
				return false;
			} else {
				System.out.println("Please enter y/n");
			}
		}
	}

	private static void endCleanUp() {
		//apph.cleanUp();
		dh.cleanUp();
		System.out.println("   Goodbye!   ");
	}
}
