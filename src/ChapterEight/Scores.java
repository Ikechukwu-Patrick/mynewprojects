package ChapterEight;

import java.util.Scanner;

public class Scores {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of time you want to collect scores:");
        int num = scanner.nextInt();
        int result = 0;
        double average = 0;
        int total = 0;
        for (int i = 0; i < num; i++) {
            System.out.println("Enter scores:");
            result = scanner.nextInt();
            total += result;
            average = (double) total / num;
        }
        System.out.println("Sums of scores are:" + average);
        
    }
    }


