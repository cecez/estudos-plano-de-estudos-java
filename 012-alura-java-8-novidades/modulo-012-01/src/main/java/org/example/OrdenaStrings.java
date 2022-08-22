package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaStrings {
    public static void main(String[] args) {
        List<String> palavras = new ArrayList<String>();
        palavras.add("cachorro");
        palavras.add("gnu");
        palavras.add("macaco");
        palavras.add("gato");
        palavras.add("alce");

        Comparator<String> c = new ComparadorPorTamanho();
        // Collections.sort(palavras, c);
        //palavras.sort(c);   // Java 8 (sort() é um default method da interface List)

        // com lambda
        palavras.sort((s1,s2) -> Integer.compare(s1.length(), s2.length()));

        System.out.println(palavras);

        // Consumer<String> consumidor = new ConsumidorEImpressorDeStrings(); // sem classe anônima
        // com classe anônima
//        palavras.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });
        // com lambda
        //palavras.forEach((String s) -> System.out.println(s));
        palavras.forEach((s) -> System.out.println(s));
        // com referencia do metodo
//        palavras.forEach(System.out::println);
    }
}

class ComparadorPorTamanho implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        return Integer.compare(s1.length(), s2.length());
    }
}

//class ConsumidorEImpressorDeStrings implements Consumer<String> {
//    @Override
//    public void accept(String s) {
//        System.out.println(s);
//    }
//}