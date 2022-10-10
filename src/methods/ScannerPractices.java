package methods;

import utilities.ScannerHelper;

import java.util.Scanner;

public class ScannerPractices {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Hey, please enter a name:");
        String name = input.nextLine();

        System.out.println("Hey, please enter an age:");
        int age = input.nextInt();

        System.out.println(name + "'s age is " + age + ".");
// Using a method
        String name1 = ScannerHelper.getAName();
        System.out.println("The name is = " + name1);

        int age1 = ScannerHelper.getAnAge();
        System.out.println("The age is = " + age1);

        String address = ScannerHelper.getAAddress();
        System.out.println("The users address is = " + address);

        System.out.println(ScannerHelper.getAName() + "'s age is " + ScannerHelper.getAnAge() + "."
        + "\n The address is : " +ScannerHelper.getAAddress() + "." );
    }
}
