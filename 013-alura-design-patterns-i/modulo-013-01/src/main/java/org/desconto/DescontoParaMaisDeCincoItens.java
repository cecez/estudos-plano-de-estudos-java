package org.desconto;

import org.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoParaMaisDeCincoItens extends Desconto
{
    public DescontoParaMaisDeCincoItens(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal calcular(Orcamento orcamento) {
        if (orcamento.getQuantidadeDeItens() >= 5) {
            return orcamento.getValor().multiply(new BigDecimal("0.10"));
        }

        return proximo.calcular(orcamento);
    }
}
