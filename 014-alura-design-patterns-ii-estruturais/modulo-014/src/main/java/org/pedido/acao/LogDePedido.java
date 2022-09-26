package org.pedido.acao;

import org.pedido.Pedido;

public class LogDePedido implements AcaoAposGerarPedido {
    @Override
    public void executar(Pedido pedido) {
        System.out.println("Pedido gerado e logado.");
    }
}
