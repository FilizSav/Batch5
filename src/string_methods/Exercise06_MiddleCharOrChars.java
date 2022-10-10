package string_methods;

import utilities.ScannerHelper;


public class Exercise06_MiddleCharOrChars {
    public static void main(String[] args) {

        //name.substring(name.length()/2-1,name.length()/2+1)) ---> formula for middle chars
        //name.charAt(name.length()/2))         -------> formula for single char
        // name.charAt(name.length()-1))  ------> last character  -1 last one -2 last 2
        // % 2 == 0    -----> formula for EVEN

    String name = ScannerHelper.getAName();

    if(name.length() % 2 ==0) {
        System.out.println("Middle chars are = " + name.substring(name.length()/2-1,name.length()/2+1));
    } else System.out.println("Middle char is = " +name.charAt(name.length()/2));

    System.out.println("First character in the name is = " + name.charAt(0));
    System.out.println("Last character in the name is = " + name.charAt(name.length()-1));

    System.out.println(name.charAt(name.length()/2));
    //System.out.println(name.substring(name.length()/2-1,name.length()/2+1));




    }
}
