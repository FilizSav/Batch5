package arraylist_linkedlist_vector;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Exercise05_RemoveElementsWithIterator {
    public static void main(String[] args) {

        ArrayList<String> objects = new ArrayList<>(Arrays.asList("Pen", "Pencil", "Book", "Notebook", "MacBook Pro"));

        Iterator<String> bookIterator = objects.iterator();


        while (bookIterator.hasNext()){
            String o = bookIterator.next();

            if (o.toLowerCase().contains("book")) bookIterator.remove();
        }
        System.out.println(objects);
// removing with Collections.removeIf
        objects.removeIf(o -> o.toLowerCase().contains("book"));
        System.out.println(objects);

    }
}
