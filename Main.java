package Library;

import java.util.ArrayList;

import java.util.Scanner;


public class Main {
	
    public static void main(String[] args) {
    	Library library = new Library();
    	Book book1 = new Book ("The Great Gatsby","F. Scott Fitzgerald", true);
    	Book book2 = new Book ("1984","George Orwell", true);
    	ArrayList<Book> books = new ArrayList <>();
    	
    	library.addBook(book1);
    	library.addBook(book2);
    	
    	Member alice = new Member("Alice");
    	Member bob = new Member("Bob");
    	Scanner scanner = new Scanner(System.in);
    	int choice;
    	

    	
    	do {
    		System.out.println("1. Display avaliable books");
    		System.out.println("2. Borrow a book");
    		System.out.println("3. Return a book");
    		System.out.println("4. Search for a book");
    		System.out.println("5. Add book to the library");
    		System.out.println("6. Remove book to the library");
    		System.out.println("7. Quit");
    		System.out.print("Enter your choice: ");
    		choice = scanner.nextInt();
    		scanner.nextLine();
    		System.out.println();
    		
    		
    		switch (choice) {
    		case 1:
    			library.displayBooks();
    			break;
    		case 2:
    			System.out.println("Enter member's name: ");
    			String memberName = scanner.nextLine();
    			System.out.println("Enter book title to borrow: ");
    			String borrowTitle = scanner.nextLine();
    			
    			if(memberName.equalsIgnoreCase("Alice")) {
    				alice.borrowBook(library, borrowTitle);
    			}else if(memberName.equalsIgnoreCase("Bob")){
    				bob.borrowBook(library, borrowTitle);
    			}else {
    				System.out.println("Invalid member");
    			}
    			break;
    		case 3:
    			System.out.println("Enter member's name: ");
    			String returnMemberName = scanner.nextLine();
    			System.out.println("Enter book title to return: ");
    			String returnTitle = scanner.nextLine();
    			
    			if(returnMemberName.equalsIgnoreCase("Alice")) {
    				alice.returnBook(library, returnTitle);
    			}else if(returnMemberName.equalsIgnoreCase("Bob")){
    				bob.returnBook(library, returnTitle);
    			}else {
    				System.out.println("Invalid member");
    			}
    			break;
    		case 4:
    			System.out.println("Enter book to search: ");
    			String searchTitle = scanner.nextLine();
    			library.searchBook(searchTitle);
    			break;
    		case 5:
    			System.out.println("Enter book title: ");
    			String bookTitle = scanner.nextLine();
    			
    			System.out.println("Enter author's name: ");
    			String authorName = scanner.nextLine();
    			
    			Book newBook = new Book(bookTitle, authorName, true);
    			library.addBook(newBook);
    			break;
    		
    		case 6:
    			System.out.println("Enter book title you would like to remove: ");
    			String removeBookTitle = scanner.nextLine();
    			library.removeBook(removeBookTitle);
    		case 7:
    			System.out.println("Exiting the library system...");
    			break;
    		default:
    			System.out.println("Invalid choice. Please try again");
    		}
    	} while (choice != 7);
    	
    	
    }
}
