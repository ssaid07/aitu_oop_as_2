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

    @Override
    public String toString() {
        return "Shelter{name='" + name + "', location='" + location + "'}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Shelter shelter = (Shelter) obj;
        return name.equals(shelter.name) && location.equals(shelter.location);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(name, location);
    }
}
