package RandomChapter;

public class InitialArray {
    public static void main(String[] args) {
        int [] myArray = new int[10];
        for (int index = 0; index < myArray.length; index++){
            System.out.printf("%5d%8d%n",index, myArray[index]);
        }
    }
}
