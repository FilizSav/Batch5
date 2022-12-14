package recursion;

public class Practice01 {
    public static void sum(int x){
        int sum = 0;
        for (int i = 0; i <= x; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    public static int sum2(int x) {
        if (x != 0)
            return x + sum2(x - 1);
        else
            return x;
    }

    public static void main(String[] args) {
        sum(5);
        System.out.println(sum2(5));
        System.out.println(productRecursively(5));
        System.out.println(reverseString("string"));

    }
    public static int productRecursively(int x) {
        if (x != 1) return x * productRecursively(x - 1);
        return x;
    }
    public static String reverseString(String s){
        if(s.length() < 2) return s;
        return reverseString(s.substring(1)) + s.charAt(0);
    }
}
