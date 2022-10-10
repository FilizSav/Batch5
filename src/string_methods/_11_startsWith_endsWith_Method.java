package string_methods;

public class _11_startsWith_endsWith_Method {

    public static void main(String[] args) {
        /*
        1. return
        2. returns a boolean
        3. non-static
        4. overloaded but we will use only one argument
         */
        String s = "TechGlobal";

        System.out.println(s.startsWith("T"));
        System.out.println(s.startsWith("t"));
        System.out.println(s.startsWith("Tech"));

        System.out.println(s.endsWith("Global"));

        String city = "Chicago";
        System.out.println(city.startsWith(city));
        System.out.println(city.startsWith("Chicago"));


    }
}
