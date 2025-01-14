import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PetAdoptionSystem {
    public static void main(String[] args) {
        List<Pet> pets = new ArrayList<>();
        pets.add(new Pet("Buddy", "Dog", 3));
        pets.add(new Pet("Whiskers", "Cat", 2));
        pets.add(new Pet("Charlie", "Bird", 1));
        pets.add(new Pet("Max", "Dog", 4));

        List<Adopter> adopters = new ArrayList<>();
        adopters.add(new Adopter("Alice", 28, "123-456-7890"));
        adopters.add(new Adopter("Bob", 34, "987-654-3210"));

        Shelter shelter = new Shelter("Happy Tails Shelter", "Downtown");

        System.out.println("--- All Pets ---");
        pets.forEach(System.out::println);

        System.out.println("\n--- Filtered Pets (Dogs) ---");
        List<Pet> dogs = pets.stream().filter(pet -> pet.getType().equals("Dog")).collect(Collectors.toList());
        dogs.forEach(System.out::println);

        System.out.println("\n--- Sorted Pets by Age ---");
        List<Pet> sortedPets = pets.stream().sorted(Comparator.comparingInt(Pet::getAge)).collect(Collectors.toList());
        sortedPets.forEach(System.out::println);

        System.out.println("\n--- Adopters ---");
        adopters.forEach(System.out::println);

        System.out.println("\n--- Shelter Details ---");
        System.out.println(shelter);
    }
}
