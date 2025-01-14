public class Shelter {
    private String name;
    private String location;

    // Constructor
    public Shelter(String name, String location) {
        this.name = name;
        this.location = location;
    }

    // Getter and Setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    // Method to display shelter details
    public void displayDetails() {
        System.out.println("Shelter Name: " + name + ", Location: " + location);
    }
}