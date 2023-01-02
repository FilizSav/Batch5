package collections;

import java.util.Arrays;
import java.util.TreeSet;

public class _03_TreeSet {
    public static void main(String[] args) {

        TreeSet<String> cities = new TreeSet<>(Arrays.asList("Chicago","Miami","New York","San Francisco", "LA"));

        System.out.println(cities);

        System.out.println(cities.headSet("Miami"));
        System.out.println(cities.headSet("Miami",true));
    }
}
