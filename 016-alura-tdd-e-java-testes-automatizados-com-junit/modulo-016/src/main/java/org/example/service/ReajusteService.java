package org.example.service;

import org.example.modelo.Desempenho;
import org.example.modelo.Funcionario;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ReajusteService {

    public void concedeReajuste(Funcionario f, Desempenho aDesejar) {
        BigDecimal valorReajuste = f.getSalario();
        BigDecimal percentualReajuste = aDesejar.percentualReajuste();

        valorReajuste = valorReajuste.multiply(percentualReajuste);

        f.reajustaSalario(valorReajuste);
    }
}
