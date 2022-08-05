package org.example;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura2 {
    public static void main(String[] args) throws IOException {
        Scanner scannerDeArquivo = new Scanner(new File("lorem.txt"), "UTF-8");
        while (scannerDeArquivo.hasNextLine()) {
            String linha = scannerDeArquivo.nextLine();
            String[] celulas = linha.split(",");
            System.out.println(Arrays.toString(celulas));

            Scanner scannerDeLinha = new Scanner(linha);
            scannerDeLinha.useLocale(Locale.US);
            scannerDeLinha.useDelimiter(",");

            String valor1 = scannerDeLinha.next();
            int valor2 = scannerDeLinha.nextInt();
            double valor3 = scannerDeLinha.nextDouble();

            System.out.println("Scanner de linha");
            System.out.format(
                new Locale("pt", "BR"),
                "%s %04d %.2f", valor1, valor2, valor3
            );


            scannerDeLinha.close();
        }
        scannerDeArquivo.close();

    }
}
