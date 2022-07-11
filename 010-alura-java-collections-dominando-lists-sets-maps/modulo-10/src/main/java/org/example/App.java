package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

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

    }
}
