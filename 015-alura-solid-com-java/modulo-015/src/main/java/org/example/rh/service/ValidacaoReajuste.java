package org.example.rh.service;

import org.example.rh.model.Funcionario;

import java.math.BigDecimal;

public interface ValidacaoReajuste {
    void valida(Funcionario funcionario, BigDecimal aumento);
}
