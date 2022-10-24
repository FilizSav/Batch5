package loops.fori_loops;

public class Exercise02_PrintNumbersDescending {
    public static void main(String[] args) {

    for (int i = 100; i >= 0; i--) {
        System.out.println(i);
        }
        System.out.println("                   ");
        for (int i = 0; i <= 10; i++) {
            if(i % 2 == 0)
                System.out.println(i);
        }
    }
}
