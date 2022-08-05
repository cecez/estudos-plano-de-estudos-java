package org.example;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class TesteEscrita3 {
    public static void main(String[] args) throws IOException {
//        PrintStream ps = new PrintStream("print-stream.txt");
        PrintWriter pw = new PrintWriter("print-writer.txt", "UTF-8");
        pw.println("Teste com PrintWriter");
        pw.println();
        pw.println("Fim.");
        pw.close();
    }
}
