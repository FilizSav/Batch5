package loops.while_loops;

public class Exercise02_PrintNumbersDiv3 {
    public static void main(String[] args) {
        /*
        while(test condition){
	    code block to be executed
	    fori (int i = 0; i<= 10; i++)
         */
        int i =1;
        while(i <=100) {
            if (i % 3 == 0) System.out.println(i);
            i++;
        }

        String name = "filiz";

        System.out.println(name.charAt(0));
    }
}
