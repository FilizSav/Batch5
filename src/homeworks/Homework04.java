package homeworks;

import utilities.ScannerHelper;

public class Homework04 {
    public static void main(String[] args) {
        System.out.println("___________TASK1____________");
        String name = ScannerHelper.getAName();

        System.out.println(name.length());
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(name.length()-1));
        System.out.println(name.substring(0,3));
        System.out.println(name.substring(name.length()-3));


        if (name.startsWith("a") || name.startsWith("A")){
            System.out.println("You are in the club!");
        }else System.out.println("Sorry, you are not in the club!");

        System.out.println(name.toLowerCase().startsWith("a")?"You are in the club!" :"Sorry, you are not in the club!");


        System.out.println("___________TASK2____________");

        String city = ScannerHelper.getAAddress();

        if(city.toLowerCase().contains("chicago")) {
            System.out.println("You are in the club");
        }else   System.out.println("You are welcome to join to the club");

        System.out.println("___________TASK3____________");

        String color = ScannerHelper.favColor().toLowerCase();

        if(color.contains("green") && color.contains("red")){
            System.out.println("Green and red are in the list");
        } else if (color.contains("green")) {
            System.out.println("Green is in the list");
        } else if (color.contains("red")) {
            System.out.println("Red is in the list");
        }else System.out.println("Green and red are not in the list");

        System.out.println("___________TASK4____________");

        String str = "   Java is FUN   ";
        String str1 = str.trim().toLowerCase().substring(0, 4);
        String str2 = str.trim().toLowerCase().substring(5, 7);
        String str3 = str.trim().toLowerCase().substring(8);

        System.out.println("The first word in the str is = " + str1);
        System.out.println("The second word in the str is = " + str2);
        System.out.println("The third word in the str is = " + str3);
    }
}
