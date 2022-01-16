package Tarefa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 [x] Faça os testes de unidade da classe Pizza e verifique se o valor da Pizza está correto de acordo com a quantidade de ingredientes.
 [x] Verifique também se o registro de ingredientes funcionou corretamente. Crie um método estático na classe Pizza que zera o registro de ingredientes e
 [x] invoque ele em um método de inicialização ou finalização na classe de testes. Um método de teste deve ser independente do que aconteceu em outros métodos de teste!

 [x] Procure criar os testes de forma que cada método de testes verifique um cenário e uma funcionalidade. Evite por exemplo, em um mesmo teste, verificar o preço da pizza e o registro de ingredientes ao mesmo tempo.
 */

class PizzaTest {

    @BeforeEach
    public void reiniciaIngredientes()
    {
        Pizza.reiniciaIngredientes();
    }

    @Test
    public void registroDeIngredientes()
    {
        // arrange
        // pizza com 0, 1, 2, 3, 4, 5, 6, 10 ingredientes
        Pizza pizza0 = criaPizza(0);
        Pizza pizza1 = criaPizza(1);
        Pizza pizza2 = criaPizza(2);
        Pizza pizza3 = criaPizza(3);
        Pizza pizza4 = criaPizza(4);
        Pizza pizza5 = criaPizza(5);
        Pizza pizza6 = criaPizza(6);
        Pizza pizza10 = criaPizza(10);

        // act e assert
        assertEquals(0, pizza0.getIngredientes());
        assertFalse(pizza0.temIngredientes());
        assertEquals(1, pizza1.getIngredientes());
        assertTrue(pizza1.temIngredientes());
        assertEquals(2, pizza2.getIngredientes());
        assertEquals(3, pizza3.getIngredientes());
        assertEquals(4, pizza4.getIngredientes());
        assertEquals(5, pizza5.getIngredientes());
        assertEquals(6, pizza6.getIngredientes());
        assertEquals(10, pizza10.getIngredientes());
        assertTrue(pizza10.temIngredientes());
    }

    @Test
    public void preco()
    {
        // arrange
        // pizza com 1, 2, 3, 4, 5, 6, 10 ingredientes
        Pizza pizza1 = criaPizza(1);
        Pizza pizza2 = criaPizza(2);
        Pizza pizza3 = criaPizza(3);
        Pizza pizza4 = criaPizza(4);
        Pizza pizza5 = criaPizza(5);
        Pizza pizza6 = criaPizza(6);
        Pizza pizza10 = criaPizza(10);

        // act e assert
        assertEquals(15, pizza1.getPreco());
        assertEquals(15, pizza2.getPreco());
        assertEquals(20, pizza3.getPreco());
        assertEquals(20, pizza4.getPreco());
        assertEquals(20, pizza5.getPreco());
        assertEquals(23, pizza6.getPreco());
        assertEquals(23, pizza10.getPreco());
    }

    public static Pizza criaPizza(int quantidadeDeIngredientes)
    {
        Pizza pizza = new Pizza();

        for (int i = 1; i <= quantidadeDeIngredientes; i++) {
            pizza.adicionaIngrediente("Ingrediente " + i);
        }

        return pizza;
    }

}