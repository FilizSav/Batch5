package arraylist_linkedlist_vector;

import java.util.Arrays;
import java.util.Vector;

public class Exercise04_CountElements {
    public static void main(String[] args) {
        Vector<Integer> numbers = new Vector<>(Arrays.asList(10, 15, 20, 25, 30));

        int count = 0, countOdd = 0, count15more = 0;
        for (Integer n : numbers) {
            if(n % 2 == 0) count++;
            if (n % 2 != 0) countOdd++;
            if (n > 15) count15more++;
        }
        System.out.println(count + " \n" + countOdd + "\n" + count15more);


        System.out.println(numbers.stream().filter(x -> x % 2 == 0).count());
        System.out.println(numbers);

        System.out.println(numbers.stream().filter(x -> x  % 2 != 0).count());
        System.out.println(numbers.stream().filter(x -> x > 15).count());
        System.out.println(numbers.stream().filter(x -> x != 20).count());
    }

}
