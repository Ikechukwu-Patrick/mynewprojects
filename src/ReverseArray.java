import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array = {12,45,23,45,67,89,23,45,67,68,34,56,78,12,34,45,63,12,};
        int [] reverseArray = new int[array.length];
        int reviser = array.length-1;
        for (int index = 0; index < array.length; index++){
            reverseArray[index] = array[reviser];
            reviser--;

        }
        System.out.println(Arrays.toString(reverseArray));
        System.out.println("==========================================================================");
        for (int index = 0; index < reverseArray.length; index++){
            if (index == 8){
                System.out.println("am here");
                continue;
            }
            if (index % 2 == 0){
                System.out.println(array[index]);
            }

        }
    }
}
