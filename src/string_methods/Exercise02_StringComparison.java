package string_methods;

import java.util.Locale;

public class Exercise02_StringComparison {
    public static void main(String[] args) {

        String str1 = "JAVA";
        String str2 = "java";

        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1.toLowerCase().equals(str2));
        System.out.println(str1.equals(str2.toUpperCase()));

    }
}
