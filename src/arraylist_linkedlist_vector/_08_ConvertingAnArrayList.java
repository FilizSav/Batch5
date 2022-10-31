package arraylist_linkedlist_vector;

import practice.methods.VoidMethodPractice;

import java.util.*;

public class _08_ConvertingAnArrayList {
    public static void main(String[] args) {


        System.out.println("==========Different ways to creating ArrayList===========");
        String[] arrayCities = {"Tokyo", "Berlin", "Moscow", "Denver"};
        ArrayList<String> cities = new ArrayList<>(Arrays.asList(arrayCities));
        System.out.println(cities);

        ArrayList<String> cities1 = new ArrayList<>(Arrays.asList("Tokyo", "Berlin", "Moscow", "Denver"));

        System.out.println("==========Different ways to creating ArrayList===========");

        Character[] nums = {'A', '#', '5', '+'};
        LinkedList<Character> nums1 = new LinkedList<>(Arrays.asList(nums));
        System.out.println(nums1);

        LinkedList<Character> chars = new LinkedList<>(Arrays.asList('A', '#', '5', '+'));

        System.out.println("==========Different ways to creating ArrayList===========");
        char[] arr2 = {'A', '#', '5', '+'};
        LinkedList<Character> characters = new LinkedList<>();

        for (char c : arr2) {
            characters.add(c);
        }

        System.out.println(characters); // [A, #, 5, +]

        System.out.println("\n------WAY-3 with Collections.addAll() method-----\n");

        Integer[] arr3 = {1, 2, 2, 7, 10};
        Vector<Integer> numbers = new Vector<>();
        Collections.addAll(numbers, arr3);

        System.out.println(numbers); // [1, 2, 2, 7, 10]


        Vector<Integer> numbers1 = new Vector<>(Arrays.asList(1,2,2,7,10));




    }
}
