package practice.arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class FindFirstNegativePositive {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(0, -4, -7, 0, 5, 10, 45));

        printFirstNegPos(nums);

    }

    public static void printFirstNegPos(ArrayList<Integer> numbers){
        int positive = 0;
        int negative = 0;

        for (Integer number : numbers) {
            if (number > 0 && positive == 0) positive = number;
            if (number< 0 && negative == 0) negative = number;
        }
        System.out.println("The first positive number is =  " + positive);
        System.out.println("The first negative number is = " + negative);
    }
}
