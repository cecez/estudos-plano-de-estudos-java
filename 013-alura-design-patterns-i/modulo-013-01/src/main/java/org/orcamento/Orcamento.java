package org.orcamento;

import java.math.BigDecimal;

/**
 * Hello world!
 *
 */
public class Orcamento
{
    private BigDecimal valor;
    public int quantidadeDeItens;

    public Orcamento(BigDecimal valor, int quantidadeDeItens) {
        this.valor = valor;
        this.quantidadeDeItens = quantidadeDeItens;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public int getQuantidadeDeItens() {
        return quantidadeDeItens;
    }
}
