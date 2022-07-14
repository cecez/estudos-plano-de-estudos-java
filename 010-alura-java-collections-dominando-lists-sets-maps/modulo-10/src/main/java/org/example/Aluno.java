package org.example;

public class Aluno {
    private String nome;
    private int matricula;

    public Aluno(String nome, int matricula) {
        if (nome == null) throw new IllegalStateException("Nome de aluno é obrigatório.");
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Aluno)) return false;
        Aluno outroAluno = (Aluno) obj;
        return this.nome.equals(outroAluno.nome);
    }

    @Override
    public int hashCode() {
        return this.nome.hashCode();
    }
}
