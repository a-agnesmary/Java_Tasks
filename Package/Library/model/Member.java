package Library.model;

public class Member {
    private String name;
    private int memberId;

    public Member(String name, int memberId) {
        this.name = name;
        this.memberId = memberId;
    }

    public String getDetails() {
        return "Member: " + name + " | ID: " + memberId;
    }

    public String getName() {
        return name;
    }

	public int getId() {
		return memberId;
	}
}
