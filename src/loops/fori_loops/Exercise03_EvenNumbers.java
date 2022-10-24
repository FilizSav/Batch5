package loops.fori_loops;

public class Exercise03_EvenNumbers {
    public static void main(String[] args) {
//for (int i = 0; i <= 10; i+=2) even   NOT RECOMMENDED
//for (int i = 1; i <= 10; i+=2) odd    NOT RECOMMENDED


        for (int i = 0; i <= 10; i++) {
            if(i % 2 == 0)
                System.out.println(i);
        }
    }
}
