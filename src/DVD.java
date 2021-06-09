import java.util.Scanner;
import java.util.ArrayList;

public class DVD {
	
	public static Scanner in = new Scanner(System.in);
	public static ArrayList<DVD> allDVDs = new ArrayList<DVD>();
	
	private String title;
	private String director;
	private String genre;
	private int year;
	private String rating;
	
	public void setDVD(String title, String director, String genre, int year, String rating) {
		this.title = title;
		this.director = director;
		this.genre = genre;
		this.year = year;
		this.rating = rating;
		
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getDirector() {
		return director;
	}
	
	public String getGenre() {
		return genre;
	}
	
	public int getYear() {
		return year;
	}
	
	public String getRating() {
		return rating;
	}
	
	public static void addDVD() {
		
		System.out.println("Add a new DVD to the library:");
		
		System.out.println("Title:");
		String title = in.nextLine();
		System.out.println("Director:");
		String director = in.nextLine();
		System.out.println("Genre:");
		String genre = in.nextLine();
		System.out.println("Rating:");
		String rating = in.nextLine();
		System.out.println("Year:");
		int year = in.nextInt();
		in.nextLine();
		
		DVD newDVD = new DVD();
		
		newDVD.setDVD(title, director, genre, year, rating);
		
		allDVDs.add(newDVD);
		
		System.out.println("You have successfully added a new DVD to the library!");
		
		Menu.DVDMenu();
	}
	
	public static void hardValues() {
		
		DVD DVD1 = new DVD();
		DVD DVD2 = new DVD();
		DVD DVD3 = new DVD();
		
		DVD1.setDVD("Elf", "Jon Favreau", "Comedy", 2003, "PG");
		DVD2.setDVD("Moonlight", "Barry Jenkins", "Drama", 2016, "15");
		DVD3.setDVD("Novocaine", "David Atkins", "Thriller/Comedy-Drama", 2001, "15");
		
		allDVDs.add(DVD1);
		allDVDs.add(DVD2);
		allDVDs.add(DVD3);
		
	}

	public static void deleteDVD() {
		
		System.out.println("Enter title to remove: ");
		String title = in.next();
		
		for(int i = 0; i < allDVDs.size(); i++) {
			
			if(allDVDs.get(i).getTitle().equals(title)) {
				allDVDs.remove(i);
			}
			
		}
		
		System.out.println("You have successfully removed a DVD from the library!");
		
		Menu.DVDMenu();
		
	}
	
	public static void searchDVD() {
		
		for(int i = 0; i< allDVDs.size(); i++) {
			
			System.out.println(
					"\nTitle: " + allDVDs.get(i).getTitle() + "\n" + 
					"Director: " + allDVDs.get(i).getDirector() + "\n" + 
					"Genre: " + allDVDs.get(i).getGenre() + "\n" +
					"Year: " + allDVDs.get(i).getYear() + "\n" +
					"Rating: " + allDVDs.get(i).getRating());
		}
		
		Menu.DVDMenu();
		
	}

	public static void editDVD() {
		
		System.out.println("Please enter the title you wish to edit: ");
		String title = in.nextLine();

		for(int i = 0; i < allDVDs.size(); i++) {
			
			if(allDVDs.get(i).getTitle().equals(title)) {
				allDVDs.remove(i);
			}
		}
		
		changeDVD();
		
	}
	
	public static void changeDVD() {
		
		System.out.println("Enter updated title: ");
		String title = in.nextLine();
		System.out.println("Director:");
		String director = in.nextLine();
		System.out.println("Genre:");
		String genre = in.nextLine();
		System.out.println("Rating:");
		String rating = in.nextLine();
		System.out.println("Year:");
		int year = in.nextInt();
		in.nextLine();
		
		DVD newDVD = new DVD();
		
		newDVD.setDVD(title, director, genre, year, rating);
		
		allDVDs.add(newDVD);
		
		System.out.println("You have successfully updated this DVD.");
		
		Menu.DVDMenu();
	}
	
	public static void findDVD() {
		
		System.out.println("Please enter title: ");
		String title = in.nextLine();
		
		for(int i = 0; i < allDVDs.size(); i++) {
			
			if(allDVDs.get(i).getTitle().equals(title)) {
				System.out.println("Title:" + allDVDs.get(i).getTitle() + "\n " + 
				"Director:" + allDVDs.get(i).getDirector() + "\n " + 
				"Genre:" + allDVDs.get(i).getGenre() + "\n" + 
				"Year:" + allDVDs.get(i).getYear() + "\n" + 
				"Rating:" + allDVDs.get(i).getRating());
			}
		}
		
		Menu.DVDMenu();
	}
	
}