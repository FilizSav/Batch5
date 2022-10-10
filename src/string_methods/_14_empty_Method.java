package string_methods;

public class _14_empty_Method {
    public static void main(String[] args) {
        /*
        1.return
        2.returns a boolean
        3. non-static
        4. no argument
         */

        String s1 = "Hello";
        String s2 = " ";
        String s3 = ""; // length is == 0

        System.out.println(s1.isEmpty());
        System.out.println(s2.isEmpty());
        System.out.println(s3.isEmpty());
    }
}
