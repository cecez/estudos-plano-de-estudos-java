package org.example.models;

public class Categoria {
    private int id;
    private String nome;

    public Categoria(String nome) {
        this.nome = nome;
    }

    public Categoria (int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Categoria() {

    }

    public String getNome() {
        return nome;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Categoria{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }
}
