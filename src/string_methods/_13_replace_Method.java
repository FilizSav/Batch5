package string_methods;

public class _13_replace_Method {
    public static void main(String[] args) {
        /*
        1.return
        2. returns a string
        3. non - static
        4.
         */

        String s = "Can I can a can";

        String s1 = s.replace('a','A');
        System.out.println(s1);
        System.out.println(s.toLowerCase().replace("can", "xxx"));

        String str1 = "John";
        str1 = str1.replace("o", "oooo");
        System.out.println(str1);

    }

}
