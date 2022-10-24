package arrays;

public class DeclaringAnArray {
    public static void main(String[] args) {

        String name;
        int age;
        String[] countries;
        int[] numbers;
        char[] characters;
        double[] doubles;
        boolean[] booleans;
        //initialization - assignment with size only

        countries = new String[3];
        numbers = new int[5];
        characters = new char[4];
        doubles = new double[4];
        booleans = new boolean[4];

        System.out.println(countries[0]);
        System.out.println(numbers[1]);
        System.out.println(characters[0]);
        System.out.println(doubles[0]);
        System.out.println(booleans[0]);


    }
}
