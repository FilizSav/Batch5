package string_methods;

public class _05_toUpperCase_toLowerCase_Method {
    public static void main(String[] args) {
        /*
        1. return
        2. returns a String
        3. non-static
        4. The one we use doesn't take argument - there are overloaded methods
         */
        String name = "John";

        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());

        System.out.println("hello".toUpperCase());
        System.out.println("heLLO".toLowerCase());

        System.out.println("ab".toUpperCase().concat("xY")); //ABxy
        System.out.println("ab".toUpperCase().concat("xY").toLowerCase()); //abxy
    }
}
