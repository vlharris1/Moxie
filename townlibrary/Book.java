package townlibrary;

public class Book {
	
	String title;
	boolean borrowed;
	boolean rented;
	boolean returned;
	
	public Book(String bookTitle) {
		
	}
	
	public void borrowed() {
		
	}
	
	public String getTitle() {
		return title;
	}
	
	public boolean isBorrowed() {
		return false;
	}
	
	public boolean rented() {
		return true;
	}
	
	public boolean returned() {
		return false;
	}

}
