package projects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Project06 {
    public static void main(String[] args) {

    System.out.println("\n+++++++++++++TASK 1+++++++++++++\n");

    String[] str = new String[]{"foo ", "", " ", "foo bar", "java is fun", "ruby"};
    System.out.println(countMultipleWords(str));
    System.out.println(countMultipleWordsRegex(str));


    System.out.println("\n+++++++++++++TASK 2+++++++++++++\n");

    ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(2, -5, 6, 7, -10, -78, 0, 15));
    System.out.println(removeNegatives(arr));

    System.out.println("\n+++++++++++++TASK 2 Second Way+++++++++++++\n");
    System.out.println(removeNegativesWithIterator(arr));

    System.out.println("\n+++++++++++++TASK 3  +++++++++++++\n");

     String passWord = "aasA1234!";
     System.out.println(validatePassword(passWord));

     System.out.println("\n+++++++++++++TASK 4  +++++++++++++\n");
     System.out.println(isEmailFormatValid("filizsav@gmail.com"));

    }

    public static int countMultipleWords(String[] str){
     int count = 0;

        for (int i = 0; i < str.length; i++) {
            if (str[i].trim().contains(" "))count++;
        }
     return count;
    }
    public static int countMultipleWordsRegex(String[] str){
        int count = 0;
        for (String s : str) {
            if(Pattern.matches("[\\w ]+ [\\w ]+",s.trim())) count++;
        }
        return count;
    }

    public static ArrayList<Integer> removeNegatives(ArrayList<Integer> arr){
        ArrayList<Integer> arr1 = new ArrayList<>();
        for (Integer a : arr) {
            if(a >= 0) arr1.add(a);
        }
        return arr1;
    }

    public static ArrayList<Integer> removeNegativesWithIterator(ArrayList<Integer> arr){
        arr.removeIf(a -> a < 0);
        return arr;
    }

    public static boolean validatePassword(String str){
        return Pattern.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{3,16}$", str);
    }
    public static boolean isEmailFormatValid(String email) {
        return Pattern.matches("[\\w.]{2,}@[\\w.]{2,}\\.[\\w.]{2,}", email);
    }
}
