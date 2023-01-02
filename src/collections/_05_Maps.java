package collections;

import java.util.HashMap;
import java.util.Map;

public class _05_Maps {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>(); // LinkedHashMap has insertion order
        map.put("IL", "Illinois");
        map.put("WI", "Wisconsin");
        map.put("CA", "California");

        System.out.println(map);
        HashMap<Integer, String> map1 = new HashMap<>(); // Can cant be duplicated - value can be duplicated
        map1.put( 1, "Vlad");
        map1.put(2, "Andrii");
        map1.put(3, "Filiz");
        map1.put(4, "Vlad");

        System.out.println(map1);

        System.out.println(map1.remove(1));
        System.out.println(map1);
    }
}
