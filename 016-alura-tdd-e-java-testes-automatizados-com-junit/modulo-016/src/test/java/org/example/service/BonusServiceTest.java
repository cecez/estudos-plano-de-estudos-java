package org.example.service;

import org.example.modelo.Funcionario;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @Test
    void cenariosParaBonusZero() {
        List<Funcionario> funcionarioList = new ArrayList<>();
        funcionarioList.add(new Funcionario("Teste 1", LocalDate.now(), new BigDecimal("20000")));
        funcionarioList.add(new Funcionario("Teste 2", LocalDate.now(), new BigDecimal("10001")));
        funcionarioList.add(new Funcionario("Teste 3", LocalDate.now(), new BigDecimal("30000")));

        BonusService bonusService = new BonusService();
        funcionarioList.forEach((funcionario -> assertEquals(new BigDecimal("0.00"), bonusService.calcularBonus(funcionario))));
    }

    @Test
    void cenariosParaBonusDiferenteDeZero() {
        List<Funcionario> funcionarioList = new ArrayList<>();
        funcionarioList.add(new Funcionario("Teste 1", LocalDate.now(), new BigDecimal("10000")));
        funcionarioList.add(new Funcionario("Teste 2", LocalDate.now(), new BigDecimal("2001")));
        funcionarioList.add(new Funcionario("Teste 3", LocalDate.now(), new BigDecimal("100")));

        BonusService bonusService = new BonusService();
        funcionarioList.forEach((funcionario -> assertTrue(bonusService.calcularBonus(funcionario).compareTo(BigDecimal.ZERO) > 0)));
    }
}