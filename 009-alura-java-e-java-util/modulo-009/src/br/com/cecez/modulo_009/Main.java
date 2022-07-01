package br.com.cecez.modulo_009;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

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

        Comparator<Object> comparator = new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                return 0;
            }
        };

        list.sort(comparator);

        System.out.println(list.size());
    }
}