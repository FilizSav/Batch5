package my_practice;

import java.util.Random;
import java.util.Scanner;

public class PracticePractice {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

//        System.out.println("Please enter 3 numbers");
//        int num1 = scan.nextInt();
//        int num2 = scan.nextInt();
//        int num3 = scan.nextInt();
//
//        System.out.println(num1 + " and " + num2 + " and " + num3);
//
//        int maxNum = Math.max(Math.max(num1, num2), (num3));
//        System.out.println(maxNum);



        Random random = new Random();

        int num22 = (int)(Math.random() * 11);
        int num23 = (int)(Math.random() * 11);
        int num24 = (int)(Math.random() * 11);
        int num25 = (int)(Math.random() * 11);
        int num26 = random.nextInt(11);



        System.out.println(num22);
        System.out.println(num23);
        System.out.println(num24);
        System.out.println(num25);
        System.out.println(num26);

        char c1 = ' ';


        if(c1 >= 65 && c1<= 90 || c1 >= 97 && c1 <= 122) System.out.println("its a letter");
        else if (c1 >= 48 && c1<= 57) System.out.println("its a digit");
        else System.out.println(" special character");
    }
}

