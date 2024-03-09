package ChapterTwoExercises;

import java.util.Scanner;

public class QuestionTwoPoint26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any positive number");
        int num1 = scanner.nextInt();
        int tripleNumber = num1 * num1 * num1;

        System.out.println("Enter any positive number");
        int num2 = scanner.nextInt();
        int doubleNumber = num2 * num2;

        if (tripleNumber % doubleNumber == 0){
            System.out.println(tripleNumber + " is divisible by " + doubleNumber);
        }
        else {
            System.out.println(tripleNumber + " is not divisible by " + doubleNumber);
        }

    }
}
