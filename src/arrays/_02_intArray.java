package arrays;

import java.util.Arrays;

public class _02_intArray {
    public static void main(String[] args) {
        // for each number in numbers  :  <-- in  for each loop

        // 1. Create an int array and store 0, -5, 2, 10, 5, 2, -1, 0

        int[] numbers = {0, -5, 2, 10, 5, 2, -1, 0};

        System.out.println(Arrays.toString(numbers));

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        for (int number :numbers) {
            System.out.println(number);
        }
    }
}
