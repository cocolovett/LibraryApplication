import java.util.Scanner;
import java.util.ArrayList;

public class Book {
	
	// Calls and names scanner 'in'
	public static Scanner in = new Scanner(System.in);
	// Creates ArrayList of books
	public static ArrayList<Book> allbooks = new ArrayList<Book>();
	
	// Creates variables for the books inside the allbooks ArrayList
	private String title;
	private String author;
	private String genre;
	private int year;
	private String publisher;
	
	// Builds the books. Every book has a title, author, genre, year and a publisher. Method of ArrayList 
	public void setBook(String title, String author, String genre, int year, String publisher) {
		this.title = title;
		this.author = author;
		this.genre = genre;
		this.year = year;
		this.publisher = publisher;
		
	}
	
	// If string getTitle is called, then titles in the ArrayList are called
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
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
	
	// Adding books to the ArrayList. 
	public static void addBook() {
		
		// Requests information from user via user input. The input for each option is stored within objects in ArrayList
		System.out.println("Add a new book to the library:");
		
		System.out.println("Title:");
		String title = in.nextLine();
		System.out.println("Author:");
		String author = in.nextLine();
		System.out.println("Genre:");
		String genre = in.nextLine();
		System.out.println("Publisher:");
		String publisher = in.nextLine();
		System.out.println("Year:");
		int year = in.nextInt();
		in.nextLine();
		
		Book newbook = new Book();
		
		// Sets new book with connected title, author, genre, year and publisher
		newbook.setBook(title, author, genre, year, publisher);
		
		allbooks.add(newbook);
		
		System.out.println("You have successfully added a new book to the library!");
		
		// Returns user to book menu
		Menu.bookMenu();
	}
	
	// Program hard code
	public static void hardValues() {
		
		// Creates three new books to the ArrayList
		Book book1 = new Book();
		Book book2 = new Book();
		Book book3 = new Book();
		
		//Sets books with title, author, genre, year and publisher
		book1.setBook("Fallen", "Lauren Kate", "Fantasy", 2009, "Delacorte Press");
		book2.setBook("Landline", "Rainbow Rowell", "Romance", 2014, "Orion");
		book3.setBook("Mockingjay", "Suzanne Collins", "Science Fiction", 2010, "Scholastic Press");
		
		// Adds the books to the ArrayList
		allbooks.add(book1);
		allbooks.add(book2);
		allbooks.add(book3);
		
	}

	// Deleting books from the ArrayList
	public static void deleteBook() {
		
		// Requests a title within the library from the user 
		System.out.println("Enter title to remove: ");
		String title = in.next();
		
		for(int i = 0; i < allbooks.size(); i++) {
			
			// If the user input matches a title in the ArrayList, it will delete the chosen title. 
			if(allbooks.get(i).getTitle().equals(title)) {
				allbooks.remove(i);
			}
		}
		
		System.out.println("You have successfully removed a book from the library!");
		
		// Returns to book menu
		Menu.bookMenu();
		
	}

	// View all books in the library
	public static void searchBook() {
		
		/* Loops through the ArrayList, so each book is printed to screen.
		 * i equals 0, so the loop starts from the first book in the arraylist and increases by one each time.
		 */
		for(int i = 0; i< allbooks.size(); i++) {
			
			System.out.println(
					"\nTitle: " + allbooks.get(i).getTitle() + "\n" + 
					"Author: " + allbooks.get(i).getAuthor() + "\n" + 
					"Genre: " + allbooks.get(i).getGenre() + "\n" +
					"Year: " + allbooks.get(i).getYear() + "\n" +
					"Publisher: " + allbooks.get(i).getPublisher());
		}
		
		Menu.bookMenu();
		
	}

	// Edit book in the library
	public static void editBook() {
		
		//Requests title of book to be edited
		System.out.println("Please enter the title you wish to edit: ");
		String title = in.next();

		for(int i = 0; i < allbooks.size(); i++) {
			
			// Deletes original book from system
			if(allbooks.get(i).getTitle().equals(title)) {
				allbooks.remove(i);
			}
		}
	
		changeBook();
		
	}
	
	public static void changeBook() {
		
		// Requests user to enter updated information of the book they wish to 'change'. Stores as a new book
		System.out.println("Please enter updated book information.");
		System.out.println("Title: ");
		String title = in.next();
		in.nextLine();
		System.out.println("Author:");
		String author = in.nextLine();
		System.out.println("Genre:");
		String genre = in.nextLine();
		System.out.println("Publisher:");
		String publisher = in.nextLine();
		System.out.println("Year:");
		int year = in.nextInt();
		in.nextLine();
		
		//in.nextLine();
		
		Book newbook = new Book();
		
		newbook.setBook(title, author, genre, year, publisher);
		
		allbooks.add(newbook);
		
		System.out.println("You have successfully updated this book.");
		
		Menu.bookMenu();
	}

	// Search books in library
	public static void findBook() {
		
		System.out.println("Please enter title: ");
		String title = in.nextLine();
		
		for(int i = 0; i < allbooks.size(); i++) {
		
			// Prints book searched for within the library
			if(allbooks.get(i).getTitle().equals(title)) {
				System.out.println("Title:" + allbooks.get(i).getTitle() + "\n " + 
				"Author:" + allbooks.get(i).getAuthor() + "\n " + 
				"Genre:" + allbooks.get(i).getGenre() + "\n" + 
				"Year:" + allbooks.get(i).getYear() + "\n" + 
				"Publisher:" + allbooks.get(i).getPublisher());
			}
		}
		
		Menu.bookMenu();
	}
}