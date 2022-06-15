package org.example;

public class Resource implements AutoCloseable {

    public Resource() {
        System.out.println("Opening resource...");
    }

    public void read() {
        System.out.println("... Reading resource ...");
        throw new IllegalStateException("Error reading resource.");
    }

    @Override
    public void close() {
        System.out.println("... Closing resource automagically.");
    }
}
