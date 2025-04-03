package classesAndObjects;

public class Book {
	private static int bookCount = 0;
	private String bookTitle;
	private String authorName;
	private String ISBN;
	private int publishedYear;
	private int price;
	private String genre;
	
	public Book(String title, String author, String ISBN, int price, int publishedYear) {
        this.bookTitle = title;
        this.authorName = author;
        this.ISBN = ISBN;
        this.price = price;
        this.publishedYear = publishedYear;
        setBookCount(getBookCount() + 1); 	// Increment book count when a new book is created
    }
	
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String ISBN) {
		this.ISBN = ISBN;
	}
	public int getPublishedYear() {
		return publishedYear;
	}
	public void setPublishedYear(int publishedYear) {
		this.publishedYear = publishedYear;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}

	public static int getBookCount() {
		return bookCount;
	}

	public static void setBookCount(int bookCount) {
		Book.bookCount = bookCount;
	}
}
