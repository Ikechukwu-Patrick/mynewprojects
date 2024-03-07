package segmentDisplay;

import java.util.Scanner;

public class segment {


    public static String seg(String number) {
        String value = null;
        if (number.length() >= 8) {
            throw new InvalidInputException("The number you input is more than 8 ");
        }
        if (number == "1111001") {
            value = String.format("""
                    ****
                       *
                    ****
                       *   
                    ****
                    """);
        }
        return value;
    }

    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter segment Number: ");
            String number = input.nextLine();
            System.out.println(seg(number));
        } catch (InvalidInputException exception) {
            System.out.println(exception.getMessage());
        }

    }
}
