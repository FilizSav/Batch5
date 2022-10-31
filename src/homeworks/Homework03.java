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
            }
        }
    }
}