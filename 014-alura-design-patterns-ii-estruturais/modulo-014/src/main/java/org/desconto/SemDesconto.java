package org.desconto;

import org.orcamento.Orcamento;

import java.math.BigDecimal;

public class SemDesconto extends Desconto
{
    public SemDesconto() {
        super(null);
    }

    @Override
    protected BigDecimal efetuarCalculo(Orcamento orcamento) {
        return BigDecimal.ZERO;
    }

    @Override
    protected boolean deveAplicar(Orcamento orcamento) {
        return true;
    }
}
