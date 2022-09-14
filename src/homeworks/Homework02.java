package homeworks;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Homework02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

/*        int num1, num2;
TASK 1
        System.out.println("Please enter number 1:");
        num1 = scan.nextInt();
        System.out.println("Please enter number 2:");
        num2 = scan.nextInt();

        int sum = num1 + num2;
        System.out.println("The sum of number 1 and 2 is = " + sum);
TASK 2
        System.out.println("Please enter number 1:");
        num1 = scan.nextInt();
        System.out.println("Please enter number 2:");
        num2 = scan.nextInt();

        int product = num1 * num2;
        System.out.println("The product of the given 2 numbers is = " + product);

TASK 3  24    10  The sum of the given numbers is = 34.0
        The product of the given numbers is = 240.0
        The subtraction of the given numbers is = 14.0
        The division of the given numbers is = 2.4
        The remainder of the given numbers is = 4.0

        float number1, number2;
        System.out.println("Please enter number 1:");
        number1 = scan.nextFloat();
        System.out.println("Please enter number 2:");
        number2 = scan.nextFloat();

        float sum = number1 + number2;
        float product = number1 * number2;
        float difference = number1 - number2;
        float dividing = number1 / number2;
        float remainder = number1 % number2;

        System.out.println("The sum of the given numbers is = " +sum);
        System.out.println("The product of the given numbers is = " +product);
        System.out.println("The subtraction of the given numbers is = " +difference);
        System.out.println("The division of the given numbers is = " +dividing);
        System.out.println("The remainder of the given numbers is = " +remainder);
TASK 4
        -Write a Java program to print the result of the following operations
        Test Data:
        1. 	-10 + 7 * 5
        2. 	(72+24) % 24
        3. 	10 + -3*9 / 9
        4. 	5 + 18 / 3 * 3 – (6 % 3)
        Expected Output:25 0 7 23

        int Q1= (-10 + 7 * 5);
        int Q2= ((72+24) % 24);
        int Q3= (10 + -3*9 / 9);
        int Q4= (5 + 18 / 3 * 3 -(6 % 3) );
            System.out.println(Q1);
            System.out.println(Q2);
            System.out.println(Q3);
            System.out.println(Q4);

TASK 5
        int average = ((7+11)/2);
        System.out.println("The average of the given numbers is = " +average);
TASK 6

        int average = ((6+10+12+16+17)/5);
        System.out.println("The average of the given numbers is = " +average);
TASK 7

        System.out.println("Please enter 3 numbers");
        int num1 = scan.nextInt(), num2 = scan.nextInt(), num3 = scan.nextInt();

        System.out.println("The " +num1+ " multiplied with " +num1+ " is = "+ num1*num1);
        System.out.println("The " +num2+ " multiplied with " +num2+ " is = "+ num2*num2);
        System.out.println("The " +num3+ " multiplied with " +num3+ " is = "+ num3*num3);
TASK 8 -Write a Java program that asks user to enter the side of a square as input and print
        square’s perimeter and area    //7

        //Perimeter of the square = 28 Area of the square = 49

        int num1 = 7;
        System.out.println("Perimeter of " + num1 + " is = " + num1 * 4);
        System.out.println("Area of " + num1 + " is = " + num1 * num1);
TASK 9
        double $pay1 = 90000;
        System.out.println("A Software Engineer in Test can earn " + "$" + $pay1 * 3 + " in 3 years.");
TASK 10
        String favBook, favColor, favNumber;

        System.out.println("What is your favorite book?");
        favBook = scan.nextLine();

        System.out.println("What is your favorite color?");
        favColor = scan.nextLine();

        System.out.println("What is your favorite number?");
        favNumber = scan.nextLine();

        System.out.println("User’s favorite book is: " + favBook);
        System.out.println("User’s favorite color is: " + favColor);
        System.out.println("User’s favorite number is: " + favNumber);
TASK 11 */
         String firstName, lastName, emailAddress, phoneNumber, address;
         int age = 45;
        System.out.println("What is your first name?");
        firstName = scan.nextLine();
        System.out.println("What is your last name?");
        lastName = scan.nextLine();
        System.out.println("What is your age?");
        age = scan.nextInt();
        scan.nextLine();
        System.out.println("What is your email address?");
        emailAddress = scan.nextLine();
        System.out.println("What is your phone number?");
        phoneNumber = scan.nextLine();
        System.out.println("What is your address?");
        address = scan.nextLine();
        // John Doe 45 johndoe@gmail.com,(123) 123 1234, 123 St Chicago IL 12345.
        System.out.println("\tUser who joined this program is " +firstName+" " + lastName+"."+" "+firstName+"'s age is "
                + age+ "."+" "+firstName+"'s email \n address is "+emailAddress+", phone number is "+phoneNumber+
                ", and address is \n "+address+ ".");
    }
}
