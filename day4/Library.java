package week1.day4;

public class Library {
	
	public String addBook(String bookTitle) {
		
		
		System.out.println("Book added successfully:" +bookTitle);
		return bookTitle;
		
	}
	
	public void issueBook() {
		
		System.out.println("book issued");
	}
	
	

	public static void main(String[] args) {
		
		Library lib1 = new Library();
		lib1.addBook("Selenium");
		lib1.issueBook();
		
		

	}

}
