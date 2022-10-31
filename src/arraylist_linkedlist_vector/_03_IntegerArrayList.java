package arraylist_linkedlist_vector;

import java.util.ArrayList;

public class _03_IntegerArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println(numbers);
        System.out.println(numbers.size());

        System.out.println("\n--------------contains() method --------------");

        System.out.println(numbers.contains(10)); // true
        System.out.println(numbers.contains(12)); // false

        System.out.println("\n--------------indexOf() method --------------");

        System.out.println(numbers.indexOf(15)); // 1
        System.out.println(numbers.indexOf(25)); //-1
        System.out.println(numbers.indexOf(20)); //2

        System.out.println("\n--------------lastIndexOf() method --------------");

        System.out.println(numbers.lastIndexOf(30)); // 5
        System.out.println(numbers.lastIndexOf(35)); //-1
        System.out.println(numbers.lastIndexOf(10)); // 3

        System.out.println("\n--------------Retrieving each element for forI loop --------------");

        numbers.get(0);
        numbers.get(1);
        numbers.get(2);
        numbers.get(3);
        numbers.get(3);
        numbers.get(5);

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
        System.out.println("\n--------------Retrieving each element for for each loop --------------");

        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}
