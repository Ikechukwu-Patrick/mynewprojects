import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter any positive number from 1 - 20 ");
        int number = input.nextInt();

        number = number**number;

        System.out.print(number);

    }
}
