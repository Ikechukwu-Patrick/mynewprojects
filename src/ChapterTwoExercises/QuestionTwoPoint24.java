package ChapterTwoExercises;

import java.util.Scanner;

public class QuestionTwoPoint24 {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integer one");
        int num1 = scanner.nextInt();

        System.out.println("Enter integer two");
        int num2 = scanner.nextInt();

        System.out.println("Enter integer three");
        int num3 = scanner.nextInt();

        System.out.println("Enter integer four");
        int num4 = scanner.nextInt();

        System.out.println("Enter integer five");
        int num5 = scanner.nextInt();

        if (num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5){
            System.out.println("The largest is " + num1);
        }
        if (num2 > num1 && num2 > num3 && num2 > num4 && num2 > num5){
            System.out.println("The largest is  " + num2);
        }
        if (num3 > num1 && num3 > num2 && num3 > num4 && num3 > num5){
            System.out.println("The largest is " + num3);
        }
        if (num4 > num1 && num4 > num2 && num4 > num3 && num4 > num5){
            System.out.println("The largest is " + num4);
        }
        if (num5 > num1 && num5 > num2 && num5 > num3 && num5 > num4){
            System.out.println("The largest is " + num5);
        }

            /* For finding smallest integers */

        if (num1 < num2 && num1 < num3 && num1 < num4 && num1 < num5){
            System.out.println("The smallest is " + num1);
        }
        if (num2 < num1 && num2 < num3 && num2 < num4 && num2 < num5){
            System.out.println("The smallest is  " + num2);
        }
        if (num3 < num1 && num3 < num2 && num3 < num4 && num3 < num5){
            System.out.println("The smallest is " + num3);
        }
        if (num4 < num1 && num4 < num2 && num4 < num3 && num4 < num5){
            System.out.println("The smallest is " + num4);
        }
        if (num5 < num1 && num5 < num2 && num5 < num3 && num5 < num4){
            System.out.println("The smallest is " + num5);
        }

    }
}
