package casting;

public class Min_Max_Primitives {
    public static void main(String[] args) {
        System.out.println("The min value of byte = " + Byte.MIN_VALUE);
        System.out.println("The max value of byte = " + Byte.MAX_VALUE);

        System.out.println("The min value of int = " + Integer.MIN_VALUE);
        System.out.println("The max value of int = " + Integer.MAX_VALUE);

        String s1 ="100", s2 = "150", s3 = "50";
        int i1 = Integer.parseInt(s1);
        int i2 = Integer.parseInt(s2);
        int i3 = Integer.parseInt(s3);

        System.out.println(Math.abs(i1-i2));
        System.out.println(Math.abs(i3-i2));
        System.out.println(Math.abs(i3-i1));
    }
}
