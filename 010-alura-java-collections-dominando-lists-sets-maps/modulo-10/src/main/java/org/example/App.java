package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Aula aula1 = new Aula("Eins", 1);
        Aula aula2 = new Aula("Zwei", 2);
        Aula aula3 = new Aula("Drei", 3);

        ArrayList<Aula> aulas = new ArrayList<>();
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);

        Collections.sort(aulas);

        System.out.println(aulas);

        aulas.sort(Comparator.comparing(Aula::getTempo));

        System.out.println(aulas);

        semNome();
    }

    public static void semNome() {
        System.out.println("---------");

        Curso javaCollections = new Curso("Java Collections", "Paulo Silveira");
        javaCollections.adiciona(new Aula("Aula 10", 10));
        javaCollections.adiciona(new Aula("Aula 5", 5));
        javaCollections.adiciona(new Aula("Aula 2", 2));

        List<Aula> aulasImutaveis = javaCollections.getAulas();
        List<Aula> aulasMutaveis = new ArrayList<Aula>(aulasImutaveis);
        Collections.sort(aulasMutaveis);
        System.out.println(aulasMutaveis);

        System.out.println("---------");
    }
}
