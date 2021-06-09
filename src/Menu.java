import java.util.Scanner;

public class Menu {
	
	//Calling and naming scanner 'in' 
	static Scanner in = new Scanner(System.in);
	
	public static void main(String args[]) {
		
		/* Calling the hard code saved in the item/object classes so it runs 
		 * through the code and adds the predetermined objects to the database.
		 */
		Book.hardValues();
		Journal.hardValues();
		DVD.hardValues();
		Laptop.hardValues();
		
		// Runs the main menu 
		mainMenu();
	}
	
	// Main menu set-up
	public static void mainMenu() {
		
		// Menu starts from 0
		int menu = 0;
		
		// Prints library interface
		System.out.print("\n \t *---*---*---*---*---*---*---*---*---*---*");
		System.out.print("\n \t *\t .UNIVERSITY LIBRARY MENU. \t *");
		System.out.print("\n \t *---*---*---*---*---*---*---*---*---*---*");
		System.out.print("\n \t * Please select one of the following:\t *");
		System.out.print("\n \t * (1) Books\t \t \t \t *");
		System.out.print("\n \t * (2) Academic Journals\t \t *");
		System.out.print("\n \t * (3) DVDs \t \t \t \t *");
		System.out.print("\n \t * (4) Laptop Computers \t \t *");
		System.out.print("\n \t * (0) Exit \t \t \t \t *");
		System.out.print("\n \t *---*---*---*---*---*---*---*---*---*---*\n");
		
		// Menu choice would be extracted from user input of next number entered. 
		menu = in.nextInt();
		
		switch(menu) {
		
		// If user input is 1, print book menu
		case 1:
			bookMenu();
			break;
			
		// If user input is 2, print journal menu
		case 2:
			journalMenu();
			break;
		
		// If user input is 3, print DVD menu
		case 3:
			DVDMenu();
			break;
		
		// If user input is 4, print laptop menu
		case 4:
			LaptopMenu();
			break;
		
		// If user input is 0, quit program
		case 0:
			System.out.println("\t \t *** LIBRARY CLOSED ***");
			break;
		}
		
		// If user input is 5 or more, throws error and prints menu again
		if (menu >= 5) {
			System.out.println("Invalid menu option. Choose number between 1 and 4 to continue, or 0 to quit.");
			mainMenu();
		}
	
	}
	
	// Book Menu
	public static void bookMenu() {
		
		int menu = 0;
		
		System.out.print("\n \t *---*---*---*---*---*---*---*---*---*---*");
		System.out.print("\n \t *\t   .BOOKS LIBRARY MENU. \t \t *");
		System.out.print("\n \t *---*---*---*---*---*---*---*---*---*---*");
		System.out.print("\n \t * Please select one of the following:\t *");
		System.out.print("\n \t * (1) Add Books\t \t \t \t *");
		System.out.print("\n \t * (2) Delete Books\t \t \t *");
		System.out.print("\n \t * (3) Edit Books \t \t \t *");
		System.out.print("\n \t * (4) All Books  \t \t \t *");
		System.out.print("\n \t * (5) Find Books \t \t \t *");
		System.out.print("\n \t * (0) Return to Main Menu \t \t *");
		System.out.print("\n \t *---*---*---*---*---*---*---*---*---*---*\n");
		
		menu = in.nextInt();
		
		switch(menu) {
		
		case 1:
			Book.addBook();
			break;
			
		case 2:
			Book.deleteBook();
			break;
			
		case 3:
			Book.editBook();
			break;
			
		case 4:
			Book.searchBook();
			break;
			
		case 5:
			Book.findBook();
			break;
			
		case 0:
			mainMenu();
			break; 
		} 
		
		if (menu >= 6) {
			System.out.println("Invalid menu option. Choose number between 1 and 4 to continue, or 0 to return to main menu.");
			mainMenu();
		}
	}
	
