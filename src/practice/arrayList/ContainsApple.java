package practice.arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ContainsApple {
    public static void main(String[] args) {
        ArrayList<String> apples = new ArrayList<>(Arrays.asList("banana", "orange", "Apple"));
        System.out.println(containsApple(apples));
    }

    public static boolean containsApple(ArrayList<String> strings){

        for (String string : strings) {
            if(string.toLowerCase().contains("apple")) return true;
        }return false;
    }
    public static boolean containsApples(ArrayList<String> strings){
        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).equalsIgnoreCase("apple")) return true;
        }return false;
    }
}
