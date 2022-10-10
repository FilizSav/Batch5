package homeworks;

import java.util.Scanner;

public class Homework03 {
    public static void main(String[] args) {

       System.out.println("__________TASK1__________");
        Scanner scan = new Scanner(System.in);

        System.out.println("Hey user can you enter 2 numbers?");
        int num1 = scan.nextInt();int num2 = scan.nextInt();
        System.out.println("The difference between the numbers is " + Math.abs(num1-num2));

        System.out.println("__________TASK2__________");
        System.out.println("Hey user can you enter 5 numbers?");
        int numb1 = scan.nextInt(); int numb2 = scan.nextInt(); int numb3 = scan.nextInt();
        int numb4 = scan.nextInt(); int numb5 = scan.nextInt();
        int max = Math.max(Math.max(numb1,numb2),Math.max(Math.max(numb3,numb4),numb5));
        int min = Math.min(Math.min(numb1,numb2),Math.min(Math.min(numb3,numb4),numb5));
        System.out.println("Max value = " + max + ". \nMin value = "+ min +".");

        System.out.println("__________TASK3__________");
        int random1 = (int) (Math.random()* (100-50+1)+50);
        int random2 = (int) (Math.random()* (100-50+1)+50);
        int random3 = (int) (Math.random()* (100-50+1)+50);

        int sum = (random1 + random2 + random3);
        System.out.println("Number 1 = " + random1 +".\nNumber 2 = " + random2 +".\nNumber 3 = "+ random3 +".");
        System.out.println("The sum of numbers is = " +sum +".");

        System.out.println("__________TASK4__________");
        double alex = 125, mike = 220;
        double payment = 25.5;
        alex -= payment; mike +=payment;

        System.out.println("Alex's money is: $" + alex + "\nMike's money is: $" + mike);

        System.out.println("__________TASK5__________");
        Scanner input = new Scanner(System.in);
        int bicyclePrice = 390;

        System.out.println("The price for the bicycle is currently = $" + bicyclePrice);
        System.out.println("How much are you going to save up daily?");
        double dailySave = input.nextDouble();

        System.out.println("You can buy bicycle in " + (int)(bicyclePrice / dailySave) + " days.");

        System.out.println("__________TASK6__________");
        String s1 = "5", s2 = "10";

        int addition = Integer.valueOf(s1) + Integer.valueOf(s2);
        int product = Integer.valueOf(s1) * Integer.valueOf(s2);
        int division = Integer.valueOf(s1) / Integer.valueOf(s2);
        int subtraction = Integer.valueOf(s1) - Integer.valueOf(s2);
        int remainder = Integer.valueOf(s1) % Integer.valueOf(s2);

        System.out.println("Sum of "+Integer.valueOf(s1)+" and "+Integer.valueOf(s2)+ " is = " +addition);
        System.out.println("Product of "+Integer.valueOf(s1)+" and "+Integer.valueOf(s2)+ " is = " +product);
        System.out.println("Division of "+Integer.valueOf(s1)+" and "+Integer.valueOf(s2)+ " is = " +division);
        System.out.println("Subtraction of "+Integer.valueOf(s1)+" and "+Integer.valueOf(s2)+ " is = " +subtraction);
        System.out.println("Remainder of "+Integer.valueOf(s1)+" and "+Integer.valueOf(s2)+ " is = " +remainder);

        System.out.println("__________TASK7__________");
        String s3 = "200", s4 = "-50";
        int i1 = Integer.parseInt(s3), i2 = Integer.parseInt(s4);

        System.out.println("The greatest value is = " + Math.max(i1,i2));
        System.out.println("The smallest value is = " + Math.min(i1,i2));
        System.out.println("The average is = " + (i1+i2)/2);
        System.out.println("The absolute difference is = " + (Math.abs(i1-i2)));

        System.out.println("__________TASK8__________");
        double quarters = (3 * .25), dimes = .10, nickles = (2 * .05), penny = .01;
        double day = (quarters+dimes+nickles+penny);

        System.out.println(+(int) (24/day) + " days");
        System.out.println(+(int) (168/day) + " days");
        System.out.println("$"+(double) (150*day));

        System.out.println("__________TASK9__________");
        double dailySaving = 62.5;
        System.out.println((int) (1250 / dailySaving));

        System.out.println("__________TASK10__________");
        double option1 = 475.50, option2 = 951, carPrice = 14265;

        System.out.println("Option 1 will take " + (int)(carPrice/option1) + " months");
        System.out.println("Option 2 will take " + (int)(carPrice/option2) + " months");

        System.out.println("__________TASK11__________");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hey user can you enter 2 numbers?");
        int number1 = scanner.nextInt(), number2 = scanner.nextInt();

        System.out.println((double) (number1/number2));

        System.out.println("__________TASK12__________");
        int random7 = (int)(Math.random()*(101));
        int random8 = (int) (Math.random()*(101));
        int random9 = (int) (Math.random()*(101));
        System.out.println(random1 + "\n" + random2 + "\n" +random3 );

        System.out.println(random1>=25 && random2 >=25 && random3>= 25);

        System.out.println("__________TASK13__________");

        System.out.println("Hey user can you enter a number between 1 and 7?");
        int daily = scanner.nextInt();

        if (daily == 1)
            System.out.println("The number entered returns MONDAY");
        else if (daily == 2)
            System.out.println("The number entered returns TUESDAY");
        else if (daily == 3)
            System.out.println("The number entered returns WEDNESDAY");
        else if (daily == 4)
            System.out.println("The number entered returns THURSDAY");
        else if (daily == 5)
            System.out.println("The number entered returns FRIDAY");
        else if (daily == 6)
            System.out.println("The number entered returns SATURDAY");
        else if (daily == 7)
            System.out.println("The number entered returns SUNDAY");{}

        System.out.println("__________TASK14__________");

        System.out.println("Can you enter you 3 exam results?");
        int exam1 = scanner.nextInt(), exam2 = scanner.nextInt(), exam3 = scanner.nextInt();
        int average = (exam1+exam2+exam3)/3;

        if (average>=70)
            System.out.println("YOU PASSED!");
        else {
            System.out.println("YOU FAILED!");

            System.out.println("__________TASK15__________");

            System.out.println("Hey user can you enter you 3 number?");
            int match1 = scanner.nextInt(), match2 = scanner.nextInt(), match3 = scanner.nextInt();

            if (match1 == match2 && match1==match3)
                        System.out.println("TRIPLE MATCH");
                    else if (match1 == match2 || match3==match1 || match3==match2)
                        System.out.println("DOUBLE MATCH");
                    else {
                System.out.println("NO MATCH");

        /*Requirement:
    Task 1-Write a Java program that asks user to enter 2 numbers - int values
    and find the absolute difference between the two numbers by using Math.abs() method
    Expected output (The difference between numbers is =)
    Task 2 -Write a Java program that asks user to enter 5 numbers - int values and find the
    Max and Min number by using Math.max() and Math.min() methods
    Expected outcome (Max value = 45 Min value = 3)
    Task 3 -Write a Java program that generates 3 random numbers between 50 and 100 both included.
    Use Math.random() First print the numbers Then, find the sum of these numbers
    Task 4 -Assume Alex has $125, and Mike has $220 And Alex is going to give $25.5 to Mike.
    Then,How much money will Alex and Mike will have after that?
    Write a java program to solve the problem given above
    Expected Output:Alex’s money: $99.5 Mike’s money: 245.5
    Task 5 Write a program to find how many days later, David can save $390 and buy the bicycle.
    Task 6 Requirement: Convert given Strings below to int data types and find their sum, product,
    division, subtraction and remainder.
    String s1 = “5”, s2 = “10”;
    Expected results:
    -Sum of 5 and 10 is = 15
    -Product of 5 and 10 is = 50
    -Division of 5 and 10 is = 0
    -Subtraction of  5 and 10 is = -5
    -Remainder of 5 and 10 is = 5
    Task 7 Requirement:Convert given Strings below to int data types and find the greatest and smallest
    values and find the average and absolute difference of them.
    String s1 = “200”, s2 = “-50”;
    Expected results:
    The greatest value is = 200
    The smallest value is = -50
    The average is = 75
    The absolute difference is = 250
    Task 8 Assume that you have a coin bank, and you save 3 quarters, 1 dime, 2 nickels and 1 penny each day.
    -find how many days later you can save $24
    -find how many days later you can save $168
    -how much you will save after 5 months (assume a month is 30 days)
    Task 9 Jessie is going to save $1,250 to buy a new computer. Jessie is saving $62.5 in a day.
    Write a Java program that calculates how many days it will take for Jessie to but the computer.
    Task 10 Dan is going to save $14,265 to buy a new car. Dan is given two option to make monthly payments with no interest rate.
    Option 1: Equal payments of $475.50 per month
    Option 2: Equal payments of $951 per month
    Write a Java program that calculates how many months it will take for Dan to complete all the payments with option 1 and option 2.
    Task 11 Write a Java program that asks user to enter 2 numbers(number1 and number2) and store those in int variables.
    Find the result of number1/number2 and store this in a double.
    Finally print the result
    Task 12 Write a Java program that generates 3 random numbers between 0 and 100
    (0 and 100 are included) and find if all numbers are more than 25
    Task 13 -Write a Java program to ask user to enter a number between 1 and 7 (1 and 7 are included)
    Print the day of the week according to given number. First day is MONDAY and last day is SUNDAY
    Task 14 -Jennifer is taking a math course . This math course requires students to take 3 exams. At the end,
    if the average of those exams is more than or equal to 70, then Jennifer will pass the course. However,
    if the average of those 3 exams is less than 70, then Jennifer will fail.
    Requirement:Write a Java program that asks Jennifer to enter her exam results and print if she
    passed or failed for the exam.
    TASK 15 Write a Java program that asks user to enter 3 numbers
    -If all numbers are different, then print “NO MATCH”
    -If any of those 2 numbers are equal, then print “DOUBLE MATCH”
    -If all 3 numbers are equal, then print “TRIPLE MATCH”
        */
        }
            }
    }           }