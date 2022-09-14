package operators.incremanet_decrement_operators;

public class MultiplicationTable {
    public static void main(String[] args) {
        int num = 5;
        int start = 1;
        System.out.println(num + " * " +start +" = " +num * start++);
        System.out.println(num + " * " +start +" = " +num * start++);
        System.out.println(num + " * " +start +" = " +num * start++);
        System.out.println(num + " * " +start +" = " +num * start++);
        System.out.println(num + " * " +start +" = " +num * start++);
        System.out.println(num + " * " +start +" = " +num * start++);
        System.out.println(num + " * " +start +" = " +num * start++);
        System.out.println(num + " * " +start +" = " +num * start++);
        System.out.println(num + " * " +start +" = " +num * start++);

        int number =3;
        for(int i=1; i<=100; i++){System.out.println(number + " * " +start +" = " +number * start++);}

        byte b1=5, b2=5;
        System.out.println(b1++);
        System.out.println(b1);
    }
}
