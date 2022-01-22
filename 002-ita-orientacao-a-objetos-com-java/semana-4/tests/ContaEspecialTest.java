import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaEspecialTest extends ContaCorrenteTest {

    @BeforeEach
    void inicializa() {
        conta = new ContaEspecial(100);
        conta.depositar(100);
    }

    @Test
    void saqueDentroDoLimite() {
        int saque = conta.sacar(200);

        assertEquals(200, saque);
        assertEquals(-100, conta.saldo);
    }


}