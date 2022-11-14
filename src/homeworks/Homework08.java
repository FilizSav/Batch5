package homeworks;

import utilities.ScannerHelper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Homework08 {
    public static void main(String[] args) {

        System.out.println("\n===============Task1==============\n");
        System.out.println(countConstants("hello"));

        System.out.println("\n===============Task2==============\n");
        System.out.println(Arrays.toString(wordArray("Hello, it is cold out")));

        System.out.println("\n===============Task3==============\n");
        System.out.println(removeSpaces("I love      java"));

        System.out.println("\n===============Task4==============\n");
        count3OrLess();
        count3OrLess2();

        System.out.println("\n===============Task5==============\n");
        System.out.println(isDateFormatValid("10/24/1980"));

        System.out.println("\n===============Task6==============\n");
        System.out.println(isEmailFormatValid("filizsav@gmail.com"));
    }
    public static int countConstants(String str){
        return (str.length() - str.toLowerCase().replaceAll("[^a,e,i,o,u\\d^ ^!@#$%^&*()]","").length());
    }
    public static String[] wordArray(String str){
        String wordArr = str.replaceAll("[^A-Za-z ']", "");
        return wordArr.split(" ");
    }
    public static String removeSpaces(String str){
       String newS = str.replaceAll(" +", " ");
        return newS;
    }

    public static void count3OrLess(){
        int counter = 0;
        String[] sentence = ScannerHelper.getAString().split(" ");
        for (String s : sentence) {
           if( s.length() <= 3) counter++;
        }
        System.out.println(counter);
    }
    public static void count3OrLess2() {
        String str = ScannerHelper.getAString();
        Pattern pattern = Pattern.compile("\\b\\w{1,3}\\b");
        Matcher matcher = pattern.matcher(str);
        int counter = 0;
        while (matcher.find()) {
            counter++;
        }
        System.out.println(counter);
    }
    public static boolean isDateFormatValid(String dob){
      return Pattern.matches("[0-9]{2}/[0-9]{2}/[0-9]{4}",dob);
    }
    public static boolean isEmailFormatValid(String email){
        return Pattern.matches("[\\w.]{2,}@[\\w.]{2,}\\.[\\w.]{2,}",email);
    }
}
