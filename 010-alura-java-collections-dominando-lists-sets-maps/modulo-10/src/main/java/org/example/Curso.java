package org.example;

import java.util.*;

public class Curso {
    private String titulo;
    private String instrutor;
    private List<Aula> aulas = new ArrayList<>();
    private Set<Aluno> alunos = new HashSet<>();
    private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();

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

    public void matricula(Aluno aluno) {
        this.alunos.add(aluno);
        this.matriculaParaAluno.put(aluno.getMatricula(), aluno);
    }

    public Set<Aluno> getAlunos() {
        return Collections.unmodifiableSet(alunos);
    }

    public boolean estaMatriculado(Aluno aluno) {
        return this.alunos.contains(aluno);
    }

    public Aluno getSemNome(int matricula) {
        if (!this.matriculaParaAluno.containsKey(matricula)) {
            throw new NoSuchElementException("Matricula não encontrada.");
        }
        return this.matriculaParaAluno.get(matricula);
    }
}
