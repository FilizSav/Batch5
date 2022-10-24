package arrays;

import java.util.Arrays;

public class SearchingInArrays {
    public static void main(String[] args) {

        int[] numbers = {3, 5, 8, 10};

        boolean hasSeven = false;
        for (int number : numbers) {
            if (number == 7) hasSeven = true;
            break;
        }
        System.out.println(hasSeven);

        boolean hasFive = false;

        for (int number : numbers) {
            if (number == 5 ) {hasFive = true;
            break;}
        }
        System.out.println(hasFive);

        System.out.println("===========Binary Search==========");

        //Binary can be used if the array is sorted ONLY, otherwise you will get wrong results
        //Binary search returns the index of the element is found

        Arrays.sort(numbers);
        Arrays.binarySearch(numbers, 5); // its highlighted because it is redundant

        System.out.println(Arrays.binarySearch(numbers,10)); // 3 index of array
    }
}
