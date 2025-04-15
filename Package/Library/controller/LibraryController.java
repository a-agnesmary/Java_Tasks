package Library.controller;

import Library.model.Book;
import Library.model.Member;
import Library.model.Transaction;

import java.util.ArrayList;

public class LibraryController {
	
    private final ArrayList<Book> books = new ArrayList<>();
    private final ArrayList<Member> members = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully.");
    }

    public void addMember(Member member) {
        members.add(member);
        System.out.println("Member added successfully.");
    }

    public void issueBook(int memberId, String bookTitle) {
        Member member = findMemberById(memberId);
        Book book = findBookByTitle(bookTitle);

        if (member != null && book != null) {
            Transaction t = new Transaction(member, book, "Issue");
            System.out.println(t.process());
        } else {
            System.out.println("Cannot issue book. Member or Book not found.");
        }
    }

    public void returnBook(int memberId, String bookTitle) {
        Member member = findMemberById(memberId);
        Book book = findBookByTitle(bookTitle);

        if (member != null && book != null) {
            Transaction t = new Transaction(member, book, "Return");
            System.out.println(t.process());
        } else {
            System.out.println("Cannot return book. Member or Book not found.");
        }
    }
    
    public void showAllBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available in the library.");
        } else {
            System.out.println("\n==== List of Books ====");
            for (Book book : books) {
                System.out.println(book.getDetails());
            }
        }
    }
    
    public void showAllMembers() {
        if (members.isEmpty()) {
            System.out.println("No members registered.");
        } else {
            System.out.println("\n==== List of Members ====");
            for (Member member : members) {
                System.out.println("Name: " + member.getName() + ", ID: " + member.getId());
            }
        }
    }

    private Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    private Member findMemberById(int id) {
        for (Member member : members) {
            if (member.getId() == id) {
                return member;
            }
        }
        return null;
    }
}
