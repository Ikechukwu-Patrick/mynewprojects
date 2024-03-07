package FireDrillExercise;

import java.util.ArrayList;
public class Car {
    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<>();
        cars.add("Lexus");
        cars.add("Toyota");
        cars.add("Prada");
        for (int i = 0; i < cars.size(); i++) {
            if (i % 2 == 0){
                System.out.println("Even" + i);
                continue;
            }
            System.out.println("old number"  + i);
            System.out.println(cars.get(i));
        }

    }

}
