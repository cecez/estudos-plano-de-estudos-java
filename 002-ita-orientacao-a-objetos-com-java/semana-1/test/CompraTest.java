import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompraTest {

    @Test
    public void compraAVista() {
        Compra compraAVista = new Compra(500);

        assertEquals(1, compraAVista.getNumeroParcelas());
        assertEquals(500, compraAVista.getValorParcela());
        assertEquals(500, compraAVista.getValorTotal());
    }

    @Test
    public void compraParcelada() {
        Compra compraParcelada = new Compra(100, 2);

        assertEquals(2, compraParcelada.getNumeroParcelas());
        assertEquals(100, compraParcelada.getValorParcela());
        assertEquals(200, compraParcelada.getValorTotal());
    }

}