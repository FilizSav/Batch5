package recursion;

public class UnderstandingRecursion {

        public static void print(){
            System.out.println();
        }
        public static void printNumbers(int end){
            for (int i = 1; i <=end; i++) {
                System.out.println(i);
            }
        }

        public static void printNumRecursively(int end){
            if(end == 0) return;
            printNumRecursively(end - 1);
            System.out.println(end);
        }

    public static void main(String[] args) {
        printNumbers(5);
        printNumRecursively(5);
    }
}
