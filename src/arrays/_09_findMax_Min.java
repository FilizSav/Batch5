package arrays;

import java.util.Arrays;

public class _09_findMax_Min {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 2, 4, 7, -5};
    }

    public static void findMaxMinSort(int[] num) {
        Arrays.sort(num);
        System.out.println("Max = " + num[num.length - 1]);
        System.out.println("Min = " + num[0]);

    }

    public static void findMaxMin(int[] num) {
        int max = Integer.MIN_VALUE; int min = Integer.MAX_VALUE;

        for (int n : num) {
            if(max < n){
                max = n;
            }
            if(min > n){
                min = n;
            }
        }
        System.out.println("Max is " + max);
        System.out.println("Min is " + min);
    }
}