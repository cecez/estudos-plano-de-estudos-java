package org.example.rh.service;

import org.example.rh.model.Funcionario;

import java.math.BigDecimal;
import java.util.List;

public class ReajusteSalarialService {

    private final List<ValidacaoReajuste> validacoes;

    public ReajusteSalarialService(List<ValidacaoReajuste> validacoes) {
        this.validacoes = validacoes;
    }

    public void executa(Funcionario funcionario, BigDecimal aumento) {
        this.validacoes.forEach(v -> v.valida(funcionario, aumento));

        BigDecimal salarioAtual = funcionario.getSalario();
        BigDecimal novoSalario = salarioAtual.add(aumento);
        funcionario.atualizaSalario(novoSalario);
    }
}
