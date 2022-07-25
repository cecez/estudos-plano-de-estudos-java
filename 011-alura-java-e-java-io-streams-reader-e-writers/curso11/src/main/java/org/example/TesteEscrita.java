package org.example;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TesteEscrita {
    public static void main(String[] args) throws IOException {
        OutputStream fos = Files.newOutputStream(Paths.get("lorem2.txt"));
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        bw.write("Linha um");
        bw.newLine();
        bw.write("Linha zwei");

        bw.close();
    }
}
