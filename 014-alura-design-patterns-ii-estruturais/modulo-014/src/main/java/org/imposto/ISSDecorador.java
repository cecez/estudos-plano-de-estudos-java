package org.imposto;

import org.orcamento.Orcamento;

import java.math.BigDecimal;

public class ISSDecorador extends ImpostoDecorador {
    public ISSDecorador(ImpostoDecorador outroImposto) {
        super(outroImposto);
    }

    @Override
    protected BigDecimal realizarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.2"));
    }
}
