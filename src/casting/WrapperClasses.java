package casting;

public class WrapperClasses {
    public static void main(String[] args) {
        String s1 = "25", s2 = "10";

        System.out.println(Integer.valueOf(s1) + (Integer.valueOf(s2)) );
        System.out.println(Integer.valueOf(s1) - (Integer.valueOf(s2)) );
        System.out.println(Integer.valueOf(s1) / (Integer.valueOf(s2)) );
        System.out.println(Integer.valueOf(s1) * (Integer.valueOf(s2)) );
        System.out.println(Integer.valueOf(s1) & (Integer.valueOf(s2)) );
        System.out.println(Math.max(Integer.valueOf(s1),(Integer.valueOf(s2))));
        System.out.println(Math.min(Integer.valueOf(s1),(Integer.valueOf(s2))));

    }
}
