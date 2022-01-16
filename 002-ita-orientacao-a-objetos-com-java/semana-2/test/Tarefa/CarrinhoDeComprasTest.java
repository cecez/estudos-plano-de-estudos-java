package Tarefa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 [x] Faça os testes da classe CarrinhoDeCompras,
    [x] verificando se o preço das pizzas são somados corretamente
    [x] e se ele impede a adição de uma pizza sem ingredientes.

 */

class CarrinhoDeComprasTest {

    @Test
    public void impedePizzaSemIngredientes()
    {

        // arrange
        Pizza pizza0 = new Pizza();
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        // act e assert
        Exception exception = assertThrows(Exception.class, () -> carrinhoDeCompras.adiciona(pizza0));
    }

    @Test
    public void permitePizzaComIngredientes()
    {

        // arrange
        Pizza pizza1 = new Pizza();
        pizza1.adicionaIngrediente("Ingrediente 1");
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        // act e assert
        assertDoesNotThrow(() -> carrinhoDeCompras.adiciona(pizza1));
    }

    @Test
    public void somaDePrecos()
    {
        // arrange
        Pizza pizza2 = PizzaTest.criaPizza(2);  // $ 15
        Pizza pizza5 = PizzaTest.criaPizza(5);  // $ 20
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        try {
            carrinhoDeCompras.adiciona(pizza2);
            carrinhoDeCompras.adiciona(pizza5);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // act
        int precoFinal = carrinhoDeCompras.valorTotal();

        // assert
        assertEquals((15+20), precoFinal);
    }

}