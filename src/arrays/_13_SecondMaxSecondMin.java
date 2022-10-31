package arrays;

import utilities.ArrayHelper;

public class _13_SecondMaxSecondMin {
    public static void main(String[] args) {

        int[] numbers = {2, 3, 7, 1, 1, 7};
        SecondMaxMin(numbers);

        int[] numbers1 = {2, 3, 7, 1, 1, 7};
        printMaxMinSecondMaxAndMin(numbers1);
    }
   public static void SecondMaxMin(int[] num){

        int maxArray = Integer.MIN_VALUE, minArray = Integer.MAX_VALUE, max2 = Integer.MIN_VALUE, min2 =Integer.MAX_VALUE;

       for (int i : num) {
           if(i > maxArray) maxArray=i;
           if(i < minArray) minArray = i;
           if(i > max2 && i < ArrayHelper.findMax(num)) max2 = i;
           if (i < min2 && i >ArrayHelper.findMin(num)) min2 = i;
       }
       System.out.println("Max = " + maxArray);
       System.out.println("Second Max  = " + max2);
       System.out.println("Min = " + minArray);
       System.out.println("Second min = " + min2);
   }
    /*
    create a public static method which will take an int array, find the max, second max and min, second min
    from that array then print them out.
    Hint: Find the max and min FIRST.
    Note: Do it with sort and without sort.
    Example:
       Array -> int[] numbers = {2, 3, 7, 1, 1, 7};
    Output:
        max = 7
        second max = 3
        min = 1
        second min= 2
     */



    public static void printMaxMinSecondMaxAndMin(int[] numbers){

        int secondMax = Integer.MIN_VALUE, secondMin = Integer.MAX_VALUE;

        for (int n : numbers) {
            if (n > secondMax && n < ArrayHelper.findMax(numbers)){
                secondMax = n;
            }

            if (n < secondMin && n > ArrayHelper.findMin(numbers)){
                secondMin = n;
            }
        }

        System.out.println("max = " + ArrayHelper.findMax(numbers));
        System.out.println("second max = " + secondMax );
        System.out.println("min = " + ArrayHelper.findMin(numbers));
        System.out.println("second min = " + secondMin );
}}