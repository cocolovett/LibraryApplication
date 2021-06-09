import java.util.Scanner;
import java.util.ArrayList;

public class Laptop {
	
	public static Scanner in = new Scanner(System.in);
	public static ArrayList<Laptop> allLaptops = new ArrayList<Laptop>();
	
	private String brand;
	private String author;
	private String model;
	private String memory;
	
	public void setLaptop(String brand, String author, String model, String memory) {
		this.brand = brand;
		this.author = author;
		this.model = model;
		this.memory = memory;
		
	}
	
	public String getBrand() {
		return brand;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public String getModel() {
		return model;
	}
	
	public String getMemory() {
		return memory;
	}
	
	public static void addLaptop() {
		
		System.out.println("Add a new Laptop to the library:");
		
		System.out.println("Brand:");
		String brand = in.nextLine();
		System.out.println("Author:");
		String author = in.nextLine();
		System.out.println("Model:");
		String model = in.nextLine();
		System.out.println("Memory:");
		String memory = in.nextLine();
		in.nextLine();
		
		Laptop newLaptop = new Laptop();
		
		newLaptop.setLaptop(brand, author, model, memory);
		
		allLaptops.add(newLaptop);
		
		System.out.println("You have successfully added a new Laptop to the library!");
		
		Menu.LaptopMenu();
	}
	
	public static void hardValues() {
		
		Laptop Laptop1 = new Laptop();
		Laptop Laptop2 = new Laptop();
		Laptop Laptop3 = new Laptop();
		
		Laptop1.setLaptop("Apple", "Macbook", "A1342", "2GB");
		Laptop2.setLaptop("Asus", "VivoBook", "X405", "4GB");
		Laptop3.setLaptop("Lenovo", "YOGA", "300-11IBR", "4GB");
		
		allLaptops.add(Laptop1);
		allLaptops.add(Laptop2);
		allLaptops.add(Laptop3);
		
	}

	public static void deleteLaptop() {
		
		System.out.println("Enter brand to remove: ");
		String brand = in.next();
		
		for(int i = 0; i < allLaptops.size(); i++) {
			
			if(allLaptops.get(i).getBrand().equals(brand)) {
				allLaptops.remove(i);
			}
			
		}
		
		System.out.println("You have successfully removed a Laptop from the library!");
		
		Menu.LaptopMenu();
		
	}
	
	public static void searchLaptop() {
		
		for(int i = 0; i< allLaptops.size(); i++) {
			
			System.out.println(
					"\nTitle: " + allLaptops.get(i).getBrand() + "\n" + 
					"Author: " + allLaptops.get(i).getAuthor() + "\n" + 
					"Model: " + allLaptops.get(i).getModel() + "\n" +
					"Memory: " + allLaptops.get(i).getMemory());
		}
		
		Menu.LaptopMenu();
		
	}

	public static void editLaptop() {
		
		System.out.println("Please enter the brand of laptop you wish to edit: ");
		String brand = in.nextLine();

		for(int i = 0; i < allLaptops.size(); i++) {
			
			if(allLaptops.get(i).getBrand().equals(brand)) {
				allLaptops.remove(i);
			}
		}
		
		changeLaptop();
		
	}
	
	public static void changeLaptop() {
		
		System.out.println("Enter updated brand: ");
		String brand = in.nextLine();
		System.out.println("Author:");
		String author = in.nextLine();
		System.out.println("Model:");
		String model = in.nextLine();
		System.out.println("Memory:");
		String memory = in.nextLine();
		in.nextLine();
		
		Laptop newLaptop = new Laptop();
		
		newLaptop.setLaptop(brand, author, model, memory);
		
		allLaptops.add(newLaptop);
		
		System.out.println("You have successfully updated this Laptop.");
		
		Menu.LaptopMenu();
	}
	
	public static void findLaptop() {
		
		System.out.println("Please enter brand: ");
		String brand = in.nextLine();
		
		for(int i = 0; i < allLaptops.size(); i++) {
			
			if(allLaptops.get(i).getBrand().equals(brand)) {
				System.out.println("Title:" + allLaptops.get(i).getBrand() + "\n " + 
				"Author:" + allLaptops.get(i).getAuthor() + "\n " + 
				"Model:" + allLaptops.get(i).getModel() + "\n" + 
				"Memory:" + allLaptops.get(i).getMemory());
			}
		}
		
		Menu.LaptopMenu();
	}
	
}