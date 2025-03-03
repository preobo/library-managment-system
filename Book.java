package Library;

public class Book {
	private String title; 
	private String author;
	private boolean isAvailable;
	
	Book(){
		title = "";
		author = "";
		isAvailable = true;
		
	}
	public Book(String title, String author, boolean isAvailable) {
		this.title = title;
		this.author = author;
		this.isAvailable = isAvailable;
		
	}
	// this checks if the book is borrowed.
	public void borrowBook() {
		if(isAvailable) {
			this.isAvailable = false;
			System.out.println("You have borrowed: " + title);
		}else {
			System.out.println("This book has been borrowed");
		}
	}
	// this checks if the book has been returned
	public void returnBook() {
		if(!isAvailable) {
			isAvailable = true;
			System.out.println("You have returned: " + title);
		}else {
			System.out.println("this book is already available.");
		}
	}
	public String toString() {
		return title + " by " + author  + " - " + (isAvailable ? "Available" : "Checked out");
		
	}
	public boolean isAvailable() {
		return isAvailable;
	
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
		
		
	}
	
}
