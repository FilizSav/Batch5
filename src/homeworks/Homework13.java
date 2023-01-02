package homeworks;

import java.util.*;
import java.util.regex.Pattern;

public class Homework13 {
    public static void main(String[] args) {

        System.out.println("\n==========TASK 1================");
        String s1 = "Filiz";
        String s12 = "JAVA";
        String s13 = "125$";
        String s14 = "hello";

        System.out.println(hasLowerCase(s1));
        System.out.println(hasLowerCase(s12));
        System.out.println(hasLowerCase(s13));
        System.out.println(hasLowerCase(s14));
        System.out.println("=======================");
        System.out.println(hasLowerCase1(s1));
        System.out.println(hasLowerCase1(s12));
        System.out.println(hasLowerCase1(s13));
        System.out.println(hasLowerCase1(s14));

        System.out.println("\n==========TASK 2================");
        Integer[] s2 = {1};
        Integer[] s21 = {1, 1, 10};
        Integer[] s22 = {0, 1, 10};
        Integer[] s23 = {0, 0, 0};
        ArrayList<Integer> s211 = new ArrayList<>(Arrays.asList(s2));
        ArrayList<Integer> s221 = new ArrayList<>(Arrays.asList(s21));
        ArrayList<Integer> s231 = new ArrayList<>(Arrays.asList(s22));
        ArrayList<Integer> s241 = new ArrayList<>(Arrays.asList(s23));

        System.out.println();

        System.out.println(noZero(s2));
        System.out.println(noZero(s21));
        System.out.println(noZero(s22));
        System.out.println(noZero(s23));
        System.out.println("=======================");
        System.out.println(noZero1(s211));
        System.out.println(noZero1(s221));
        System.out.println(noZero1(s231));
        System.out.println(noZero1(s241));

        System.out.println("\n==========TASK 3================");
        int[] s3 = {1, 2, 3};
        int[] s31 = {0, 3, 6};
        int[] s32 = {1, 4};
        System.out.println(Arrays.deepToString(numberAndSquare(s3)));
        System.out.println(Arrays.deepToString(numberAndSquare(s31)));
        System.out.println(Arrays.deepToString(numberAndSquare(s32)));

        System.out.println("\n==========TASK 4================");

        String[] s4 = {"abc", "foo", "java"};
        String[] s41 = {"abc", "def", "123"};
        String[] s42 = {"abc", "def", "123", "Java", "Hello"};
        System.out.println(containsValue(s4,"hello"));
        System.out.println(containsValue(s41,"Abc"));
        System.out.println(containsValue(s42,"123"));

        System.out.println("\n==========TASK 5================");
        System.out.println(reverseSentence("Hello"));
        System.out.println(reverseSentence("Java is fun"));
        System.out.println(reverseSentence("This is a sentence"));

        System.out.println("\n==========TASK 6================");
        System.out.println(removeStringSpecialsDigits("123Java #$%is fun"));
        System.out.println(removeStringSpecialsDigits("Selenium"));
        System.out.println(removeStringSpecialsDigits("Selenium 123#$%Cypress"));
        System.out.println("\n==========TASK 7================");
        String[] arr = {"123Java"," #$%is", "fun"};
        String[] arr1 = {"Selenium", "123$%", "###"};
        String[] arr2 = {"Selenium", "123$%Cypress"};
        System.out.println(Arrays.toString(removeArraySpecialsDigits(arr)));
        System.out.println(Arrays.toString(removeArraySpecialsDigits(arr1)));
        System.out.println(Arrays.toString(removeArraySpecialsDigits(arr2)));

        System.out.println("\n==========TASK 8================");
        ArrayList<String> s8 = new ArrayList<>(Arrays.asList("Java", "C#", "C#"));
        ArrayList<String> s81 = new ArrayList<>(Arrays.asList("Python", "C#", "C++"));
        ArrayList<String> s82 = new ArrayList<>(Arrays.asList("Java", "is", "fun"));
        ArrayList<String> s83 = new ArrayList<>(Arrays.asList("Java", "C#", "Python"));
        System.out.println(removeAndReturnCommons(s8, s81));
        System.out.println(removeAndReturnCommons(s82, s83));
        System.out.println(removeAndReturnCommons(s81, s83));

        System.out.println("\n==========TASK 9================");
        ArrayList<String> s9 = new ArrayList<>(Arrays.asList("xyz", "123", "#$%"));
        ArrayList<String> s91 = new ArrayList<>(Arrays.asList("x", "123", "#$%"));
        ArrayList<String> s92 = new ArrayList<>(Arrays.asList("xyXyxy", "Xx", "ABC"));
        System.out.println(noXInVariables(s9));
        System.out.println(noXInVariables(s91));
        System.out.println(noXInVariables(s92));


    }
    public static boolean hasLowerCase(String str) {
        return Pattern.matches(".+[a-z]", str);
    }
    public static boolean hasLowerCase1(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLowerCase(str.charAt(i))) return true;
        }
        return false;
    }
    public static ArrayList<Integer> noZero(Integer[] arr) {
        ArrayList<Integer> newList = new ArrayList<>();
        for (Integer a : arr) {
            if (a != 0) newList.add(a);
        }
        return newList;
    }
    public static ArrayList<Integer> noZero1(ArrayList<Integer> arr) {
        arr.removeIf(x -> x == 0);
        return arr;
    }
    public static int[][] numberAndSquare(int[] arr){
        int[][] square = new int[arr.length][2];
        for (int i = 0; i < arr.length; i++) {
            square[i][0] = arr[i]; square[i][1] = arr[i] * arr[i];
        }
        return square;
    }
    public static boolean containsValue(String[] arr,String str){
        return Arrays.binarySearch(arr,str) >= 0;
    }
    public static String reverseSentence(String str){
      String[] s = str.toLowerCase().split(" ");
      String results = "";
      if(s.length <= 1) return "There is not enough words!";
      for (int i = s.length - 1; i >= 0; i--) {
            results += s[i] + " ";
        }
        return results.substring(0,1).toUpperCase(Locale.ROOT) + results.substring(1);
    }

    public static String removeStringSpecialsDigits(String str){
        str = str.replaceAll("[^A-Za-z]", " ");
        str = str.trim().replaceAll(" +", " ");
        return str;
    }
    public static String[] removeArraySpecialsDigits(String[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i].replaceAll("[^A-Za-z]","");
        }return arr;
    }
    public static ArrayList<String> removeAndReturnCommons(ArrayList<String> arr, ArrayList<String> arr1){
        ArrayList<String> commons = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == arr1.get(i)) commons.add(arr.get(i));
        }return commons;
    }
    public static ArrayList<String> noXInVariables(ArrayList<String> arr){
        for (int i = 0; i < arr.size(); i++) {
            arr.set(i, arr.get(i).toLowerCase().replaceAll("x", ""));
            if(arr.get(i).length() == 0) arr.remove(arr.get(i));
        }return arr;
    }
}
