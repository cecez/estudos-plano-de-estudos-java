package org.imposto;

import org.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDecoradoraDeImpostos {
    public BigDecimal calcular(Orcamento orcamento, ImpostoDecorador imposto) {
        return imposto.calcular(orcamento);
    }
}
