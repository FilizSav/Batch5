package regex;

import java.util.Arrays;
import java.util.regex.Pattern;

public class Exercise {
    public static void main(String[] args) {

        System.out.println(Pattern.matches("[ a-zA-z0-9_-]{8,15}","Filiz Sav"));
        System.out.println(Pattern.matches("[\\D]{8,15}","FilizSav")); // D letters
        System.out.println(Pattern.matches(".+","FilizSav123")); // . accepts everything + starts at 1
        System.out.println(Pattern.matches("[\\d]{3}-[\\d]{2}-[\\d]{4}","332-88-0989")); // forces dash
        System.out.println(Pattern.matches("\\([\\d]{3}\\)-[\\d]{3}-[\\d]{4}","(708)-415-8792")); // make sure to use escape

        String str = "How much 1111- 8888  wood would a wood chuck chuck if a wood chuck could chuck word";

        System.out.println(str.replaceAll("wood", "*****"));
        System.out.println(str.replace("wood", "*****"));

        String str1 = " abc 123 $#^ ";

        System.out.println(str1.replaceAll("[\\W]", ""));

        System.out.println(Pattern.matches("[A-Z]{1}[a-z]{2,}[ ][A-Z]{1}[a-z]{2,}", "Filiz Sav"));
        System.out.println(Pattern.matches("[A-Z]{1}[a-z]+[ ][A-Z]{1}[a-z]+", "Filiz Sav"));

        String str2 = "A1b2C3#";

        System.out.println(Arrays.toString(str2.replaceAll("[^A-Za-z]","").toCharArray()));
        System.out.println(Arrays.toString(str2.replaceAll("[^0-9]","").toCharArray()));
    }
}
