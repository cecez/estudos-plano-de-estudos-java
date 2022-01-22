import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaCorrenteTest {

    ContaCorrente conta;

    @BeforeEach
    void inicializa() {
        conta = new ContaCorrente();
        conta.depositar(100);
    }

    @Test
    void depositar() {
        assertEquals(100, conta.saldo);
    }

    @Test
    void saqueValido() {
        int saque = conta.sacar(50);

        assertEquals(50, saque);
        assertEquals(50, conta.saldo);
    }

    @Test
    void saqueInvalido() {
        int saque = conta.sacar(1000);

        assertEquals(0, saque);
        assertEquals(100, conta.saldo);
    }
}