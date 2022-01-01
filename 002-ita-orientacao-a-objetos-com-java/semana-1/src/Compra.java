public class Compra {
    private int valorTotal;
    private int numeroParcelas;

    Compra(int valor) {
        valorTotal = valor;
        numeroParcelas = 1;
    }

    Compra(int valorDaParcela, int quantidadeDeParcelas) {
        valorTotal = valorDaParcela * quantidadeDeParcelas;
        numeroParcelas = quantidadeDeParcelas;
    }

    public int getValorTotal() {
        return valorTotal;
    }

    public int getValorParcela() {
        return valorTotal / numeroParcelas;
    }

    public int getNumeroParcelas() {
        return numeroParcelas;
    }
}
