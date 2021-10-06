package model;

public class Customers {
    private String name;
    private String dateOfBirth;
    private String id;

    public Customers() {
    }

    public Customers(String name, String dateOfBirth, String id) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Customers { " +
                " FullName ='" + name + '\'' +
                " , DateOfBirth = '" + dateOfBirth + '\'' +
                " , ID = '" + id + '\'' +
                " }";
    }
}
