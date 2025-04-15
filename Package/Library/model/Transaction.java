package Library.model;

public class Transaction {
    private Member member;
    private Book book;
    private String type;

    public Transaction(Member member, Book book, String type) {
        this.member = member;
        this.book = book;
        this.type = type;
    }

    public String process() {
        switch (type.toLowerCase()) {
            case "issue":
                if (book.issueCopy()) {
                    return member.getName() + " issued " + book.getTitle();
                }
                return "No copies available for " + book.getTitle();
            case "return":
                book.returnCopy();
                return member.getName() + " returned " + book.getTitle();
            default:
                return "Invalid transaction type.";
        }
    }
}
