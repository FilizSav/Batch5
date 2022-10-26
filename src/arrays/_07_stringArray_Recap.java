package arrays;

import java.util.Arrays;

public class _07_stringArray_Recap {
    public static void main(String[] args) {

        String[] fruits = new String[4];

        fruits[0] = "Apple";
        fruits[3] = "Kiwi";

        System.out.println(Arrays.toString(fruits));

        fruits[1] = "Grapes";
        fruits[2] = "Orange";

        System.out.println(Arrays.toString(fruits));

        fruits[3] = fruits[0];
        fruits[2] = fruits[0];

        System.out.println(Arrays.toString(fruits));
        for (String fruit : fruits) {
            System.out.println(fruit);
        }




    }
}
