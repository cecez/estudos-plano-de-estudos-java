import java.util.Objects;

public class Produto {

    protected String nome;
    protected int codigo;
    protected double preco;

    public Produto(String nome, int codigo, double preco) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return codigo == produto.codigo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }
}
