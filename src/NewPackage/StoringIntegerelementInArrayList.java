package NewPackage;

import java.util.ArrayList;
public class StoringIntegerelementInArrayList {
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(20);
        numbers.add(80);
        numbers.add(46);
        numbers.add(59);
        numbers.add(70);
        for(int i = 0; i < numbers.size(); i++){
            System.out.println(numbers.get(i));
        }
    }

}
