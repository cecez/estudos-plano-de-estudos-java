package org.example;

import junit.framework.AssertionFailedError;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.example.rh.ValidacaoException;
import org.example.rh.model.Cargo;
import org.example.rh.model.Funcionario;
import org.example.rh.service.ReajusteSalarialService;
import org.example.rh.service.ValidacaoPercentualReajuste;
import org.example.rh.service.ValidacaoPeriodoReajuste;
import org.example.rh.service.ValidacaoReajuste;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    public void testValidacoesOk() {
        List<ValidacaoReajuste> v = new ArrayList<>();
        v.add(new ValidacaoPeriodoReajuste());
        v.add(new ValidacaoPercentualReajuste());
        ReajusteSalarialService rss = new ReajusteSalarialService(v);
        Funcionario f = new Funcionario("Teste", "11111111111", Cargo.ANALISTA, BigDecimal.valueOf(1000));
        f.setDataUltimoReajuste(LocalDate.now().minusMonths(10));
        BigDecimal a = BigDecimal.TEN;

        try {
            rss.executa(f, a);
            fail("Sem exceção.");
        } catch (AssertionFailedError e) {
            assertEquals("Sem exceção.", e.getMessage());
        }
    }

    public void testValidacaoPeriodoReajusteFalhando() {
        List<ValidacaoReajuste> v = new ArrayList<>();
        v.add(new ValidacaoPeriodoReajuste());
        v.add(new ValidacaoPercentualReajuste());
        ReajusteSalarialService rss = new ReajusteSalarialService(v);
        Funcionario f = new Funcionario("Teste", "11111111111", Cargo.ANALISTA, BigDecimal.valueOf(1000));
        f.setDataUltimoReajuste(LocalDate.now().minusMonths(4));
        BigDecimal a = BigDecimal.TEN;

        try {
            rss.executa(f, a);
            fail("Sem exceção.");
        } catch (ValidacaoException e) {
            assertEquals("Reajuste somente após 6 meses desde último reajuste.", e.getMessage());
        }
    }

    public void testValidacaoPercentualReajusteFalhando() {
        List<ValidacaoReajuste> v = new ArrayList<>();
        v.add(new ValidacaoPeriodoReajuste());
        v.add(new ValidacaoPercentualReajuste());
        ReajusteSalarialService rss = new ReajusteSalarialService(v);
        Funcionario f = new Funcionario("Teste", "11111111111", Cargo.ANALISTA, BigDecimal.valueOf(1000));
        f.setDataUltimoReajuste(LocalDate.now().minusMonths(10));
        BigDecimal a = BigDecimal.valueOf(1000);

        try {
            rss.executa(f, a);
            fail("Sem exceção.");
        } catch (ValidacaoException e) {
            assertEquals("Reajuste nao pode ser superior a 40% do salario.", e.getMessage());
        }
    }
}
