package ChapterTwoExercises;

import java.util.Scanner;

public class QuestionTwoPoint16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any positive number");
        int number = scanner.nextInt();
        int square = number * number;

        if (square > 100) {
            System.out.println("Is greater than 100");
        }
        if (square == 100) {
            System.out.println("Is equal to 100");
        }
        if (square < 100){
            System.out.println("Is less than 100");
        }
        if (square != 100){
            System.out.println("Is not equal to 100");
        }
    }
    }

