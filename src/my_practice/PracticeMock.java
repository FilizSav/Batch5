package my_practice;

import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Random;
import java.util.Scanner;

public class PracticeMock {
    public static void main(String[] args) {

        int myInt = 49;

        if (myInt >= -50 && myInt <= -1) {
            System.out.println("Negative");
        } else if (myInt == 0) {
            System.out.println("Zero");
        } else if (myInt >= 1 && myInt <= 50) {
            System.out.println("Positive");
        }

        System.out.println(1 < 2 ? 1 : 2);

        Random scan = new Random();
        int num1 = scan.nextInt(100) + 1;
        //random
        System.out.println(num1);
        if (num1 >= 10 && num1 <= 25) System.out.println("True");
        else System.out.println("False");

        // Ternary
        System.out.println((num1 >= 10 && num1 <= 25) ? "True" : "False");

        //boolean
        System.out.println((num1 >= 10 && num1 <= 25));
        if (num1 >= 1 && num1 <= 50) System.out.println(num1 + " is in the 1st Half");
        if (num1 >= 1 && num1 <= 25) System.out.println(num1 + " is in the 1st Quarter");
        if (num1 >= 26 && num1 <= 50) System.out.println(num1 + " is in the 2nd Quarter");
        if (num1 >= 51 && num1 <= 100) System.out.println(num1 + " is in the 2nd half");
        if (num1 >= 51 && num1 <= 75) System.out.println(num1 + " is in the 3rd Quarter");
        if (num1 >= 76 && num1 <= 100) System.out.println(num1 + " is in the 4th Quarter");
        if (num1 >= 51 && num1 <= 75) System.out.println(num1 + " is in the 3rd Quarter");

        if (num1 <= 50) {
            System.out.println(num1 + " is in the 1st Half");
            if (num1 <= 25) {
                System.out.println(num1 + " is in the 1st Quarter");
            } else {
                System.out.println(num1 + " is in the 2st Quarter");
            }
        } else {
            System.out.println(num1 + " is in the 2nd Half");
            if (num1 <= 75) {
                System.out.println(num1 + " is in the 3rd Quarter");
            } else {
                System.out.println(num1 + " is in the 4th Quarter");
            }
        }
        /*
        // Scanner//
        Is it raining (true/false)
        Do you have umbrella? (true/false)
        Are you hungry? (true/false)
        // if elses //
        it is raining -> it is raining outside
            if you have umbrella -> you can go outside
            otherwise -> you stay home
        it is not raining -> it is not raining outside
            if you are hungry -> you go to chick-fil-a
            otherwise -> you are riding a bike
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Is it raining (true/false?");
        boolean isRaining = scanner.nextBoolean();

        System.out.println("Dou you have an Umbrella (true/false?");
        boolean hasUmbrella = scanner.nextBoolean();

        System.out.println("Are you hungry (true/false)?");
        boolean isHungry = scanner.nextBoolean();

        if (isRaining) {
            System.out.println("Is it raining outside!");
            if (hasUmbrella) {
                System.out.println("You can go outside.");
            } else {
                System.out.println("You stay home.");
            }
        } else {
            System.out.println("It is not raining outside!");
        }
        if (isHungry) {
            System.out.println("You go to chick-fil-a.");
        }else{
            System.out.println("You can ride a bike!!!");
        }
    }
}