public class ContaCorrente {
    int saldo = 0;

    public void depositar(int valor) {
        saldo += valor;
    }

    public int sacar(int valor) {
        if (valor > saldo) {
            return 0;
        }

        saldo -= valor;
        return valor;
    }

}
