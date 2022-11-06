package arraylist_linkedlist_vector;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class _11_Iterator {
    public static void main(String[] args) {

        ArrayList<String> food = new ArrayList<>(Arrays.asList("Pizza", "Pasta", "Burger", "Lamb chops", "Salad", "Falafel","Sushi"));

       food.removeIf(x -> x.length() ==5);
        System.out.println(food);

        Iterator<String> foodIterator = food.iterator();
        System.out.println(food.iterator().hasNext());

        while (foodIterator.hasNext()){
           String f = foodIterator.next();

           if (f.length() == 5) foodIterator.remove();
        }
        System.out.println(food);
    }
}
