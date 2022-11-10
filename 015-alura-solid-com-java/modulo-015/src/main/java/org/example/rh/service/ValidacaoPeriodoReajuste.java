package org.example.rh.service;

import org.example.rh.ValidacaoException;
import org.example.rh.model.Funcionario;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ValidacaoPeriodoReajuste implements ValidacaoReajuste {
    @Override
    public void valida(Funcionario funcionario, BigDecimal aumento) {
        LocalDate dataUltimoReajuste = funcionario.getDataUltimoReajuste();
        LocalDate agora = LocalDate.now();
        long mesesDesdeUltimoReajuste = ChronoUnit.MONTHS.between(dataUltimoReajuste, agora);
        if (mesesDesdeUltimoReajuste < 6) {
            throw new ValidacaoException("Reajuste somente após 6 meses desde último reajuste.");
        }
    }
}
