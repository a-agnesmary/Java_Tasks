package University.faculty;

public class Faculty {
    private int id;
    private String name;
    private String department;

    public Faculty(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Faculty ID: " + id + ", Name: " + name + ", Department: " + department;
    }
}
