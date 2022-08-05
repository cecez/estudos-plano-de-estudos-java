package org.example;

import java.io.FileWriter;
import java.io.IOException;

public class TesteEscrita2 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("lorem3.txt");
        fw.write("Teste de escrita");
        fw.write(System.lineSeparator());
        fw.write(System.lineSeparator());
        fw.write("Fim.");
        fw.close();
    }
}
