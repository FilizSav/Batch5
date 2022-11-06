package practice.arrayList;

import utilities.RandomNumberGenerator;

import java.util.ArrayList;

public class Contains20r3 {
    public static void main(String[] args) {

        System.out.println(contains2or3());
    }

    public static boolean contains2or3() {

        ArrayList<Integer> random = new ArrayList<>();

        for (int i = 0; i <= 5; i++) {
            random.add(RandomNumberGenerator.getARandomNumber(1, 10));

        }
        System.out.println(random);
        return random.contains(2) || random.contains(3);
    }
}
