package org.pedido.acao;

import org.pedido.Pedido;

public class EnviarEmail implements AcaoAposGerarPedido {
    public void executar(Pedido pedido) {
        System.out.println("Enviando e-mail para pedido.");
    }
}
