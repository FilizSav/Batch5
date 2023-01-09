package homeworks;

import java.util.Arrays;
import java.util.LinkedHashMap;

public class Homework14 {
    public static void main(String[] args) {

        System.out.println("\n=============Task 1============");
        fizzBuzz1(30);

        System.out.println("\n=============Task 2============");
        fizzBuzz11(7);

        System.out.println("\n=============Task 3============");
        String s3 = "abc$”";
        String s31 = "a1b4c  6#";
        String s32 = "ab110c045d";
        String s33 = "525";
        System.out.println(findSumNumbers(s3));
        System.out.println(findSumNumbers(s31));
        System.out.println(findSumNumbers(s32));
        System.out.println(findSumNumbers(s33));

        System.out.println("\n=============Task 4============");
        String s4 = "abc$”";
        String s41 = "a1b4c  6#";
        String s42 = "ab110c045d";
        String s43 = "525";
        System.out.println(findBiggestNumber(s4));
        System.out.println(findBiggestNumber(s41));
        System.out.println(findBiggestNumber(s42));
        System.out.println(findBiggestNumber(s43));

        System.out.println("\n=============Task 5============");
        String s5 = "";
        String s51 = "abc ";
        String s52 = "abbcca ";
        String s53 = "aaAAa ";
        System.out.println(countSequenceOfCharacters(s5));
        System.out.println(countSequenceOfCharacters(s51));
        System.out.println(countSequenceOfCharacters(s52));
        System.out.println(countSequenceOfCharacters(s53));

    }
    public static void fizzBuzz1(int x){
        for (int i = 1; i <= x; i++) {
            if (i % 15 == 0) System.out.println("FizzBuz");
            else if (i % 3 == 0) System.out.println("Fizz");
            else if (i % 5 == 0) System.out.println("Buzz");
            else System.out.println(i);
        }
    }
    public static void fizzBuzz11(int x){
        for (int i = 1; i <= 1; i++) {
            if (x % 15 == 0) System.out.println("FizzBuz");
            else if (x % 3 == 0) System.out.println("Fizz");
            else if (x % 5 == 0) System.out.println("Buzz");
            else System.out.println(x);
        }
    }
    public static int findSumNumbers(String str){
        String[] s = str.split("[\\D]");
        int sum = 0;
        for (int i = 0; i < s.length; i++) {
            if(s[i].length() == 0) continue;
            sum += Integer.parseInt(String.valueOf(s[i]));
        }
        return sum;
    }
    public static int findBiggestNumber(String str){
        String[] s = str.split("[\\D]");
        int biggest = 0;
        for (int i = 0; i < s.length; i++) {
            if(s[i].length() == 0) continue;
            if(Integer.parseInt(String.valueOf(s[i])) > biggest) biggest = Integer.parseInt(String.valueOf(s[i]));
        }
        return biggest;
    }
    public static String countSequenceOfCharacters(String s){
        StringBuilder result = new StringBuilder();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i < s.length()-1 && s.charAt(i) == s.charAt(i+1)){
                count ++;
            } else {
                count ++;
                result.append(count).append(s.charAt(i));
                count = 0;
            }
        }return result.toString();
    }
}
