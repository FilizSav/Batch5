package my_practice;

import mathClass.MathRandom;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MyPractice {

    public static void main(String[] args) {
        int num1 = 5;

        System.out.println("\"what does \b this do in escape sequences\"");
        /*
        Requirement:
        Write a Java program that asks user to enter 2
        numbers(number1 and number2) and store those in int
        variables.
        Find the result of number1/number2 and store this in a
        double.
        Finally, print the result
        Test data:
        Number1 = 15
        Number2 = 2
        Expected Output:
        7.5
        NOTE: 7.5 is a double or float but you are asked to store
        the result in a double. Make sure that your result is not
        returning 7 instead of 7.5
        NOTE: expected results should exactly match!!!
         */

        Scanner scan = new Scanner(System.in);
/*
        int Number1 = 15, Number2 = 2;
        System.out.println("Please enter 2 numbers");
        Number1 = scan.nextInt();Number2 = scan.nextInt();
        System.out.println("Number1 divided by number2 = " + ((double)Number1/Number2));

        /*
        Write a program that generates 4 random numbers
        between 0 and 10 (0 and 10 are also included).
        -Store numbers in proper variables and print them first
        -Print each number’s absolute difference with 5
        -Find greatest and print the result with a proper message
        -Find smallest and print the result with a proper message
        NOTE: Assume random numbers came as 2, 5, 3, 0
        respectively.
        EXPECTED RESULT:
        Number 1 = 2
        Number 2 = 5
        Number 3 = 3
        Number 4 = 0
        Absolute difference of 2 with 5 is = 3
        Absolute difference of 5 with 5 is = 0
        Absolute difference of 3 with 5 is = 2
        Absolute difference of 0 with 5 is = 5
        Greatest number is = 5
        Smallest number is = 0 */
/*
        System.out.println("Please enter 4 numbers");
        int random = (int)Math.random() *10 +1;int random1 = (int)Math.random() *10 +1;
        int random2 = (int)Math.random() *10 +1;int random3 = (int)Math.random() *10 +1;
        random = scan.nextInt();random1 = scan.nextInt();random2 = scan.nextInt();
        random3 = scan.nextInt();
        System.out.println("Absolute difference of " + random +" with 5 is = " + (Math.abs(random-5)));
        System.out.println("Absolute difference of " + random1 +" with 5 is = " + (Math.abs(random1- 5)));
        System.out.println("Absolute difference of " + random2 +" with 5 is = " + (Math.abs(random2 - 5)));
        System.out.println("Absolute difference of " + random3 +" with 5 is = " + (Math.abs(random3- 5)));
        System.out.println(Math.max(Math.max(random,random1),Math.max(random2,random3)));
        System.out.println(Math.min(Math.min(random,random1),Math.min(random2,random3)));

        System.out.println("\n------------TASK-1------------\n");
        int t1_num1 = (int) (Math.random() * 11);
        int t1_num2 = (int) (Math.random() * 11);
        int t1_num3 = (int) (Math.random() * 11);
        int t1_num4 = (int) (Math.random() * 11);

        int i = 1;
        System.out.println("Number " + i++ + " = " + t1_num1);
        System.out.println("Number " + i++ + " = " + t1_num2);
        System.out.println("Number " + i++ + " = " + t1_num3);
        System.out.println("Number " + i + " = " + t1_num4);

        int five = 5;
        System.out.println("Absolute difference of " + t1_num1 + " with  " + five + " is = " + Math.abs(five - t1_num1));
        System.out.println("Absolute difference of " + t1_num2 + " with  " + five + " is = " + Math.abs(five - t1_num2));
        System.out.println("Absolute difference of " + t1_num3 + " with  " + five + " is = " + Math.abs(five - t1_num3));
        System.out.println("Absolute difference of " + t1_num4 + " with  " + five + " is = " + Math.abs(five - t1_num4));

        System.out.println("Greatest number is = " + Math.max(Math.max(t1_num1, t1_num2), Math.max(t1_num3, t1_num4)));
        System.out.println("Smallest number is = " + Math.min(Math.min(t1_num1, t1_num2), Math.min(t1_num3, t1_num4)));
   */
        /*
        Write a program that generates 8 random int numbers between -50 and 50 (-50 and 50 are included)
        -Store numbers in proper variables and print them first
        -Find greatest and print the result with a proper message
        -Find smallest and print the result with a proper message
        -Find average of all 8 numbers and print result with a proper message
        -Find the absolute difference between smallest and greatest and print result with
        a proper message
        -Print true if 3rd number is positive, false otherwise with a proper message
        -Print true if 5th number is negative, false otherwise with a proper message
        -Print true if any of the numbers is zero, false otherwise with a proper message
        NOTE: Assume random numbers came as -10, 5, -37, 13, 50, -39,
        17, 3 respectively.
        NOTE: Your result will be different based on the random numbers
        you will get.
        EXPECTED RESULT:
        Number 1 = -10
        Number 2 = 5
        Number 3 = -37
        Number 4 = 13
        Number 5 = 50
        Number 6 = -39
        Number 7 = 17
        Number 8 = 3
        Greatest number is = 50
        Smallest number is = -39
        Average of 8 numbers is = 1
        Absolute difference between smallest and greatest is = 89
        3rd number is positive = false
        5th number is negative = false
        There is at least one zero among those numbers is = false
         */
        int number1 = (int)(Math.random()* 101 -(50));
        int number2 = (int)(Math.random()* 101 -(50));
        int number3 = (int)(Math.random()* 101 -(50));
        int p=1;
        System.out.println("Number " + p++ + " is = " +number1);
        System.out.println("Number " + p++ + " is = " +number2);
        System.out.println("Number " + p++ + " is = " +number3);
        int maxOf3 = Math.max(Math.max(number1,number2),(number3));
        int minOf3 = Math.min(Math.min(number1,number2),(number3));
        System.out.println("Greatest number is = "+ maxOf3);
        System.out.println("Smallest number is = "+ minOf3);
        System.out.println("Average of 3 numbers is = " +(number1+number2+number3)/3);
        System.out.println("Absolute difference between smallest and greatest is " +(Math.abs(minOf3-maxOf3)));
        System.out.println("If one zero " +(number1 == 0 || number2 == 0 || number3 == 0));




    }
}
