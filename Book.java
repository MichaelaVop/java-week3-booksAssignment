import java.text.DecimalFormat;

public class Book {
	
	private String bookTitle;
	private String firstName;
	private String lastName;
	private int yearPublished;
	private double price;
	
	
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
	
	
	
	public double getTotalPrice() {
		this.price = (price * 1.05);
		DecimalFormat totalTwo = new DecimalFormat("#.##");
		return Double.valueOf(totalTwo.format(price).replace(',', '.'));
	}
	
	public void setPrice(double price) {
		this.price = price;
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
