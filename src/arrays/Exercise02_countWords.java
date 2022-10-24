package arrays;

import java.util.Arrays;

public class Exercise02_countWords {
    public static void main(String[] args) {

      String word = "I love arrays";

      int counter = 1;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ' ') counter++;
        }
        System.out.println(counter);

        System.out.println("    \n For i  ");

        int countC = 1;
        for (char c : word.toCharArray()) {
            if (c == ' ') countC++;
        }
        System.out.println(countC);  // declare 0 and add 1


        System.out.println("    \n Split Method  ");

        String[] arr = word.split(" ");
        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length);

        System.out.println(word.split("").length); // one code solution

    }
}
