import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarrinhoDeComprasTest {

    @Test
    void testeGeral() {

        Produto p1 = new Produto("p1", 10, 100.50);
        Produto p2 = new Produto("p2", 20, 10.50);
        ProdutoComTamanho pt1 = new ProdutoComTamanho("pt1", 30, 50.00, 49);
        ProdutoComTamanho pt2 = new ProdutoComTamanho("pt1", 30, 10.00, 36);

        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        carrinhoDeCompras.adicionaProduto(p1, 2);
        carrinhoDeCompras.adicionaProduto(p2, 3);
        carrinhoDeCompras.adicionaProduto(pt1, 2);
        carrinhoDeCompras.adicionaProduto(pt2, 5);

        double precoEsperado = (100.50*2) + (10.50*3) + (50.00*2) + (10.00*5);
        assertEquals(precoEsperado, carrinhoDeCompras.valorTotal());
    }

}