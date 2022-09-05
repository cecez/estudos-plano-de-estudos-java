package org.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.imposto.CalculadoraDeImpostos;
import org.imposto.ICMS;
import org.imposto.TipoImposto;
import org.orcamento.Orcamento;

import java.math.BigDecimal;

/**
 * Unit test for simple App.
 */
public class OrcamentoTest
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public OrcamentoTest(String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( OrcamentoTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        Orcamento orcamento = new Orcamento(new BigDecimal("20"));
        CalculadoraDeImpostos calculadoraDeImpostos = new CalculadoraDeImpostos();

//        System.out.println(calculadoraDeImpostos.calcular(orcamento, TipoImposto.ICMS));
        System.out.println(calculadoraDeImpostos.calcular(orcamento, new ICMS()));
    }
}
