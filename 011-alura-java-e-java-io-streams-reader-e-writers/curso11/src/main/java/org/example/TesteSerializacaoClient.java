package org.example;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TesteSerializacaoClient {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        BankClient bc = new BankClient("Nombre", "00011122233", "Professor");

        // Serializando
//        ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(Paths.get("bank.client")));
//        oos.writeObject(bc);
//        oos.close();


        // Desserializando
        ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(Paths.get("bank.client")));
        BankClient bcd = (BankClient) ois.readObject();
        System.out.println(bcd.getName());
    }
}
