package org.imposto;

import org.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeImpostos {

//    public BigDecimal calcular(Orcamento orcamento, TipoImposto tipoImposto) {
    public BigDecimal calcular(Orcamento orcamento, Imposto imposto) {
        //return orcamento.getValor().multiply(new BigDecimal("0.1")); // 10%

//        switch (tipoImposto) {
//            case ICMS:
//                return orcamento.getValor().multiply(new BigDecimal("0.1"));
//            case ISS:
//                return orcamento.getValor().multiply(new BigDecimal("0.06"));
//            default:
//                return BigDecimal.ZERO;
//        }

        return imposto.calcular(orcamento);

    }

}
