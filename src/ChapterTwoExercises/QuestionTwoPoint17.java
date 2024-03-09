package ChapterTwoExercises;

import java.util.Scanner;

public class QuestionTwoPoint17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number one ");
        int num1 = scanner.nextInt();

        System.out.println("Emter second number");
        int num2 = scanner.nextInt();

        System.out.println("Enter third number");
        int num3 = scanner.nextInt();

        int sum = num1 * num2 * num3;
        if (num1 > num2 && num1 > num3){
            System.out.println("The largest is " + num1);
        }
        if (num2 > num1 && num2 > num3){
            System.out.println("The largest is " + num2);
        }
        if (num3 > num1 && num3 > num2){
            System.out.println("The largest is " + num3);
        }
        if (num1 < num2 && num1 < num3){
            System.out.println("The smallest is " + num1);
        }
        if (num2 < num1 && num2 < num3){
            System.out.println("The smallest is" + num2);
        }
        if (num3 < num1 && num3 < num2){
            System.out.println("The smallest is" + num3);
        }
        int average = sum / 3;
        System.out.println("The sum of num1,num2,num3 is " + sum);

        System.out.println("The average is " + average);



    }
}
