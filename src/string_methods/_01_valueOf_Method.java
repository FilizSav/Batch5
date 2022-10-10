package string_methods;

public class _01_valueOf_Method {
    public static void main(String[] args) {
        /*
        1. return type
        2. returns string
        3. static - you call it by the class
        4. takes arguments - there are many overloaded valueOf() methods
         */
        int num = 125;

        String numString = String.valueOf(num); // converts data type to string

        System.out.println(num + 5);
        System.out.println(numString + 5);
    }
}
