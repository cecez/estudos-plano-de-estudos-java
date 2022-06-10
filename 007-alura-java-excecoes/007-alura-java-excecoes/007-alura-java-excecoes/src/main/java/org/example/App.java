package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        method1();
        System.out.println("Good bye");
    }

    private static void method1() {
        System.out.println("Init method 1");
        method2();
        System.out.println("end method 1");
    }

    private static void method2() {
        System.out.println("init method 2");
        for (int i=1; i<=5; i++) {
            System.out.println(i);
            throw new ArithmeticException();
        }
        System.out.println("end method 2");
    }
}
