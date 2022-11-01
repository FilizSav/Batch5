package homeworks;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Homework07 {
    public static void main(String[] args) {

        System.out.println("\n-------------Task 1--------------\n");

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(10, 23, 67, 23, 78));

        System.out.println(numbers.get(3));
        System.out.println(numbers.get(0));
        System.out.println(numbers.get(2));
        System.out.println(numbers);

        System.out.println("\n-------------Task 2--------------\n");

        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Blue", "Brown", "Red", "White", "Black", "Purple"));
        System.out.println(colors.get(1));
        System.out.println(colors.get(3));
        System.out.println(colors.get(5));
        System.out.println(colors);

        System.out.println("\n-------------Task 3--------------\n");

         ArrayList<Integer> numbers1 = new ArrayList<>(Arrays.asList(23, -34, -56, 0, 89, 100));

        System.out.println(numbers1);
        Collections.sort(numbers1);
        System.out.println(numbers1);

        System.out.println("\n-------------Task 4--------------\n");

        ArrayList<String> cities = new ArrayList<>(Arrays.asList("Istanbul","Berlin","Madrid","Paris"));

        System.out.println(cities);
        Collections.sort(cities);
        System.out.println(cities);

        System.out.println("\n-------------Task 5--------------\n");

        ArrayList<String> characters = new ArrayList<>(Arrays.asList("Spider Man", "Iron Man", "Black Panter", "Deadpool", "Captain America"));

        System.out.println(characters);

        boolean exists = false;
        for (String c : characters) {
            if (c.contains("Wolwerine")) exists = true;
            break;
        }
        System.out.println(exists);

        System.out.println("\n-------------Task 6--------------\n");

        ArrayList<String> characters1 = new ArrayList<>(Arrays.asList("Hulk","Black Widow","Captain America","Iron Man"));

        Collections.sort(characters1);
        System.out.println(characters1);
        boolean hulkExists = false, ironManExits = false;
        for (String c : characters1) {
            if(c.contains("Hulk")) hulkExists = true;
            if (c.contains("Iron Man")) ironManExits = true;
        }
        System.out.println(hulkExists == ironManExits);

        System.out.println("\n-------------Task 7--------------\n");

        ArrayList<Character> chars = new ArrayList<>(Arrays.asList('A', 'x', '$', '%', '9','*','+','F','G'));

        System.out.println(chars);

        for (char c : chars) {
            System.out.println(c);
        }

        System.out.println("\n-------------Task 8--------------\n");

        ArrayList<String> objects = new ArrayList<>(Arrays.asList("Desk","Laptop","Mouse","Monitor","Mouse-Pad","Adapter"));

        System.out.println(objects);
        Collections.sort(objects);
        System.out.println(objects);

        int countM = 0, countNoAE =0;
        for (String o : objects) {
            if (o.toLowerCase().contains("m")) countM++;
            if (!o.toLowerCase().contains("a") && !o.toLowerCase().contains("e")) countNoAE++;
        }
        System.out.println(countM);
        System.out.println(countNoAE);

        System.out.println("\n-------------Task 9--------------\n");

        ArrayList<String> kitchen = new ArrayList<>(Arrays.asList("Plate", "spoon", "fork", "Knife", "cup", "Mixer"));

        System.out.println(kitchen);

        int countUp =0, countL=0, hasP=0, endsP=0;

         for (String s : kitchen) {
            if (Character.isUpperCase(s.charAt(0))) countUp++;
            else countL++;
            if (s.contains("P") || s.contains("p")) hasP++;
            if (s.toLowerCase().startsWith("p") || s.toLowerCase().endsWith("p")) endsP++;
        }
        System.out.println("Elements starts with uppercase = " + countUp);
        System.out.println("Elements starts with lowercase = " + countL);
        System.out.println("Elements having P or p = " + hasP);
        System.out.println("Elements starting or ending with P or p = " + endsP);

        System.out.println("\n-------------Task 10--------------\n");

        ArrayList<Integer> nums1 = new ArrayList<>(Arrays.asList(3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78));

        System.out.println(nums1);

        int count10 = 0, countEven = 0, countOdd = 0, countLess = 0;

        for (Integer n : nums1) {
            if(n % 10 == 0 ) count10++;
            if(n % 2 == 0 && n>15)countEven++;
            if(n % 2 !=0 && n < 20) countOdd++;
            if (n <= 15 || n >= 50) countLess++;
        }
        System.out.println("Elements that can be divided by 10 = " + count10);
        System.out.println("Elements that are even and greater than 15 = " + countEven);
        System.out.println("Elements that are odd and less than 20 = " + countOdd++);
        System.out.println("Elements that are less than 15 or greater than 50 = " +countLess);
    }
}
