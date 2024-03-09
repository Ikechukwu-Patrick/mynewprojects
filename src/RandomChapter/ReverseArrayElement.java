package RandomChapter;

public class ReverseArrayElement {
    public static int[] reverseArrayWithoutTempArray(int[] array) {
        int i = 0, j = array.length - 1;
        while (i < j) {

            array[i] = array[i] + array[j];
            array[j] = array[i] - array[j];
            array[i] = array[i] - array[j];
            i++;
            j--;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] myArray = {12, 3, 4, 5, 6, 78, 90, 34, 56, 7};
        reverseArrayWithoutTempArray(myArray);

        System.out.print("Reversed array: ");
        for (int num : myArray) {
            System.out.print(num + " ");
        }
    }

}
