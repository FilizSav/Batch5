package arrays;

import mathClass.MathRandom;

import java.util.Random;

public class Practice {
    public static void main(String[] args) {

       int[][] numbers =
               {{1, 2, 6},
               {6, 1, 2, 3},
               {13, 6, 1, 2, 3}
       };
        System.out.println(numbers[2][0]);

        String word = "Filiz";
        String rWord = "";

        for (int i = word.length()-1; i >=0 ; i--) {
            rWord += word.charAt(i);
        }
        System.out.println(rWord.equals(word));

        String word2 = "I love to work ON Java";

        int[] number1 = {13, 6, 1, 2, 3};
        int sum = 0;

        for (int i : number1) {
            sum+=i;

        }
        System.out.println(sum);
        int sum2 = 0;
        for (int i = 0; i <= 2; i++) {   // sum of three numbers
            sum2 += number1[i];
        }
        System.out.println(sum2);

        int multiply = 1;
        for (int i = number1.length-3; i < number1.length; i++) {
            multiply *= number1[i];
        }
        System.out.println(multiply);

        for (int i = 1; i <=10; i++) {
            if( i % 10 == 0 ) System.out.println("FooBar");
            else if(i % 2 == 0 ) System.out.println("Foo");
            else if (i % 5 == 0) System.out.println("Bar");
            else System.out.println(i);
        }
        int[] numbers2 = {0, -4, -7, 0, 5, 10, 45};



    }
}
