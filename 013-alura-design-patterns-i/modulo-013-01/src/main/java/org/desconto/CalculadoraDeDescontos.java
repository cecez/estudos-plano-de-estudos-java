package org.desconto;

import org.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDescontos {
    public BigDecimal calcular(Orcamento orcamento)
    {
        return new DescontoParaMaisDeCincoItens(
                new DescontoParaMaisDeQuinhentosReais(
                        new SemDesconto()
                )
        ).calcular(orcamento);

    }
}
