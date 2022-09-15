package mathClass;

public class MathRandom {

    public static void main(String[] args) {

        int myRandom = (int) (Math.random() * 10); //includes 0-9
        int myRandom1 = (int) (Math.random() * 10) + 1; // includes 1-10
        //System.out.println("Random number is = " + Math.random());
        System.out.println("Random number is = " + myRandom);
        System.out.println("Random number is = " + myRandom1);
        // randomNumber * (big num - small num + 1) + starting number

        int myRandom50_100 = (int) (Math.random() * (100-50+1)+50 );
        System.out.println(myRandom50_100);

        int myRandom20_40 = (int) (Math.random() * (40-20+1)+20 );
        System.out.println(myRandom20_40);





    }
}
