package Library.model;

public class Book {
    private String title;
    private String author;
    private String isbn;
    private int totalCopies;
    private int availableCopies;
    private double price;

    public Book(String title, String author, String isbn, int totalCopies, double price) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.totalCopies = totalCopies;
        this.availableCopies = totalCopies;
        this.price = price;
    }

    public boolean isAvailable() {
        return availableCopies > 0;
    }

    public boolean issueCopy() {
        if (isAvailable()) {
            availableCopies--;
            return true;
        }
        return false;
    }

    public void returnCopy() {
        if (availableCopies < totalCopies) {
            availableCopies++;
        }
    }

    public String getDetails() {
        return "Book: " + title + " | Author: " + author +
               " | ISBN: " + isbn + " | ₹" + price +
               " | Available: " + availableCopies + "/" + totalCopies;
    }

    public String getTitle() {
        return title;
    }

	public String getAuthor() {
		return author;
	}

	public String getISBN(){
		return isbn;
	}

	public int getTotalCopies() {
		return totalCopies;
	}

	public double getPrice() {
		return price;
	}
}
