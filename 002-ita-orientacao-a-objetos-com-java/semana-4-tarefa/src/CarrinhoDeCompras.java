import java.util.HashMap;

public class CarrinhoDeCompras {

    private HashMap<Produto, Integer> carrinho = new HashMap<>();

    public void adicionaProduto(Produto produto, int quantidade)
    {
        if (carrinho.containsKey(produto)) {
            int quantidadeExistente = carrinho.get(produto);
            carrinho.put(produto, quantidadeExistente + quantidade);
            return;
        }
        carrinho.put(produto, quantidade);
    }

    public void removeProduto(Produto produto)
    {
        carrinho.remove(produto);
    }

    public double valorTotal() {
        double valorTotal = 0;
        for (Produto produto : carrinho.keySet()) {
            int quantidade = carrinho.get(produto);
            valorTotal += produto.preco * quantidade;
        }
        return valorTotal;
    }
}
