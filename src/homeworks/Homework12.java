package homeworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.util.Arrays.*;

public class Homework12 {
    public static void main(String[] args) {
        String s1 = "";
        String s2 = "Java";
        String s3 = "123Hello";
        String s4 = "123Hello World149";
        String s5 = "123Tech456Global149";

        System.out.println("==============TASK 1===================");
        System.out.println(noDigit(s1));
        System.out.println(noDigit(s2));
        System.out.println(noDigit(s3));
        System.out.println(noDigit(s4));
        System.out.println(noDigit(s5));
        System.out.println("==============Second Way================");
        System.out.println(noDigit1(s5));

        System.out.println("==============TASK 2===================");
        String s21 = "";
        String s22 = "JAVA";
        String s23 = "xyz";
        String s24 = "123$";
        String s25 = "TechGlobal";

        System.out.println(noVowel(s21));
        System.out.println(noVowel(s22));
        System.out.println(noVowel(s23));
        System.out.println(noVowel(s24));
        System.out.println(noVowel(s25));

        System.out.println("==============Second Way================");
        System.out.println(noVowel1(s25));

        System.out.println("==============TASK 3===================");
        String s31 = "";
        String s32 = "Java";
        String s33 = "John’s age is 29";
        String s34 = "$125.0";

        System.out.println(sumOfDigits(s31));
        System.out.println(sumOfDigits(s32));
        System.out.println(sumOfDigits(s33));
        System.out.println(sumOfDigits(s34));
        System.out.println("==============Second Way================");
        System.out.println(sumOfDigits1(s31));
        System.out.println(sumOfDigits1(s32));
        System.out.println(sumOfDigits1(s33));
        System.out.println(sumOfDigits2(s34));

        System.out.println("==============TASK 4===================");
        System.out.println(hasUpperCase(s31));
        System.out.println(hasUpperCase(s32));
        System.out.println(hasUpperCase(s33));
        System.out.println(hasUpperCase(s34));
        System.out.println("==============Second Way================");
        System.out.println(hasUpperCase1(s31));
        System.out.println(hasUpperCase1(s32));
        System.out.println(hasUpperCase1(s33));
        System.out.println(hasUpperCase1(s34));
        System.out.println("==============TASK 5===================");
        int[] i5 = {1, 1, 1};
        int[] i51 = {1, 2, 2};
        int[] i52 = {5, 5, 8};
        int[] i53 = {5, 3, 5};
        List<Integer> i54 = new ArrayList<>(asList(-1, 25, 10,11,9));
        System.out.println(middleInt(i5[0], i5[1], i5[2]));
        System.out.println(middleInt(i51[0], i51[1], i51[2]));
        System.out.println(middleInt(i52[0], i52[1], i52[2]));
        System.out.println(middleInt(i53[0], i53[1], i53[2]));
        System.out.println("==============Second Way================");
        System.out.println(middleInt1(i54));

        System.out.println("==============TASK 6===================");
        int[] i6 = {1, 2, 3 ,4};
        int[] i61 = {13, 2, 3};
        int[] i62 = {13, 13, 13 , 13, 13};

        System.out.println(Arrays.toString(no13(i6)));
        System.out.println(Arrays.toString(no13(i61)));
        System.out.println(Arrays.toString(no13(i62)));

        System.out.println("==============TASK 7===================");
        int[] i7 = {1, 2, 3 ,4};
        int[] i71 = {0,5};
        int[] i72 = {5 , 0, 6};
        int[] i73 = {};

        System.out.println(Arrays.toString(arrFactorial(i7)));
        System.out.println(Arrays.toString(arrFactorial(i71)));
        System.out.println(Arrays.toString(arrFactorial(i72)));
        System.out.println(Arrays.toString(arrFactorial(i73)));

        System.out.println("==============TASK 8===================");
        String s8 ="abc123$#%";
        String s81 ="12ab$%3c%";
        String s82 ="    ";

        System.out.println(Arrays.toString(categorizeCharacters(s8)));
        System.out.println(Arrays.toString(categorizeCharacters(s81)));
        System.out.println(Arrays.toString(categorizeCharacters(s82)));

    }

    public static String noDigit(String str) {
        return str.replaceAll("[0-9]", "");
    }

    public static String noDigit1(String str) {
        String s = "";
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i)))
                s += str.charAt(i);
        }
        return s;
    }

    public static String noVowel(String str) {
        return str.replaceAll("(?i)[,a,e,i,o,u]", "");
    }

    public static String noVowel1(String str) {
        String s = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.toLowerCase().charAt(i) != 'a' && str.toLowerCase().charAt(i) != 'e' && str.toLowerCase().charAt(i) != 'i'
                    && str.toLowerCase().charAt(i) != 'o' && str.toLowerCase().charAt(i) != 'u') s += str.charAt(i);
        }
        return s;
    }

    public static int sumOfDigits(String str) {
        int sum = 0;
        String s = str.replaceAll("\\D", "");
        for (int i = 0; i < s.length(); i++) {
            sum += Integer.parseInt(String.valueOf(s.charAt(i)));
        }
        return sum;
    }

    public static int sumOfDigits1(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) sum += Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        return sum;
    }

    public static int sumOfDigits2(String str) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) list.add(Integer.parseInt(String.valueOf(str.charAt(i))));
        }
        return list.stream().mapToInt(e -> e).sum();
    }

    public static boolean hasUpperCase(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) return true;
        }
        return false;
    }

    public static boolean hasUpperCase1(String str) {
        return str.replaceAll("[A-Z]", "").length() != str.length();
    }

    public static int middleInt(int x, int y, int z) {
        return -Math.max(Math.max(x, y), z) - Math.min(Math.min(x, y), z) + x + y + z;
    }

    public static int middleInt1(List<Integer> arr) {
        Collections.sort(arr);
        return arr.get(arr.size()/2);
    }
    public static int[] no13(int[] arr){
        int[] newA = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 13) arr[i] = 0; newA[i] = arr[i];
        }return newA;
    }
    public static int[] arrFactorial(int[] arr){
        int[] newA = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int factorial = 1;
            for (int j = 1; j <=arr[i]; j++)
                factorial *= j;
                newA[i] = factorial;
        }return newA;
    }
    public static String[] categorizeCharacters(String str){
        String[] s = new String[3];
        String letter = "", digits = "", special = "";
        for (int i = 0; i < str.length(); i++) {
         if(Character.isLetter(str.charAt(i))) letter += str.charAt(i);
         else if (Character.isDigit(str.charAt(i))) digits += str.charAt(i);
         else special += str.charAt(i);
         s[0] = letter; s[1] = digits; s[2] = special.trim();
        }
        return s;
    }
}
