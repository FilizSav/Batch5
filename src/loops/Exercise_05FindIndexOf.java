package loops;

import utilities.CharMethods;

public class Exercise_05FindIndexOf {
    public static void main(String[] args) {

        System.out.println("1. " + CharMethods.findFirstIndex("I love Java" , 'a'));
        System.out.println("1. " + CharMethods.findLastIndex("I love Java" , 'a'));
        System.out.println("1. " + CharMethods.clearChar("I love Java" , 'a'));

        System.out.println(CharMethods.frontAndBack("abxxxxxab"));
        System.out.println(CharMethods.mostRepeatedChar("abxxxxxab"));
    }
}

