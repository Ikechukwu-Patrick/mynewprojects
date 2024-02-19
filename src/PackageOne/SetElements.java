package PackageOne;

    import java.util.HashSet;
import java.util.Set;
    public class SetElements {
        public static void main(String[] args) {
            // Create a new HashSet to store the elements
            Set<String> set = new HashSet<>();

            // Add elements to the set
            set.add("Apple");
            set.add("Banana");
            set.add("Orange");

            // Print the set
            System.out.println("Set: " + set);

            // Check if an element is present in the set
            System.out.println("Contains 'Apple': " + set.contains("Apple"));

            // Remove an element from the set
            set.remove("Banana");

            // Print the set after removal
            System.out.println("Set after removal: " + set);
        }
    }


