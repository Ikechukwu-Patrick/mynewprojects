package RandomChapter;

public class CalculatingValuesForEachElement {
    public static void main(String[] args) {
        final int ARRAY_LENGTH = 10;
        int [] myArray = new int[ARRAY_LENGTH];
        for (int counter = 0; counter < myArray.length; counter++){
            myArray[counter] = 2 + 2 * counter;
        }
        System.out.printf("%s%8s%n", "index", "value");


        for (int counter = 0; counter < myArray.length; counter++){
            System.out.printf("%5d%8d%n", counter, myArray[counter]);
        }


    }


}