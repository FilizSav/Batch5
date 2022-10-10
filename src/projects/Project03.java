package projects;

import java.util.Random;
import java.util.Scanner;

public class Project03 {
    public static void main(String[] args) {

        System.out.println("_____________TASK1_____________");

        String s1 = "24", s2 = "5";

        int num1 = Integer.parseInt(s1);
        int num2 = Integer.parseInt(s2);

        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println((float) num1 / num2);
        System.out.println(num1 * num2);
        System.out.println(num1 % num2);

        System.out.println("_____________TASK2_____________");

        int random1 = (int) ((Math.random() * 36) + 1);
        System.out.println("Random number = " + random1);
        if (random1 == 2 && random1 == 3 && random1 == 5 && random1 ==7 && random1 == 11
        && random1 == 13 && random1 ==17 && random1 ==19 && random1==23 && random1 ==27
        && random1 == 29 && random1 == 31) {
            System.out.println(+random1 + " IS A PRIME NUMBER");
        } else {
            System.out.println(+random1 + " IS NOT A PRIME NUMBER");
        }

        System.out.println("_____________TASK3_____________");

        int random2 = (int) ((Math.random() * 51) + 1);
        int random3 = (int) ((Math.random() * 51) + 1);
        int random4 = (int) ((Math.random() * 51) + 1);

        System.out.println("Random number 1 is = " + random2);
        System.out.println("Random number 2 is = " + random3);
        System.out.println("Random number 3 is = " + random4);

        int maxNumber = Math.max(Math.max(random2, random3), random4);
        int minNumber = Math.min(Math.min(random2, random3), random4);
        int midNumber;
        if (random2 != maxNumber && random2 !=minNumber){
            midNumber = random2;
        } else if (random3 != maxNumber && random3 != minNumber){
            midNumber = random3;
        }else { midNumber = random4;}
        System.out.println("Greatest number is = " + maxNumber);
        System.out.println("Middle number is " + midNumber);
        System.out.println("Least number is = " + minNumber);

        System.out.println("_____________TASK4_____________");

        char c1 = 'a';
        int castAscii = c1;

        if (castAscii >= 65 && castAscii <= 90) {
            System.out.println("The letter is uppercase");
        } else if (castAscii >= 97 && castAscii <= 122) {
            System.out.println("The letter is lowercase");
        } else {
            System.out.println("Invalid character detected!!!");
        }

        System.out.println("_____________TASK5_____________");

      char c2 = '#';
       int castAscii2 = c1;

        if (c2< 65 || c2>90 && c2<97 ||c2 >122){
            System.out.println("Invalid character detected!!!");
        }else if (c2 == 65 || c2 == 69 || c2 == 73 || c2 ==79 || c2 ==85 ||
        c2 ==97 || c2 ==101 || c2 ==105 || c2 == 111 || c2 ==117){
            System.out.println("The letter is vowel");
        }else {
           System.out.println("The letter is constant");
        }

        System.out.println("_____________TASK6_____________");

        char c4 = '#';
        if (!(c4 >= 65 && c4 <= 90 || c4 >= 97 && c4 <= 122 || c4>=48 && c4<=57)){
            System.out.println("Special character is = " + c4);
        }else {
            System.out.println("Invalid character detected!!!");
        }
        System.out.println("_____________TASK7_____________");

        char c5 = '#';

        if (Character.isLetter(c5)) System.out.println("Character is a letter");
        else if (Character.isDigit(c5))System.out.println("Character is a digit");
        else System.out.println("Character is a special character");


    }
}
