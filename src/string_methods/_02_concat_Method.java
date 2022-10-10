package string_methods;


public class _02_concat_Method {
    public static void main(String[] args) {
        /*
        1. return -if you can put in another variable
        2. returns a string
        3. non-static - because you called it with an object
        4. takes one argument as String
         */
        String  str1 = "Tech";
        String  str2 = "Global";

        String str3 = str1.concat(str2);

        System.out.println(str3);
    }
}
