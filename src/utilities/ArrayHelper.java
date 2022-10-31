package utilities;

import java.util.Arrays;

public class ArrayHelper {
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
    public static int findMax(int[] numbers){
        int max = Integer.MIN_VALUE;
        for (int n : numbers) {
            if (n > max) max = n;
        }
        return max;
    }
    public static int findMin(int[] numbers){
        int min = Integer.MAX_VALUE;
        for (int n : numbers) {
            if (n < min) min = n;
        }
        return min;
    }
    public static void findMaxMinSort(int[] num) {
        Arrays.sort(num);
        System.out.println("Max = " + num[num.length - 1]);
        System.out.println("Min = " + num[0]);

    }
}
