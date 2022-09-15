package mathClass;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MinAndMaxMethods {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
/*
        int maxNumber = Math.max(80,27);
        int maxNumber2 = Math.max(maxNumber, 125);

        System.out.println("maxNumber = " + maxNumber);
        System.out.println("maxNumber2 = " + maxNumber2);

        int minNumber = Math.min(80,27);
        int minNumber2 = Math.min(Math.min(80,27),-2);
        int minNumber3 = Math.min(minNumber,625);

        System.out.println("minNumber = " + minNumber);
        System.out.println("minNumber2 = " + minNumber2);
        System.out.println("minNumber3 = " + minNumber3);

        int minOfTwoNeg = Math.min(-40,-60);

        System.out.println(Math.min(-40,-60)); // Can use either minOfTwoNeg or equation

        int int1 = Math.max(17,49);
        int int2 = Math.max(Math.max(17,49),125);
        System.out.println(" Max is = " +Math.max(6,9));
        System.out.println(" Max is = " +Math.max(17,49));
        System.out.println(" Max is = " +Math.max(34.2,12.5));
        System.out.println(" Max is = " +Math.max(-14, -32));
        System.out.println(" Max is = " + Math.max(Math.max(17,49),125));


        System.out.println("Min is " + Math.min(6, 9));
        System.out.println("Min is " + Math.min(17, 49));
        System.out.println("Min is " + Math.min(34.2, 12.5));
        System.out.println("Min is " + Math.min(-14, -32));
        System.out.println("Min is " + Math.min(Math.min(17, 49), 125));
        System.out.println("Min is " + Math.min(Math.min(45, 32),Math.min(56,89)));



Get 2 numbers from user and find their max and min then print them with messages

Output:
"Hey user give me a number"
-> input = 10
"Hey user give me another number"
-> input = 15

Max of your numbers is 15
Min of your numbers is 10
 */
        System.out.println("Hey user give me a number");
        int num1 = scan.nextInt();

        System.out.println("Hey user give me another number");
        int num2 = scan.nextInt();

        System.out.println("Hey user give me a last number");
        int num3 = scan.nextInt();

        System.out.println("Max of your numbers is " + Math.max(Math.max(num1,num2),num3));
        System.out.println("Min of your numbers is " + Math.min(Math.min(num1,num2),num3));

        System.out.println(Math.sqrt(36));

        int n1 = 81;
        int n2 = 25;
        int n3 = 64;

        System.out.println("Root of number is " + Math.sqrt(n1));
        System.out.println("Root of number2 is " + Math.sqrt(n2));
        System.out.println("Root of number3 is " + Math.sqrt(n3));

        Scanner roots = new Scanner(System.in);

        System.out.println("Hey user give me a number");
        double number = scan.nextDouble();

        System.out.println("Hey user give me another number");
        double number2 = scan.nextDouble();

        System.out.println("Hey user give me a last number");
        double number3 = scan.nextDouble();

        System.out.println("Your root number is " + Math.sqrt(number));
        System.out.println("Your root number2 is " + Math.sqrt(number2));
        System.out.println("Your root number3 is " + Math.sqrt(number3));

    }
    }

