package Tarefa;

public class Principal
{
    public static void main(String[] args)
    {
        // Cria 3 pizzas com ingredientes diferentes
        Pizza pizza1 = new Pizza();
        pizza1.adicionaIngrediente("Vegetariana");
        pizza1.adicionaIngrediente("Calabresa");

        Pizza pizza2 = new Pizza();
        pizza2.adicionaIngrediente("Calabresa");
        pizza2.adicionaIngrediente("Vegetariana");
        pizza2.adicionaIngrediente("Portuguesa");
        pizza2.adicionaIngrediente("Pesto");
        pizza2.adicionaIngrediente("Alho e óleo");
        pizza2.adicionaIngrediente("Chocolate");

        Pizza pizza3 = new Pizza();
        pizza3.adicionaIngrediente("Cinco queijos");
        pizza3.adicionaIngrediente("Vegetariana");
        pizza3.adicionaIngrediente("Milho e bacon");

        // Adiciona essas pizzas em um carrinho de compra
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        carrinhoDeCompras.adiciona(pizza1);
        carrinhoDeCompras.adiciona(pizza2);
        carrinhoDeCompras.adiciona(pizza3);


        // Imprime o total do carrinho de compra
        System.out.println("--- Valor total do carrinho: R$ " + carrinhoDeCompras.valorTotal() + " ---\n");


        // Imprime a quantidade utilizada de cada ingrediente
        System.out.println("--- Ingrediente (quantidade utilizada): ---\n");

        for (String i : Pizza.totalDeIngredientes.keySet()) {
            System.out.println(i + " (" + Pizza.totalDeIngredientes.get(i) + ")");
        }
    }
}
