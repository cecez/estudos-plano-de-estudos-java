package org.example;

public class Curso {
    private String nome;
    private int quantidadeDeAlunos;

    public Curso(String nome, int quantidadeDeAlunos) {
        this.nome = nome;
        this.quantidadeDeAlunos = quantidadeDeAlunos;
    }

    public String getNome() {
        return this.nome;
    }

    public int getQuantidadeDeAlunos() {
        return this.quantidadeDeAlunos;
    }

    @Override
    public String toString() {
        return this.nome + " - " + this.quantidadeDeAlunos;
    }
}
