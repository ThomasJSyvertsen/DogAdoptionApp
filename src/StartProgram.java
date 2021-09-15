import java.sql.Date;
import java.time.ZonedDateTime;
import java.util.Scanner;

import controller.ApplicationHelper;
import controller.DogHelper;
import controller.ShelterHelper;
import model.Application;
import model.Dog;
import model.Shelter;

/**
 * @author Thomas Syvertsen - tjsyvertsen
 * CIS175 - Fall 2021
 * Sep 14, 2021
 */
public class StartProgram {
	
	static Scanner in = new Scanner(System.in);
	//static ApplicationHelper apph = new ApplicationHelper();
	static DogHelper dh = new DogHelper();
	static ShelterHelper sh = new ShelterHelper();

	private static void addADog() {
		Date dateFound = new Date(ZonedDateTime. now(). toInstant(). toEpochMilli());
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
		
		
		Dog toAdd = new Dog(name, demeanor, breed, age, dateFound);
		dh.insertDog(toAdd);

	}
	
	private static void addAShelter() {
		System.out.println("Enter a name: ");
		String name = in.nextLine();
		System.out.println("Enter an address: ");
		String address = in.nextLine();
		System.out.println("Enter max capacity: ");
		int maxCap = in.nextInt();
		
		Shelter toAdd = new Shelter(name, address, null, maxCap, 0);
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
				//editAnItem();
			} else if (selection == 3) {
				//deleteAnItem();
			} else if (selection == 4) {
				//viewTheList();
			} else {
				endCleanUp();
				goAgain = false;
			}

		}

	}
	
	private static boolean getYorN() {
		while(true) {
			String yOrn = in.nextLine();
			
			if (yOrn == "y") {
				return true;
			} else if (yOrn == "n") {
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
