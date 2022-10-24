package homeworks;

import utilities.ScannerHelper;

import java.util.Scanner;

public class Homework05 {
    public static void main(String[] args) {

        System.out.println("------------Task 1-----------");
        String divBySeven = "";

        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0)
                divBySeven += i + " - ";
        }
        System.out.println(divBySeven.substring(0, divBySeven.length() - 3));

        System.out.println("------------Task 2-----------");
        String printNum = "";
        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0 && i % 3 == 0)
                printNum += +i + " - ";
        }
        System.out.println(printNum.substring(0, printNum.length() - 3));

        System.out.println("------------Task 3-----------");
        String divByFive = "";

        for (int i = 100; i >= 50; i--) {
            if (i % 5 == 0)
                divByFive += i + " - ";
        }
        System.out.println(divByFive.substring(0, divByFive.length() - 3));

        System.out.println("------------Task 4-----------");
        int square = 0;
        for (int i = 0; i <= 7; i++) {
            square = i * i;
            System.out.println("The square of " + i + " is = " + square);
        }
        System.out.println("------------Task 5-----------");

        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println(sum);

        System.out.println("------------Task 6-----------");

        int useNum = ScannerHelper.getANumber();
        int num11 =  useNum;
        int factorSum = num11;
        for (int i = 1; i < useNum; i++) factorSum *= i;
        System.out.println(factorSum);

        System.out.println("------------Task 7-----------");

        String uN = ScannerHelper.getAName();
        String uNtoLower = uN.toLowerCase();
        int counter = 0;

        for (int i = 0; i <  uN.length(); i++) {
            if (uNtoLower.charAt(i) == 'a' || uNtoLower.charAt(i) == 'e' || uNtoLower.charAt(i) == 'i' ||
                    uNtoLower.charAt(i) == 'o' || uNtoLower.charAt(i) == 'u')
                counter ++;
        }
        System.out.println("There are " + counter + " vowel letters in the full name");

        System.out.println("------------Task 8-----------");

        Scanner scan = new Scanner(System.in);

        int userNum = ScannerHelper.getANumber();

        if (userNum >= 100) System.out.println("This number is already more than 100");
        else {
            int sumOfNum = useNum;
            do {
                int userNum2 = ScannerHelper.getANumber();
                sumOfNum += userNum2;
            } while (sumOfNum < 100);
            System.out.println("The sum of the entered number is at least 100");

            System.out.println("------------Task 9-----------");
            int userNum1 = ScannerHelper.getANumber();

            int num1 = 0;
            int num2 = 1;
            int sum2 = 0;
            String answer = "";

            for (int i = 0; i < userNum1; i++) {
                answer += num1 + " - ";
                sum2 = num1 + num2;

                num1 = num2;
                num2 = sum2;
            }
            System.out.println(answer.substring(0, answer.length() - 3));

            System.out.println("------------Task 10-----------");

            String fullName = "";
            do {
                System.out.println("Please enter a name");
                fullName = scan.nextLine();
            }
            while (!fullName.toLowerCase().startsWith("j"));
            System.out.println("End of program");
        }
    }
}