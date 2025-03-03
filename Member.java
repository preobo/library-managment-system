package Library;

public class Member {
	private String name;
	
	Member(){
		 name = " ";
		
	}
	public Member(String name) {
		this.name = name;
	}
	public void borrowBook(Library library, String title) {
		Book book = library.searchBook(title);
		if(book == null) {
			System.out.println(title + " not found in the library");
			return;
		}
		if (book.isAvailable()) {
			book.borrowBook();
			System.out.println(name + " borrows " + title);
		}else {
			System.out.println(title + " is unavailable");
		}
	}
	public void returnBook(Library library, String title) {
		Book book = library.searchBook(title);
		if(book == null) {
			System.out.println(title + " not found in the library");
			return;
		}
		if (book.isAvailable()) {
			System.out.println("This book was not borrowed.");
		}else {
			book.returnBook();
			System.out.println(name + " returns " + title);
		}
	}
	public String getName() {
		return name;
	}
}