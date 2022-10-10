package utilities;

import java.util.Scanner;

public class ScannerHelper {
    static Scanner input = new Scanner(System.in);
    public static String getAName() {
        System.out.println("Please enter a name:");
        String name = input.nextLine();
        return name;
    }
    public static int getAnAge(){
        System.out.println("Please enter an age:");
        int age1 = input.nextInt();
        input.nextLine();
        return   age1;
     }
    public static String getAAddress() {
        System.out.println("Please enter your address:");
        String address = input.nextLine();
        return address;
    }
    public static String getAString() {
        System.out.println("Please enter a string");
        return input.nextLine();
    }
    public static String favColor(){
        System.out.println("Please enter at least 4 favorite colors");
        return input.nextLine();
    }
}
