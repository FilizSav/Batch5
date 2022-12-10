package homeworks;

public class Homework12 {
    public static void main(String[] args) {
    String s1 = "";
    String s2 = "Java";
    String s3 = "123Hello";
    String s4 = "123Hello World149";
    String s5 = "123Tech456Global149";

    System.out.println("==============TASK 1===================");
    System.out.println(noDigit(s1));
    System.out.println(noDigit(s2));
    System.out.println(noDigit(s3));
    System.out.println(noDigit(s4));
    System.out.println(noDigit(s5));
    System.out.println("=====================");
    System.out.println(noDigit1(s5));

    System.out.println("==============TASK 2===================");
    String s21 = "";
    String s22 = "JAVA";
    String s23 = "xyz";
    String s24 = "123$";
    String s25 = "TechGlobal";

    System.out.println(noVowel(s21));
    System.out.println(noVowel(s22));
    System.out.println(noVowel(s23));
    System.out.println(noVowel(s24));
    System.out.println(noVowel(s25));

    }
    public static String noDigit(String str){
     return str.replaceAll("[0-9]","");
    }
    public static String noDigit1(String str) {
        String s = "";
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i)))
                s += str.charAt(i);
        } return s;
    }
    public static String noVowel(String str){
        return str.replaceAll("(?i)[,a,e,i,o,u]","");
    }
}
