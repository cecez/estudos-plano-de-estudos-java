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
        // old way to deal with exceptions/resources
        try {
            method1();
        } catch (ArithmeticException exception) {
            System.out.println("<---- ArithmeticException");
        } finally {
            System.out.println("Finally");
        }
        System.out.println("Good bye");
        System.out.println("-------------------");

        // new way to deal with exceptions/resources
        try (Resource resource = new Resource()) {
            resource.read();
        } catch (IllegalStateException exception) {
            System.out.println("<---- IllegalStateException");
        }
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
