package arrays;

public class _08_findFirstEvenOdd {
    public static void main(String[] args) {

        int[] evenOdd = {0, 5, 3, 2, 4, 7, 10};
        EvenOdd(evenOdd);

    }

    public static void EvenOdd(int[] num) {

        int even = 0, odd = 0;
        boolean oddFound = false, evenFound = false;

        for (int n : num) {
            if (!evenFound && n % 2 == 0) { // if first even not found and the number is odd
                even = n;
                evenFound = true;   //marking flag as true so next time you will know even has been found
            } else if (!oddFound && n % 2 == 1) { // if first odd not found and the number is odd
                odd = n;
                oddFound = true;
            }
        }
        // evenFound ? "First even = " + even : "There is no even numbers in this array");
        if (evenFound) System.out.println("First even = " + even);
        else System.out.println("There is no even numbers in this array");

        if (oddFound) System.out.println("First odd = " + odd);
        else System.out.println("There is no even numbers in this array");
    }

    public static void FindFirstA(String[] strs){

        boolean hasA = false;

        for (String s : strs) {
            if(s.toLowerCase().startsWith("a")){
                System.out.println(s);
            }
        }
    }
}


