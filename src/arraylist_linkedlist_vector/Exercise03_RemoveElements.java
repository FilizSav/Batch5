package arraylist_linkedlist_vector;

import java.util.Arrays;
import java.util.LinkedList;

public class Exercise03_RemoveElements {
    public static void main(String[] args) {

        LinkedList<String> languages = new LinkedList<>(Arrays.asList("Java", "JavaScript", "C#", "Python", "C++"));

//        for (int i = 0; i < languages.size(); i++) {
//           if (languages.get(i).startsWith("J"));languages.remove(languages.get(i)); i--;
//        }
//
//        System.out.println(languages);

        languages.removeIf(x -> x.length()>5);
        System.out.println(languages);

        languages.removeIf(x -> !x.startsWith("C"));
        System.out.println(languages.size());
    }
}
