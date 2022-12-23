package org.example.service;

import org.example.modelo.Funcionario;
import org.example.modelo.Desempenho;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReajusteServiceTest {

    private ReajusteService rs;
    private Funcionario f;

    @BeforeEach
    void inicializa() {
        rs = new ReajusteService();
        f = new Funcionario("T1", LocalDate.now(), new BigDecimal("1000.00"));
    }

    @Test
    void reajusteDeveriaSerDe3PorCentoParaDesempenhoADesejar() {
        rs.concedeReajuste(f, Desempenho.A_DESEJAR);

        assertEquals(new BigDecimal("1030.00"), f.getSalario());
    }

    @Test
    void reajusteDeveriaSerDe10PorCentoParaDesempenhoBom() {
        rs.concedeReajuste(f, Desempenho.BOM);

        assertEquals(new BigDecimal("1100.00"), f.getSalario());
    }

    @Test
    void reajusteDeveriaSerDe20PorCentoParaDesempenhoOtimo() {
        rs.concedeReajuste(f, Desempenho.OTIMO);

        assertEquals(new BigDecimal("1200.00"), f.getSalario());
    }
}
