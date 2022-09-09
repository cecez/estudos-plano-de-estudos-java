package org.pedido.acao;

import org.pedido.Pedido;

public class SalvaNoBD implements AcaoAposGerarPedido {
    public void executar(Pedido pedido) {
        System.out.println("Salvando pedido no BD.");
    }
}
