
public class Book {
	
	private String bookTitle;
	private String firstName;
	private String lastName;
	private int yearPublished;
	
	public Book(String title, String fName, String lName, int year) {
		if (title == "") {
			bookTitle = "Unknown";
		} else {
			bookTitle = title;
		}
		if (fName == "") {
			firstName = "Unknown";
		} else {
			firstName = fName;
		}
		if (lName == "") {
			lastName = "Unknown";
		} else {
			lastName = lName;
		}
		if (year <= 1900) {
			yearPublished = 1900;
		} else {
			yearPublished = year;
		}
		
	}
	
	public String getTitle() {
		return bookTitle;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public int getYear() {
		return yearPublished;
	}
	
	public void setTitle(String title) {
			bookTitle = title;
		}
	
	public void setFirstName(String fName) {
			firstName = fName;
		}
	
	public void setLastName(String lName) {
			lastName = lName;
		}
	
	public void setYear(int year) {
		yearPublished = year;
		}
	

}
