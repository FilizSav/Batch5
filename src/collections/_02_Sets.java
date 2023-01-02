package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class _02_Sets {
    public static void main(String[] args) {


        HashSet<Integer> hashSet = new HashSet<>();
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        hashSet.add(5);
        hashSet.add(5);
        hashSet.add(10);
        hashSet.add(0);
        hashSet.add(null);
        hashSet.add(null);
        hashSet.add(-1);
        hashSet.add(1);

        System.out.println(hashSet);

        linkedHashSet.add(5);
        linkedHashSet.add(5);
        linkedHashSet.add(10);
        linkedHashSet.add(0);
        linkedHashSet.add(null);
        linkedHashSet.add(null);
        linkedHashSet.add(-1);
        linkedHashSet.add(1);
        // random insertion for linkedHashSet
        System.out.println(linkedHashSet);

        treeSet.add(5);
        treeSet.add(5);
        treeSet.add(10);
        treeSet.add(0);
        try{treeSet.add(null);
        treeSet.add(null);}
        catch (Exception e){
            System.out.println(e.getLocalizedMessage());
        }
        treeSet.add(-1);
        treeSet.add(1);
        System.out.println(treeSet.pollLast());


        System.out.println(treeSet);

    }
}
