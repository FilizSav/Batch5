package practice.arrayList;

import com.sun.corba.se.impl.encoding.CDROutputObject;

public class FooBarPractice {
    public static void main(String[] args) {
printLucky();
        System.out.println("+++++++++++++++");
printFooBar();
    }

    public static void printLucky(){
        for (int i = 1; i <=10; i++){
            if(i % 3 == 0) System.out.println("Lucky");
           else System.out.println(i);
        }
    }

    public static void printFooBar(){

        for (int i = 1; i <=10; i++) {
            if (i % 10== 0) System.out.println("FooBar");
            else if (i % 2 == 0) System.out.println("Foo");
            else if (i % 5 == 0) System.out.println("Bar");
            else System.out.println(i);
        }
    }

}
