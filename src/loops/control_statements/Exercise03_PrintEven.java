package loops.control_statements;

public class Exercise03_PrintEven {
    public static void main(String[] args) {

        for (int i = 1; i <50; i++) {
            if (i % 2 == 1) continue;
            System.out.println(i);

        }
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 5 ; j++) {
                System.out.println(j + i);
            }
        }
    }
}
