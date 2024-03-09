package ChapterTwoExercises;

import java.util.Scanner;

public class QuestionTwoPoint15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int numb1 = scanner.nextInt();
        int result = numb1 * 2;

        System.out.println("Enter second number");
        int num2 = scanner.nextInt();
        int sum = num2 * 2;

        int squareSum = result + sum;

        int different = numb1 - num2;

        System.out.println(STR."The square of number one is   \{result}");
        System.out.println(STR."The square of number two is   \{sum}");
        System.out.println(STR."The sum of num one square and num two square is  \{squareSum}");
        System.out.println(STR."The difference of num1 squared and num2 squared is   \{different}");


    }
}
