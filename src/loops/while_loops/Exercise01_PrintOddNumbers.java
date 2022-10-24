package loops.while_loops;

public class Exercise01_PrintOddNumbers {
    public static void main(String[] args) {
        /*
        while(test condition){
	    code block to be executed
	    fori (int i = 0; i<= 10; i++)
         */
        int i =1;
        while(i <=10) {
            if (i % 2 == 1) System.out.println(i);
            i++;
        }
    }
}
