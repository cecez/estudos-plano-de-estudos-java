package org.desconto;

import org.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoParaMaisDeQuinhentosReais extends Desconto
{
    public DescontoParaMaisDeQuinhentosReais(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal calcular(Orcamento orcamento) {
        if (orcamento.getValor().compareTo(new BigDecimal("500")) > 0) {
            return orcamento.getValor().multiply(new BigDecimal("0.10"));
        }

        return proximo.calcular(orcamento);
    }
}
