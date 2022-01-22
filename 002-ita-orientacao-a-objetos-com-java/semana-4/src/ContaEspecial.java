public class ContaEspecial extends ContaCorrente {

    int limite;

    ContaEspecial(int limite) {
        this.limite = limite;
    }

    @Override
    public int sacar(int valor) {
        if (valor > (saldo+limite)) {
            return 0;
        }

        saldo -= valor;
        return valor;
    }
}
