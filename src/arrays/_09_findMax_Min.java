package arrays;

import java.util.Arrays;

public class _09_findMax_Min {
    public static void main(String[] args) {
        int[] num2 = {3,9,11,1,12,25,6,-1,-4};

        int min = num2[0]; // int min = Integer.Max_Value;     or min = Math.min(min,number);
        for (int i : num2) {
            if(i < min) min = i;
        }
        System.out.println(min);

        int secMin = Integer.MAX_VALUE;

        for (int i : num2) {
            if(i < secMin && i !=min) secMin = i;

        }
        System.out.println(secMin);

        int[] numbers = {5, 3, 2, 4, 7, -5};
        findMaxMinSort(numbers);
    }

    public static void findMaxMinSort(int[] num) {
        Arrays.sort(num);
        System.out.println("Max = " + num[num.length - 1]);
        System.out.println("Min = " + num[0]);

    }

}