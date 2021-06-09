import java.util.Scanner;
import java.util.ArrayList;

public class Journal {
	
	public static Scanner in = new Scanner(System.in);
	public static ArrayList<Journal> alljournals = new ArrayList<Journal>();
	
	private String title;
	private String genre;
	private int year;
	private String publisher;
	
	public void setJournal(String title, String genre, int year, String publisher) {
		this.title = title;
		this.genre = genre;
		this.year = year;
		this.publisher = publisher;
		
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getGenre() {
		return genre;
	}
	
	public int getYear() {
		return year;
	}
	
	public String getPublisher() {
		return publisher;
	}
	
	public static void addJournal() {
		
		System.out.println("Add a new journal to the library:");
		
		System.out.println("Title:");
		String title = in.nextLine();
		System.out.println("Genre:");
		String genre = in.nextLine();
		System.out.println("Publisher:");
		String publisher = in.nextLine();
		System.out.println("Year:");
		int year = in.nextInt();
		in.nextLine();
		
		Journal newjournal = new Journal();
		
		newjournal.setJournal(title, genre, year, publisher);
		
		alljournals.add(newjournal);
		
		System.out.println("You have successfully added a new journal to the library!");
		
		Menu.journalMenu();
	}
	
	public static void hardValues() {
		
		Journal journal1 = new Journal();
		Journal journal2 = new Journal();
		Journal journal3 = new Journal();
		
		journal1.setJournal("Microbiology", "Microbiology", 1947, "Society for General Microbiology");
		journal2.setJournal("Cell", "Biology", 1974, "Cell Press");
		journal3.setJournal("Bioinformatics", "Computational Biology", 1998, "Oxford University Press");
		
		alljournals.add(journal1);
		alljournals.add(journal2);
		alljournals.add(journal3);
		
	}

	public static void deleteJournal() {
		
		System.out.println("Enter title to remove: ");
		String title = in.next();
		
		for(int i = 0; i < alljournals.size(); i++) {
			
			if(alljournals.get(i).getTitle().equals(title)) {
				alljournals.remove(i);
			}
			
		}
		
		System.out.println("You have successfully removed a journal from the library!");
		
		Menu.journalMenu();
		
	}
	
	public static void searchJournal() {
		
		for(int i = 0; i< alljournals.size(); i++) {
			
			System.out.println(
					"\nTitle: " + alljournals.get(i).getTitle() + "\n" + 
					"Genre: " + alljournals.get(i).getGenre() + "\n" +
					"Year: " + alljournals.get(i).getYear() + "\n" +
					"Publisher: " + alljournals.get(i).getPublisher());
		}
		
		Menu.journalMenu();
		
	}

	public static void editJournal() {
		
		System.out.println("Please enter the title you wish to edit: ");
		String title = in.nextLine();

		for(int i = 0; i < alljournals.size(); i++) {
			
			if(alljournals.get(i).getTitle().equals(title)) {
				alljournals.remove(i);
			}
		}
		
		changeJournal();
		
	}
	
	public static void changeJournal() {
		
		System.out.println("Enter updated title: ");
		String title = in.nextLine();
		System.out.println("Genre:");
		String genre = in.nextLine();
		System.out.println("Publisher:");
		String publisher = in.nextLine();
		System.out.println("Year:");
		int year = in.nextInt();
		in.nextLine();
		
		Journal newjournal = new Journal();
		
		newjournal.setJournal(title, genre, year, publisher);
		
		alljournals.add(newjournal);
		
		System.out.println("You have successfully updated this journal.");
		
		Menu.journalMenu();
	}
	
	public static void findJournal() {
		
		System.out.println("Please enter title: ");
		String title = in.nextLine();
		
		for(int i = 0; i < alljournals.size(); i++) {
			
			if(alljournals.get(i).getTitle().equals(title)) {
				System.out.println("Title:" + alljournals.get(i).getTitle() + "\n " + 
				"Genre:" + alljournals.get(i).getGenre() + "\n" + 
				"Year:" + alljournals.get(i).getYear() + "\n" + 
				"Publisher:" + alljournals.get(i).getPublisher());
			}
		}
		
		Menu.journalMenu();
	}
	
}