package org.imposto;

import org.orcamento.Orcamento;

import java.math.BigDecimal;

public class ICMSDecorador extends ImpostoDecorador {
    public ICMSDecorador(ImpostoDecorador outroImposto) {
        super(outroImposto);
    }

    @Override
    protected BigDecimal realizarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.4"));
    }
}
