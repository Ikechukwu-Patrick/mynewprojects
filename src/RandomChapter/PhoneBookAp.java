package RandomChapter;
import java.util.Scanner;
public class PhoneBookAp {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            String[] names = new String[10];
            String[] numbers = new String[10];
            int count = 0;
            while (true) {
                System.out.println("Enter 1 to add a new contact, 2 to search for a contact, or 3 to exit:");
                int choice = scanner.nextInt();
                scanner.nextLine();
                if (choice == 1) {
                    System.out.println("Enter the name of the contact: ");
                    String name = scanner.nextLine();

                    System.out.println("Enter the phone number of the contact: ");
                    String number = scanner.nextLine();
                    System.out.println("Contact added successfully");

                    names[count] = name;

                    numbers[count] = number;
                    count++;

                } else if (choice == 2) {
                    System.out.println("Enter the name of the contact to search for saved contacts or numbers: ");

                    String name = scanner.nextLine();
                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (names[i].equals(name)) {
                            System.out.println("The phone number for " + name + " is " + numbers[i]);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("No contact found with the name " + name);
                    }
                } else if (choice == 3) {
                    System.out.println("Out of phone book");
                    System.out.println("Enter 1 to add a new contact\n2 to search for a contact\n3 to exit:");
                    break;
                } else {
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");
                }
            }
        }
    }

