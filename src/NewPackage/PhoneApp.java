package NewPackage;
import java.util.Scanner;
import java.util.HashMap;
public class PhoneApp {
        private static final HashMap<String, String> phoneBook = new HashMap<>();
        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
            boolean running = true;


            while (running) {
                System.out.println("Welcome to Phone Book App!");
                System.out.println("Please choose an option:");
                System.out.println("1. Add a new contact");
                System.out.println("2. Search for a contact by name");
                System.out.println("3. Display all contacts");
                System.out.println("4. Exit the app");

                int choice = scanner.nextInt();

                scanner.nextLine();

                switch (choice) {
                    case 1:
                        addContact();
                        break;
                    case 2:
                        searchContact();
                        break;
                    case 3:
                        displayContacts();
                        break;
                    case 4:
                        System.out.println("Thank you for using Phone Book App!");
                        running = false;
                        break;
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            }


        }

        public static void addContact() {
            System.out.println("Enter the name of the contact:");
            String name = scanner.nextLine();
            System.out.println("Enter the phone number of the contact:");
            String number = scanner.nextLine();

            phoneBook.put(name, number);
            System.out.println("Contact added successfully!");
        }
        public static void searchContact() {
            System.out.println("Enter the name of the contact to search:");
            String name = scanner.nextLine();
            if (phoneBook.containsKey(name)) {

                String number = phoneBook.get(name);
                System.out.println("The phone number of " + name + " is " + number);
            } else {
                System.out.println("No contact found with that name.");
            }
        }

        public static void displayContacts() {
            System.out.println("The contacts in the phone book are:");

            for (HashMap.Entry<String, String> entry : phoneBook.entrySet()) {

                String name = entry.getKey();
                String number = entry.getValue();
                System.out.println(name + " - " + number);
            }
        }
    }

