public class PetAdoptionSystem {
    public static void main(String[] args) {
        Pet pet1 = new Pet("Buddy", "Dog", 3);
        Pet pet2 = new Pet("Whiskers", "Cat", 2);

        Adopter adopter1 = new Adopter("Alice", 28, "123-456-7890");
        Adopter adopter2 = new Adopter("Bob", 34, "987-654-3210");

        Shelter shelter = new Shelter("Happy Tails Shelter", "Downtown");

        System.out.println("--- Pet Details ---");
        pet1.displayDetails();
        pet2.displayDetails();

        System.out.println("\n--- Adopter Details ---");
        adopter1.displayDetails();
        adopter2.displayDetails();

        System.out.println("\n--- Shelter Details ---");
        shelter.displayDetails();

        System.out.println("\n--- Comparison ---");
        if (pet1.getType().equals(pet2.getType())) {
            System.out.println("Both pets are of the same type.");
        } else {
            System.out.println("Pets are of different types.");
        }
    }
}
