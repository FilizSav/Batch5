package homeworks;

import java.util.*;
import java.util.stream.Collectors;

public class homework10 {
    public static void main(String[] args) {

        System.out.println("\n=============TASK 1================");

        String str = "      Java is fun       ";
        String str1 = "Selenium is the most common UI automation tool.   ";
        String str11 = "";
        countWords(str);
        countWords(str1);
        countWords(str11);
        System.out.println(countWords2(str));
        System.out.println(countWords2(str1));

        System.out.println("\n=============TASK 2================");

        String str2 = "TechGlobal is a QA bootcamp";
        String str22 = "QA stands for Quality Assurance";
        System.out.println(countA(str2));
        System.out.println(countA(str22));
        System.out.println(countA2(str22));

        System.out.println("\n=============TASK 3================");

        ArrayList<Integer> arr3 = new ArrayList<>(Arrays.asList( -23, -4, 0, 2, 5, 90, 123));
        System.out.println(countPos(arr3));

        System.out.println("\n=============TASK 4================");

        ArrayList<Integer> arr4 = new ArrayList<>(Arrays.asList(10, 20, 35, 20, 35, 60, 70, 60));
        System.out.println(removeDuplicateNumbers(arr4));

        System.out.println("\n=============TASK 5================");
        ArrayList<String> arr5 = new ArrayList<>(Arrays.asList("java", "C#", "ruby", "JAVA", "ruby", "C#", "C++"));
        System.out.println(removeDuplicateElements(arr5));
        System.out.println(removeDuplicateElements2(arr5));
        System.out.println(removeDuplicateElements3(arr5));

        System.out.println("\n=============TASK 6================");

        String str6 = "   I   am      learning     Java      ";
        System.out.println(removeExtraSpaces(str6));

        System.out.println("\n=============TASK 7================");
        int[] arr1 =  {10, 3, 6, 3, 2};
        int[] arr2 = {6, 8, 3, 0, 0, 7, 5, 10, 34};

        System.out.println(Arrays.toString(add(arr1, arr2)));

        System.out.println("\n=============TASK 8================");

        int[] numbers = {10, -13, 5, 70, 15, 57};

        System.out.println(findClosestTo10(numbers));


    }

    public static void countWords(String s){
        int count = 1;
        if(s.isEmpty()) System.out.println("There are no words");
        else {
        for(int i = 0; i < s.trim().length(); i++)
         if(s.trim().charAt(i) == ' ') count++;
         System.out.println(count);}
    }
    public static int countWords2(String s){
       return s.trim().length() + 1 - (s.replaceAll(" ","").length());
    }
    public static int countA(String s){
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.toLowerCase().charAt(i) == 'a') count++;
        }return count;
    }
    public static int countA2(String s){
        return s.length() - (s.toLowerCase().replaceAll("a","").length());
    }
    public static long countPos(ArrayList<Integer> arr){
        return arr.stream().filter(x -> x > 0).count();
    }
    public static ArrayList<Integer> removeDuplicateNumbers(ArrayList<Integer> arr){
        Iterator<Integer> it = arr.iterator();
        for (int i = 0; i < arr.size() -1; i++) {
            for (int j = i + 1; j < arr.size() ; j++) {
                if(arr.get(i).equals(arr.get(j))) arr.remove(i);
            }
        }
        return arr;
    }
    public static ArrayList<String> removeDuplicateElements(ArrayList<String> arr){
        Set<String> set = new LinkedHashSet<>();
        set.addAll(arr); arr.clear(); arr.addAll(set);
        return arr;
    }
    public static ArrayList<String> removeDuplicateElements2(ArrayList<String> arr){
        ArrayList<String> list = new ArrayList<>();
        for (String a : arr) {
            if(!list.contains(a)) list.add(a);
        }return list;
    }
    public static ArrayList<String> removeDuplicateElements3(ArrayList<String> arr) {
        List<String> newList = arr.stream().distinct().collect(Collectors.toList());
        return arr;
    }
    public static String removeExtraSpaces(String str){
        String newS = str.replaceAll(" +", " ");
        return newS;
    }
    public static int[] add(int[] a, int[] b) {
        int[] c = new int[Math.max(a.length, b.length)];
        for (int i = 0; i < c.length; i++) {
            if (a.length > i) {
                c[i] += a[i];}
            if (b.length > i) {
                c[i] += b[i];}
        }return c;
    }
    public static int findClosestTo10(int[] arr){
        int close10 = Integer.MAX_VALUE;

        for (int a : arr) {
            if (Math.abs(10 - a) <= Math.abs(close10 - 10) && a != 10)
                if (Math.abs(10 - a) == Math.abs(close10 - 10)) close10 = Math.min(a, close10);
                else close10 = a;}
        return close10;
    }
}
