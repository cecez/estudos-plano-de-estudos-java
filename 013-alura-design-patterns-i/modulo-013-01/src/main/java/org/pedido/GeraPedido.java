package org.pedido;

import org.orcamento.Orcamento;
import org.pedido.acao.EnviarEmail;
import org.pedido.acao.SalvaNoBD;

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

    public String getCliente() {
        return cliente;
    }

    public BigDecimal getValorOrcamento() {
        return valorOrcamento;
    }

    public int getQuantidadeDeItens() {
        return quantidadeDeItens;
    }
}
