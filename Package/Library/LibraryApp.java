package Library;

import Library.controller.LibraryController;
import Library.model.Book;
import Library.model.Member;

import java.util.Scanner;

public class LibraryApp {
	
    public static void main(String[] args) {
    	
        LibraryController controller = new LibraryController();
        
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n==== Library Management Menu ====");
            System.out.println("1. Add Book");
            System.out.println("2. Add Member");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Show All Books");
            System.out.println("6. Show All Members");
            System.out.println("7. Exit");

            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1: // Add Book
                    System.out.print("Enter book title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter author name: ");
                    String author = sc.nextLine();
                    System.out.print("Enter ISBN: ");
                    String isbn = sc.nextLine();
                    System.out.print("Enter total copies: ");
                    int copies = sc.nextInt();
                    System.out.print("Enter price: ");
                    double price = sc.nextDouble();

                    Book book = new Book(title, author, isbn, copies, price);
                    controller.addBook(book);
                    break;

                case 2: // Add Member
                    System.out.print("Enter member name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter member ID: ");
                    int id = sc.nextInt();

                    Member member = new Member(name, id);
                    controller.addMember(member);
                    break;

                case 3: // Issue Book
                    System.out.print("Enter member ID: ");
                    int memberId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter book title: ");
                    String bookTitle = sc.nextLine();

                    controller.issueBook(memberId, bookTitle);
                    break;

                case 4: // Return Book
                    System.out.print("Enter member ID: ");
                    int returnMemberId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter book title: ");
                    String returnBookTitle = sc.nextLine();

                    controller.returnBook(returnMemberId, returnBookTitle);
                    break;

                case 5: // Show All Books
                    controller.showAllBooks();
                    break;

                case 6: // Show All Members
                    controller.showAllMembers();
                    break;

                case 7: // Exit
                    System.out.println("Exiting the system.");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }

        sc.close();
    }
}
