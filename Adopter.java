public class Adopter {
    private String name;
    private int age;
    private String contact;

    public Adopter(String name, int age, String contact) {
        this.name = name;
        this.age = age;
        this.contact = contact;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "Adopter{name='" + name + "', age=" + age + ", contact='" + contact + "'}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Adopter adopter = (Adopter) obj;
        return age == adopter.age && name.equals(adopter.name) && contact.equals(adopter.contact);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(name, age, contact);
    }
}
