package org.pedido;

import org.orcamento.Orcamento;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class GeraPedido {
    private String cliente;
    private BigDecimal valorOrcamento;
    private int quantidadeDeItens;

    public GeraPedido(String cliente, BigDecimal valorOrcamento, int quantidadeDeItens) {
        this.cliente = cliente;
        this.valorOrcamento = valorOrcamento;
        this.quantidadeDeItens = quantidadeDeItens;
    }

    public void executa() {
        Orcamento orcamento = new Orcamento(valorOrcamento, quantidadeDeItens);
        Pedido pedido = new Pedido(cliente, LocalDateTime.now(), orcamento);

        // salva no bd
        // envia notificacao
    }
}
