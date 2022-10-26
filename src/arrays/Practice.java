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
    }
}
