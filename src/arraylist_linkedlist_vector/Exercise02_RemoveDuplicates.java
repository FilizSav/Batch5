package arraylist_linkedlist_vector;


import java.util.ArrayList;
import java.util.Arrays;

public class Exercise02_RemoveDuplicates {
    public static void main(String[] args) {

        ArrayList<String> lan = new ArrayList<>(Arrays.asList("Java","JavaScript", "Ruby", "Go", "Java", "Ruby", "Java"));
        ArrayList<String> uniques = new ArrayList<>();

        for (String s : lan) {
            if(!uniques.contains(s)) uniques.add(s);
        }
        System.out.println(uniques);
    }
}
