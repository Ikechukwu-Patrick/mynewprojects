package PackageOne;

public class CreatingAndInitializingArray {
    public static void main(String[] args) {
        int [] array = new int[20];
        System.out.printf("%s%8s%n", "index", "value");

        for (int i = 0; i < array.length; i++){
            System.out.printf("%5d%8d%n", i, array[i]);
        }
    }
}
