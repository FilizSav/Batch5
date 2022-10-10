package string_methods;

public class _08_length_Method {
    public static void main(String[] args) {
        /*
        1. return
        2. return int which is the total count of the character
        3. non-static
        4. doesn't take any argument
         */
        String s = "John";

        int len = s.length();

        System.out.println(len);

        System.out.println("".length());
        System.out.println(" ".length());
        System.out.println("  ".length());


    }
}
