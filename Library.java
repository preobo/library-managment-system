package Library;

import java.util.ArrayList;

public class Library {
	private ArrayList<Book> books;

	public Library() {
		books = new ArrayList <>();

	}
	public void addBook(Book book) {
		books.add(book);
	}
	public void removeBook(String title) {
		for(int i = 0; i < books.size(); i++) {
			if(books.get(i).getTitle().equalsIgnoreCase(title)) {
				books.remove(i);
				System.out.println("Book removed: " + title);
				return;
			}
		}
		System.out.println("Book not found: " + title);
	}
	public void displayBooks() {
		System.out.println("Displaying books..");
		if(books.isEmpty()) {
			System.out.println("There are no books available");
		}else {
			for(Book book: books) {
				System.out.println(book.toString());
			}
		}
	}
	public Book searchBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                System.out.println(title + " is available");
                return book;
            }
        }
        System.out.println(title + " is not available");
        return null;  
    }
}