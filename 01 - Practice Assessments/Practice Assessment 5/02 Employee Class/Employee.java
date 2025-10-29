public class Employee {
    private int id;
    private String name;
    private String role;
    private int yearEmployed;

    Employee(int id, String name, String role, int yearEmployed) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.yearEmployed = yearEmployed;
    } // i like using this keyword

    int getId() {
        return id;
    }

    void setId(int id) {
        this.id = id;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    String getRole() {
        return role;
    }

    void setRole(String role) {
        this.role = role;
    }

    int getYearEmployed() {
        return yearEmployed;
    }

    void setYearEmployed(int yearEmployed) {
        this.yearEmployed = yearEmployed;
    }
}
