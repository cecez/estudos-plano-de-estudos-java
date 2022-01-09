package Tarefa;

import java.util.ArrayList;

public class CarrinhoDeCompras
{
    private final ArrayList<Pizza> pizzas = new ArrayList<>();

    public void adiciona(Pizza pizza)
    {
        if (pizza.temIngredientes()) {
            pizzas.add(pizza);
        }
    }

    public int valorTotal()
    {
        int valorTotal = 0;

        for (Pizza pizza : pizzas) {
            valorTotal += pizza.getPreco();
        }

        return valorTotal;
    }
}
