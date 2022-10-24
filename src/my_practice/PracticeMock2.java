package my_practice;

import utilities.CharMethods;
import utilities.ScannerHelper;

public class PracticeMock2 {
    public static void main(String[] args){

    String str = "";
    for(int i = 1; i <= 100; i++){
        if(i % 7 == 0) str += i + " - ";
        }
        System.out.println(str.substring(0, str.length()-3));
        System.out.println("==============================");

    String str1 = "";
        for (int i = 1; i <=50; i++) {
            if(i % 2 == 0 && i % 3 == 0) str1 += i + " - ";
        }
        System.out.println(str1.substring(0,str1.length()-3));
        System.out.println("==============================");

    String str3 = "";
    for (int i = 100; i >= 50; i--){
        if(i % 5 == 0 ) str3 += i + " - ";
    }
        System.out.println(str3.substring(0, str3.length()-3));
        System.out.println("==============================");

    int square = 0;

    for (int i = 0; i <= 7; i++){
        square = i * i;
        System.out.println(" The square of " + i + " is = " + square );
    }
        System.out.println("==============================");

    int sum = 0;

    for (int i = 1; i<= 10; i++){
        sum += i;
    }
        System.out.println(sum);
        System.out.println("==============================");

    int getNum = ScannerHelper.getANumber();

    int factorSum = getNum;
        for (int i = 1; i < getNum; i++) {
            factorSum *= i;
            System.out.println(+ i + " " + factorSum);
        }
        System.out.println(factorSum);
        System.out.println("==============================");

        String user = ScannerHelper.getAName().toLowerCase();
        int count1 = 0;
        for (int i = 0; i < user.length(); i++) {
            if(user.charAt(i) == 'a' || user.charAt(i) == 'e' ||
                    user.charAt(i) == 'i' || user.charAt(i) == 'o' ||
                    user.charAt(i) == 'u') count1++;
        }
        System.out.println("There are " + count1 + " vowel letters in this full name");
        System.out.println("==============================");

        int user1 = ScannerHelper.getANumber();

        int sum1 = 0;
        while (user1 < 100){
            System.out.println("enter number");
            user1 += ScannerHelper.getANumber();
        }
        System.out.println("This number is more than 100");

    }
}
