package projects;

import characterClass.EasyMethodPractices;
import utilities.MathHelper;
import utilities.RandomNumberGenerator;
import utilities.ScannerHelper;

import java.util.Scanner;

public class Project04 {
    public static void main(String[] args) {

        System.out.println("=============Task 1 ==============");
        String str = ScannerHelper.getAString();

        if (str.length()<8) System.out.println("This String does not have 8 characters");
        else {
            System.out.println(str.substring(str.length()-4)+str.substring(4,str.length()-4)+str.substring(0,4));}

        System.out.println("=============Task 2 ==============");

        //Selenium is an automation tool
       String user = ScannerHelper.getAString();



        if(!user.contains(" ")) {
            System.out.println("This sentence does not have 2 or more words to swap");
        }else{
            String front = user.substring(0,user.indexOf(" "));
            String middle = user.substring(user.indexOf(" "), user.lastIndexOf(" ")+1);
            String end = user.substring(user.lastIndexOf(" ")+1);
        System.out.println(end + middle + front);}

        System.out.println("=============Task 3 ==============");

        String str1 = "These books are so stupid";
        String str2 = "I like idiot behaviors";
        String str3 = "I had some stupid t-shirts in the past and also some idiot look shoes";

        System.out.println(str1.replace("stupid", "nice"));
        System.out.println(str2.replace("idiot", "nice"));
        System.out.println(str3.replace("stupid", "nice").replace("idiot", "nice"));

        System.out.println("=============Task 4 ==============");

        String name = ScannerHelper.getAName();

        if(name.length() < 2) {
            System.out.println("Invalid input!!!");
        } else if (name.length() % 2 == 0){
            System.out.println(name.substring(name.length()/2 -1, name.length()/2 + 1));
        } else{
            System.out.println(name.substring(name.length()/2 , name.length()/2 + 1));
        }
        System.out.println("=============Task 5 ==============");

        String country = ScannerHelper.getACounty();

        if(country.length()< 5){
            System.out.println("Invalid input!!!");
        }else{
            System.out.println(country.substring(2,country.length()-2));
        }
        System.out.println("=============Task 6 ==============");

        String userAddress = ScannerHelper.getAAddress();

        System.out.println(userAddress.replace('a', '*').replace('A', '*').replace('e','#')
        .replace('E','#').replace('i','+').replace('I','+').replace('o','@').replace('O','@')
                .replace('u','$').replace('U','$'));

        System.out.println("=============Task 7 ==============");

        int num1 = (int) RandomNumberGenerator.getARandomNumber(0,25);
        int num2 = (int) RandomNumberGenerator.getARandomNumber(0,25);

        String str8 = "";
        for (int i = Math.min(num1,num2); i < Math.max(num1,num2) ; i++) {
            if (i % 5 != 0 ) str8 += (i + " - ");
        }
        System.out.println(str8.substring(0,str8.length()-3));
        System.out.println(num1 + " " + num2);

        System.out.println("=============Task 8 ==============");

        String userSentence = ScannerHelper.getAString();

        if (!userSentence.contains(" ")) System.out.println("This sentence does not have multiple words");
        else System.out.println("This sentence has " + EasyMethodPractices.countSpaces(userSentence) + " words.");

        System.out.println("=============Task 9 ==============");

        int userNum1 = ScannerHelper.getANumber();

        for (int i = 1; i <= userNum1; i++) {
            if (i % 6 == 0 ) System.out.println("FooBar");
            else if (i % 2 == 0) System.out.println("Foo");
            else if (i % 3 == 0) System.out.println("Bar");
            else System.out.println(i);
        }
        System.out.println("=============Task 10 ==============");

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a word");
        String word = scan.nextLine();
        String reverseWord = "";

        if (word.isEmpty() || word.contains(" ")) {
            System.out.println("This word does not have 1 or more characters");
        } else{
            for (int i = word.length() - 1; i >= 0; i--) {
                reverseWord+= word.charAt(i);
            }
            if (reverseWord.equals(word)) {
                System.out.println("This word is a palindrome");
            }else System.out.println("This word is not a palindrome");
        }
        System.out.println("=============Task 11 ==============");

        String userA = scan.nextLine();
        int aCounter = 0;

        if (userA.isEmpty()){
            System.out.println("This sentence does not have any characters");
        }else{
            for (int i = 0; i < userA.length(); i++) {
                if (userA.toLowerCase().charAt(i) == 'a')
                    aCounter++;
            }
        }System.out.println("This sentence has " + aCounter + " a or A letters.");
    }
}
