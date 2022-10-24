package homeworks;

import java.util.Arrays;

public class Homework06 {
    public static void main(String[] args) {

        System.out.println("------------Task 1-----------");

        int[] numbers = new int[10];
        numbers[0]= 89;
        numbers[2]= 23;
        numbers[4]= 12;
        numbers[6]= 15;
        numbers[7]= 34;
        numbers[9]= 7;

        System.out.println(numbers[3]);
        System.out.println(numbers[0]);
        System.out.println(numbers[9]);

        System.out.println(Arrays.toString(numbers));

        System.out.println("------------Task 2-----------");

        String[] letters = new String[5];

        letters[1] = "abc";
        letters[4] = "xyz";

        System.out.println(letters[3]);
        System.out.println(letters[0]);
        System.out.println(letters[4]);

        System.out.println(Arrays.toString(letters));

        System.out.println("------------Task 3-----------");


        int[] number1s = {23, -34, -56, 0, 89, 100};

        System.out.println(Arrays.toString(number1s));

        Arrays.sort(number1s);
        System.out.println(Arrays.toString(number1s));

        System.out.println("------------Task 4-----------");

        String[] countries = {"Germany", "Argentina", "Ukraine", "Romania"};

        System.out.println(Arrays.toString(countries));

        Arrays.sort(countries);
        System.out.println(Arrays.toString(countries));


    }
}