
public class Driver {
	
	
	public static void printBooks(Book[] booksArray) {
		
		for (int i = 0; i < booksArray.length; i++) {
			System.out.println("Title: " + booksArray[i].getTitle() + " author: " 
								+ booksArray[i].getFirstName() + " " 
								+ booksArray[i].getLastName() + " published in year " 
								+ booksArray[i].getYear() + " and the price is $"
								+ booksArray[i].getTotalPrice());
			
		}
	}

	public static void main(String[] args) {
		
		Book[] booksArray = new Book[2];
		
		booksArray[0] = new Book("Anna Karenina", "Leo", "Tolstoy", 1984);
		booksArray[1] = new Book("Madame Bovary", "Gustave", "Flaubert", 1857);
		
		printBooks(booksArray);
		
		booksArray[0].setFirstName("John");
		booksArray[0].setLastName("Smith");
		booksArray[0].setPrice(24.0);
		booksArray[1].setPrice(31.0);
		
		//System.out.println("Title: " + book1.bookTitle + " Author: " + book1.firstName + " " + book1.lastName + " published in year " + book1.yearPublished);
		//System.out.println("Title: " + book2.bookTitle + " Author: " + book2.firstName + " " + book2.lastName + " published in year " + book2.yearPublished);
		
		System.out.println("\nPrint books after the update:");
		printBooks(booksArray);

	}

}
