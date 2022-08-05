package org.example;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TesteSerializacao {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // Armazenando
//        String nome = "Cezario";
//        ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(Paths.get("string.string")));
//        oos.writeObject(nome);
//        oos.close();

        // Recuperando
        ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(Paths.get("string.string")));
        String desserializado = (String) ois.readObject();
        ois.close();
        System.out.println(desserializado);
    }
}
