package string_methods;

public class Exercise04_Substring {
    public static void main(String[] args) {
        /*
        ASK-2
Assume you are given below sentence
 "Java is an object-oriented programming language"
Write a Java program that extracts "Java" and "object-oriented" from given sentence
And store extracted values in separate Strings
Finally, print the extracted Strings
         */

       String s1 = "Java is an object-oriented programming language";

       String s2 = s1.substring(0,4);
       String s3 = s1.substring(11,26);
       System.out.println(s2 + " " +s3);

       String java = "Java";
       String oo = "object-oriented";

       System.out.println(s1.substring(s1.indexOf(java), java.length()));
       System.out.println(s1.substring(s1.indexOf(oo), s1.indexOf(oo)+oo.length()));

       System.out.println(s1.substring(s1.indexOf('J')));



    }
}
