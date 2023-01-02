package collections;

import java.util.Arrays;
import java.util.TreeSet;

public class Practice03_Subset {
    public static void main(String[] args) {

        TreeSet<Integer> nums = new TreeSet<>(Arrays.asList(3,2,7,10, 15,20,7,5));

        System.out.println(nums.tailSet(7,false).size()); //counting getting the size
        System.out.println(nums.headSet(5, true));
        System.out.println(nums.subSet(5, true, 15, true));

        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(3);
        numbers.add(1);
        numbers.add(2);
        numbers.add(7);
        numbers.add(10);

        System.out.println(numbers);
        System.out.println(numbers.first()); // retrieves and returns first element
        System.out.println(numbers);
        System.out.println(numbers.pollFirst()); // retrieves and removes first element
        System.out.println(numbers);

        numbers.clear();

        System.out.println(numbers.last());

    }
}
