package Tarefa;

import java.util.HashMap;

public class Pizza
{
    private int ingredientes = 0;
    public static HashMap<String, Integer> totalDeIngredientes = new HashMap<>();

    public static void contabilizaIngrediente(String ingrediente)
    {
        totalDeIngredientes.merge(ingrediente, 1, Integer::sum);
    }

    public static void reiniciaIngredientes()
    {
        totalDeIngredientes = new HashMap<>();
    }

    public void adicionaIngrediente(String ingrediente)
    {
        ingredientes++;
        contabilizaIngrediente(ingrediente);
    }

    public int getIngredientes()
    {
        return this.ingredientes;
    }

    public int getPreco()
    {
        if (ingredientes <= 2) {
            return 15;
        } else if (ingredientes <= 5) {
            return 20;
        } else {
            return 23;
        }
    }

    public boolean temIngredientes() {
        return ingredientes > 0;
    }
}