	// Journal Menu
	public static void journalMenu() {
		
		int menu = 0;
		
		System.out.print("\n \t *---*---*---*---*---*---*---*---*---*---*");
		System.out.print("\n \t *\t.JOURNALS LIBRARY MENU.\t \t *");
		System.out.print("\n \t *---*---*---*---*---*---*---*---*---*---*");
		System.out.print("\n \t * Please select one of the following:\t *");
		System.out.print("\n \t * (1) Add Journals \t \t \t *");
		System.out.print("\n \t * (2) Delete Journals\t \t *");
		System.out.print("\n \t * (3) Edit Journals\t \t \t *");
		System.out.print("\n \t * (4) All Journals  \t \t \t *");
		System.out.print("\n \t * (5) Find Journals \t \t \t *");
		System.out.print("\n \t * (0) Return to Main Menu \t \t *");
		System.out.print("\n \t *---*---*---*---*---*---*---*---*---*---*\n");
		
		menu = in.nextInt();
		
		switch(menu) {
		
		case 1:
			Journal.addJournal();
			break;
			
		case 2:
			Journal.deleteJournal();
			break;
			
		case 3:
			Journal.editJournal();
			break;
			
		case 4:
			Journal.searchJournal();
			break;
			
		case 5:
			Journal.findJournal();
			break;
			
		case 0:
			mainMenu();
			break; 
		} 
		
		if (menu >= 6) {
			System.out.println("Invalid menu option. Choose number between 1 and 4 to continue, or 0 to return to main menu.");
			mainMenu();
		}
	}
	
	// DVD Menu
	public static void DVDMenu() {
		
		int menu = 0;
		
		System.out.print("\n \t *---*---*---*---*---*---*---*---*---*---*");
		System.out.print("\n \t *\t   .DVD LIBRARY MENU.\t \t *");
		System.out.print("\n \t *---*---*---*---*---*---*---*---*---*---*");
		System.out.print("\n \t * Please select one of the following:\t *");
		System.out.print("\n \t * (1) Add DVDs \t \t \t *");
		System.out.print("\n \t * (2) Delete DVDs \t \t *");
		System.out.print("\n \t * (3) Edit DVDs\t \t \t *");
		System.out.print("\n \t * (4) All DVDs  \t \t \t *");
		System.out.print("\n \t * (5) Find DVDs \t \t \t *");
		System.out.print("\n \t * (0) Return to Main Menu \t \t *");
		System.out.print("\n \t *---*---*---*---*---*---*---*---*---*---*\n");
		
		menu = in.nextInt();
		
		switch(menu) {
		
		case 1:
			DVD.addDVD();
			break;
			
		case 2:
			DVD.deleteDVD();
			break;
			
		case 3:
			DVD.editDVD();
			break;
			
		case 4:
			DVD.searchDVD();
			break;
			
		case 5:
			DVD.findDVD();
			break;
			
		case 0:
			mainMenu();
			break; 
		} 
		
		if (menu >= 6) {
			System.out.println("Invalid menu option. Choose number between 1 and 4 to continue, or 0 to return to main menu.");
			mainMenu();
		}
	}
	
	// Laptop Menu
	public static void LaptopMenu() {
		
		int menu = 0;
		
		System.out.print("\n \t *---*---*---*---*---*---*---*---*---*---*");
		System.out.print("\n \t *\t   .LAPTOP LIBRARY MENU.\t \t *");
		System.out.print("\n \t *---*---*---*---*---*---*---*---*---*---*");
		System.out.print("\n \t * Please select one of the following:\t *");
		System.out.print("\n \t * (1) Add Laptops \t \t \t *");
		System.out.print("\n \t * (2) Delete Laptops \t \t *");
		System.out.print("\n \t * (3) Edit Laptops\t \t \t *");
		System.out.print("\n \t * (4) All Laptops  \t \t \t *");
		System.out.print("\n \t * (5) Find Laptops \t \t \t *");
		System.out.print("\n \t * (0) Return to Main Menu \t \t *");
		System.out.print("\n \t *---*---*---*---*---*---*---*---*---*---*\n");
		
		menu = in.nextInt();
		
		switch(menu) {
		
		case 1:
			Laptop.addLaptop();
			break;
			
		case 2:
			Laptop.deleteLaptop();
			break;
			
		case 3:
			Laptop.editLaptop();
			break;
			
		case 4:
			Laptop.searchLaptop();
			break;
			
		case 5:
			Laptop.findLaptop();
			break;
			
		case 0:
			mainMenu();
			break; 
		} 
		
		if (menu >= 6) {
			System.out.println("Invalid menu option. Choose number between 1 and 4 to continue, or 0 to return to main menu.");
			mainMenu();
		}
	}
	
}
