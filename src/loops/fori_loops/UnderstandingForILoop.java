package loops.fori_loops;

public class UnderstandingForILoop {
    public static void main(String[] args) {
        /*
        Syntax
        for(initialization;termination condition; change({
           // code block to be executed
           }
         */

        for (int i = 1; i < 10; i++) {
            if(i % 2 == 0)
            System.out.println(+ i + " Hello");
        }
        System.out.println("                       ");
        int sum =0;
        for (int i =10; i <= 15; i++) {
            sum+= i;
        }
            System.out.println(sum);
        System.out.println("                       ");

        for (int i =1; i<=50; i++){
            if(i % 5 == 0) System.out.println(i);
        }
        System.out.println("                       ");

        String str = "TechGlobal School";

        for (int i = 0; i <=str.length()-1; i++) {
            System.out.println(str.charAt(i));
        }

    }
}
