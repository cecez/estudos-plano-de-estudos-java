package org.desconto;

import org.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoParaMaisDeQuinhentosReais extends Desconto
{
    public DescontoParaMaisDeQuinhentosReais(Desconto proximo) {
        super(proximo);
    }

    @Override
    protected BigDecimal efetuarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.10"));
    }

    @Override
    protected boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getValor().compareTo(new BigDecimal("500")) > 0;
    }
}
