package br.com.cecez.modulo_009;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Object[] references = new Object[10];

        references[0] = "Teste";
        references[1] = 22;

        System.out.println(references[0]);
        System.out.println(references[1]);

        System.out.println(references.length);

        ArrayList list = new ArrayList();
        list.add("Test");
        list.add(2);

        System.out.println(list.size());
    }
}