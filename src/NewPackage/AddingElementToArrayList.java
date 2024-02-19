package NewPackage;

import java.util.ArrayList;
public class AddingElementToArrayList {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("Mesdisbenz");
        cars.add("Lamboghini");
        cars.add("Toyota");
        for (String car : cars) {
            System.out.println(car);
        }


    }
}
