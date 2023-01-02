package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class _04_SetMethods {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>(); // set no duplicates
        set.add("Foo");
        set.add("Bar");
        set.add("bar");
        set.add("foo");
        set.add("abc");
        set.add("xxx");

        System.out.println(set);
        System.out.println(set.size());
        System.out.println(set.isEmpty());
        System.out.println(set.contains("Foo"));

        System.out.println("===========ForEach============");
        set.forEach(System.out::println);
        System.out.println("===========For-Each============");
        for (String s : set) {
            System.out.println(s);
        }
        System.out.println("===========Iterator============");
        Iterator<String> it = set.iterator();
        while (it.hasNext()) System.out.println(it.next());

        set.removeAll(set);
        System.out.println(set.size());
        System.out.println(set);
    }
}
