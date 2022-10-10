package string_methods;

import utilities.ScannerHelper;

import java.util.Scanner;

public class Exercise01_StringComparison {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("User please enter a string");
        String s1 = scanner.nextLine();
        System.out.println("User please enter another string");
        String s2 = scanner.nextLine();
        if (s1.equals(s2)) System.out.println("These strings are equal");
        else System.out.println("These strings are not equal");

        // Using a method
        String s3 = ScannerHelper.getAString();
        String s4 = ScannerHelper.getAString();

        if (s3.equals(s4)) System.out.println("These strings are equal");
        else System.out.println("These strings are not equal");
        // One line - not recommended
        System.out.println( (ScannerHelper.getAString().equals(ScannerHelper.getAString()) ?"These strings are equal" : "These strings are not" +
                " equal"));

    }
}
