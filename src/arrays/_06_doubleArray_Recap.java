package arrays;

import java.util.Arrays;

public class _06_doubleArray_Recap {
    public static void main(String[] args) {

        double[] decimals = {1.5, 2.3, -1.3, -3.7};
        char[] chars = {'a', 'b', 'c', 'd'};

        System.out.println(Arrays.toString(decimals));
        System.out.println("The length of the array is " + decimals.length);

        Arrays.sort(decimals);
        System.out.println("Array after sorting "+ Arrays.toString(decimals));

        System.out.println(" \n        For I         ");

       for (int i = 0; i < decimals.length; i++) {System.out.println(decimals[i]);}

        System.out.println(" \n        For Each         ");
       // when you don't need to index or an increment number to use go with for each arrays

        for (double decimal : decimals) {
            System.out.println(decimal);
        }
        System.out.println(" \n        For I   printing 2 arrays      ");

        for (int i = 0; i < decimals.length; i++) {
            System.out.println(decimals[i] + " - " + chars[i]);

        }
    }
}
