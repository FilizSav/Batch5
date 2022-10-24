package loops.nested_loops.shapes;

public class Exercise01_ARectangle {
    public static void main(String[] args) {


        for (int i = 6; i >= 1; i--){
            for (int j = 6; j >= i; j--) {
                System.out.print(" ");
            }
            System.out.println("A");
        }
    }
}
