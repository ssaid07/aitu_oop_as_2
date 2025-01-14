public class Shelter {
    private String name;
    private String location;

    public Shelter(String name, String location) {
        this.name = name;
        this.location = location;
    }

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

    public void displayDetails() {
        System.out.println("Shelter Name: " + name + ", Location: " + location);
    }
}