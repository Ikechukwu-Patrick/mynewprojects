package ChapterTwoExercises;

import java.util.Scanner;

public class QuestionTwoPoint25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any positive integer");
        int number = scanner.nextInt();

        if (number % 3 == 0){
            System.out.println(number + "is divisible by 3");
        }
        else {
            System.out.println(number + "is not divisible by 3");
        }
    }
}
