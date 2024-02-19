package FireDrillExercise;

import java.util.Arrays;

public class QuestionOne {
    public static int[] sortForEvenAndOldWithZeroAndOne(int [] numbers){
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = numbers[i] % 2;
        }
        return numbers;
    }

    public static void main(String[] args) {
        int[] myArray = new int[]{12,34,56,89,80,34,22,2};
        int[] number = sortForEvenAndOldWithZeroAndOne(myArray);
        System.out.println(Arrays.toString(number));
    }
}

