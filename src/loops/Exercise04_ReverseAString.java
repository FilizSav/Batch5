package loops;

import utilities.ScannerHelper;

import java.util.Scanner;

public class Exercise04_ReverseAString {
    public static void main(String[] args) {

        String name = ScannerHelper.getAName();

        String reverse = "";

        for (int i = name.length()-1; i >=0 ; i--) {
                reverse += name.charAt(i);
        }
        System.out.println("The reverse name is = " + reverse);

    }
}
