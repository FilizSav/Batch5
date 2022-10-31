package homeworks;

import conditional_statements.if_else_statements.IfElseSyntax;
import utilities.CharMethods;

import java.util.Arrays;

public class Homework06 {
    public static void main(String[] args) {

        System.out.println("------------Task 1-----------");

        int[] numbers = new int[10];
        numbers[0] = 89;
        numbers[2] = 23;
        numbers[4] = 12;
        numbers[6] = 15;
        numbers[7] = 34;
        numbers[9] = 7;

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

        System.out.println("------------Task 5-----------");

        String[] cartoons = {"ScoobyDoo", "Snoopy", "Blue", "Pluto", "Dino", "Sparky"};

        System.out.println(Arrays.toString(cartoons));

        boolean pluto = false;

        for (String object : cartoons) {
            if (object.equals("Pluto")) {
                pluto = true;
                break;
            }
        }
        System.out.println(pluto);

        System.out.println("------------Task 6-----------");

        String[] cats = {"Garfield", "Tom", "Sylvester", "Azrael"};

        Arrays.sort(cats);
        System.out.println(Arrays.toString(cats));

        boolean cat1 = false;
        boolean cat2 = false;
        for (String object : cats) {
            if (object.equals("Garfield")) {cat1 = true;
            }else if (object.equals("Azrael")) cat2 = true;
        }
        System.out.println(cat1 == cat2);

        System.out.println("------------Task 7-----------");

        double[] nums = {10.5, 20.75, 70, 80, 15.75};

        System.out.println(Arrays.toString(nums));

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
        System.out.println("------------Task 8-----------");
        int countL = 0, countLow = 0, countUp = 0, countDigit = 0, countSpecial = 0;

        char[] characters = {'A', 'b', 'G', 'H', '7', '5', '&', '*', 'e', '@', '4'};

        System.out.println(Arrays.toString(characters));
        for (Character object : characters) {
            if (Character.isLetter(object)) {
                countL++;}
            if (Character.isUpperCase(object)) {
            countUp++;}
            else if (Character.isLowerCase(object)) {
                countLow++;}
            else if (Character.isDigit(object)){
                countDigit++;
            }else countSpecial++;
    }
        System.out.println("Letters = " + countL + "\nUppercase letters =" + countUp +
         "\nLowerCase letters = " + countLow + "\nDigits = " + countDigit + "\nSpecial character ="+ countSpecial);

        System.out.println("------------Task 9-----------");

    String[] objects = {"Pen", "notebook", "Book", "paper", "bag", "pencil", "Ruler"};

        System.out.println(Arrays.toString(objects));
        int countUpper =0, countLower =0, startsPB =0, countBookPen =0;
        for (String s : objects) {
            if(CharMethods.isUppercase(s.charAt(0))) countUpper++;
            else if (Character.isLowerCase(s.charAt(0))) countLower++;
            if (s.toLowerCase().startsWith("p") || s.toLowerCase().startsWith("b"))
                startsPB++;
            if(s.toLowerCase().contains("book") || s.toLowerCase().contains("pen")) countBookPen++;
        }
        System.out.println("Elements starts with uppercase = " +countUpper);
        System.out.println("Elements starts with lowercase = " + countLower);
        System.out.println("Elements starts with B or P = " + startsPB);
        System.out.println("Elements having \"book\" or \"pen\" = " + countBookPen);

        System.out.println("------------Task 10-----------");

        int[] numbers1 = {3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78};

        System.out.println(Arrays.toString(numbers1));

        int greaterTen = 0, lessTen = 0, ten = 0;
        for (int n : numbers1) {
            if (n > 10) greaterTen++;
            else if (n< 10) lessTen++;
            else ten++;
        }
        System.out.println("Elements that are more than 10 = " +greaterTen);
        System.out.println("Elements that are less than 10 = " + lessTen);
        System.out.println("Elements that are 10 = " + ten);

        System.out.println("------------Task 11-----------");

        int[] array1 = {5, 8, 13, 1, 2};
        int[] array2 = {9, 3, 67, 1, 0};
        int[] array3 = new int[5];
        int max = 0;
        for (int i = 0; i < array1.length; i++) {
            if(array1[i]>array2[i]) {
                max = array1[i];
            }else max= array2[i];
            array3[i] += max;
        }

        System.out.println("1st array is =  " + Arrays.toString(array1));
        System.out.println("2nd array is =  " + Arrays.toString(array2));
        System.out.println("3rd array is =  " + Arrays.toString(array3));

    }
}