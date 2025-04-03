package constructors;

import java.util.ArrayList;
import java.util.List;

public class BookConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book obj1 = new Book("Wings of Fire", "A.P.J.Abdul Kalam", "818402231X", 155, 1999);
		Book obj2 = new Book("Thinking, Fast and Slow", "Kahneman Daniel", "AG8402231X", 175, 2017);
		Book obj3 = new Book("Rich Dad Poor Dad", "Robert Kiyosaki", "9781509491575", 160, 2022);
		Book obj4 = new Book("Motivating Thoughts of Kalam", "A.P.J.Abdul Kalam", "9789355214225", 175, 2000);
		Book.addBook(obj1);
		Book.addBook(obj2);
		Book.addBook(obj3);
		Book.addBook(obj4);
		
		Book.printAllBooks();
	}

}

class Book {
	private static int bookCount = 0;
	private String bookTitle;
	private String authorName;
	private String ISBN;
	private int publishedYear;
	private int price;
	private String genre;
	private static List<Book> allBooks = new ArrayList<>();
	
	public Book(String title, String author, String ISBN, int price, int publishedYear) {
        this.bookTitle = title;
        this.authorName = author;
        this.ISBN = ISBN;
        this.price = price;
        this.publishedYear = publishedYear;
        setBookCount(getBookCount() + 1); 	// Increment book count when a new book is created
    }
	
	public static void addBook(Book book) {
		allBooks.add(book);
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
	public static void printAllBooks() {
        System.out.println("***** All Books in Library *****");
        int i=1;
        for (Book book : allBooks) {
            System.out.println((i++)+"."+book);
        }
    }
    @Override
    public String toString() {
        return "Book :" +'\n' +
                "	Title='" + bookTitle + '\'' +
                ", Author='" + authorName + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", Price=" + price +
                ", Published Year=" + publishedYear +
                '}';
    }
}
