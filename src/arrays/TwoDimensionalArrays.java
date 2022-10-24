package arrays;

import java.util.Arrays;

public class TwoDimensionalArrays {
    public static void main(String[] args) {

        String[][] students = {
                {"Ali", "Mehmet", "Alex"},
                {"Alex", "Regina"},
                {"Abdullah", "Newer"}
        };
        System.out.println(students[1][1]); // Regina
        System.out.println(students.length);
        System.out.println(Arrays.toString(students[0]));

        System.out.println(" \n      For I           ");

        for (int i = 0; i < students.length; i++) {
            System.out.println(Arrays.toString(students[i]));}

            System.out.println("  \n     For         ");

        for (String[] student : students) {
                System.out.println(Arrays.toString(student));
        }
        System.out.println("  \n     For         ");

        // PRINTS ON ONE LINE
        System.out.println(Arrays.deepToString(students));

        // PRINTING A MULTI ARRAY LIST
        for (String[] group : students) {
            for (String student : group) {
                System.out.println(student);
            }
        }
        System.out.println("  \n     For    I     ");
        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < students[i].length; j++) {
                System.out.println(students[i][j]);

            }
        }
    }
}
