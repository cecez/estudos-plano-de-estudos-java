package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Curso {
    private String titulo;
    private String instrutor;
    private List<Aula> aulas = new ArrayList<>();

    public Curso(String titulo, String instrutor) {
        this.titulo = titulo;
        this.instrutor = instrutor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public List<Aula> getAulas() {
        return Collections.unmodifiableList(aulas);
    }

    public void adiciona(Aula aula) {
        this.aulas.add(aula);
    }
}
