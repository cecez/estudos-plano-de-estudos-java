package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class ExemploCursos {
    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<>();
        cursos.add(new Curso("Curso um", 32));
        cursos.add(new Curso("Curso 2", 22));
        cursos.add(new Curso("Curso drei", 31));

        cursos.sort(Comparator.comparing(Curso::getQuantidadeDeAlunos));
        cursos.forEach(System.out::println);

        System.out.println("----");

        cursos
            .stream()
            .filter(curso -> curso.getQuantidadeDeAlunos() > 30)
            .forEach(System.out::println);

        System.out.println("----");

        cursos
            .stream()
            .filter(curso -> curso.getQuantidadeDeAlunos() > 30)
            .map(Curso::getQuantidadeDeAlunos)
            .forEach(System.out::println);

        System.out.println("--Optional--");

        cursos
            .stream()
            .filter(curso -> curso.getQuantidadeDeAlunos() >= 100)
            .findFirst()
            .ifPresent(curso -> System.out.println(curso.getNome()));

        Optional<Curso> optionalCursos = cursos
            .stream()
            .filter(curso -> curso.getQuantidadeDeAlunos() >= 30)
            .findFirst();

        optionalCursos.ifPresent(System.out::println);

        System.out.println("--stream to List--");

        List<Curso> cursoList = cursos.stream()
                .filter(curso -> curso.getQuantidadeDeAlunos() >= 20)
                .collect(Collectors.toList()); // Java 8

        System.out.println(cursoList);

        System.out.println("--stream to Map--");

        Map<String, Integer> cursoMap = cursos.stream()
                .filter(curso -> curso.getQuantidadeDeAlunos() >= 20)
                .collect(Collectors.toMap(Curso::getNome, Curso::getQuantidadeDeAlunos));

        System.out.println(cursoMap);

        System.out.println("--parallel stream to Map--");

        cursoMap = cursos.parallelStream()
                .filter(curso -> curso.getQuantidadeDeAlunos() >= 20)
                .collect(Collectors.toMap(Curso::getNome, Curso::getQuantidadeDeAlunos));

        System.out.println(cursoMap);
    }
}
