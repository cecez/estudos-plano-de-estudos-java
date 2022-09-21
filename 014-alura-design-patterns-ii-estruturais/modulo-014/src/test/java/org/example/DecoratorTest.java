package org.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.imposto.CalculadoraDecoradoraDeImpostos;
import org.imposto.ICMSDecorador;
import org.imposto.ISSDecorador;
import org.imposto.ImpostoDecorador;
import org.loja.JavaHttpAdapter;
import org.orcamento.Orcamento;
import org.orcamento.RegistroDeOrcamento;

import java.math.BigDecimal;

public class DecoratorTest extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public DecoratorTest(String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( DecoratorTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        Orcamento orcamento = new Orcamento(BigDecimal.TEN, 1);
        orcamento.aprovar();
        orcamento.finalizar();

        CalculadoraDecoradoraDeImpostos calculadoraDecoradoraDeImpostos = new CalculadoraDecoradoraDeImpostos();
        BigDecimal resultado = calculadoraDecoradoraDeImpostos.calcular(
                orcamento,
                new ICMSDecorador(new ISSDecorador(null))
        );

        BigDecimal resultado2 = calculadoraDecoradoraDeImpostos.calcular(
                orcamento,
                new ISSDecorador(new ICMSDecorador(null))
        );

        assertEquals(new BigDecimal("6.0"), resultado);
        assertEquals(new BigDecimal("6.0"), resultado2);
    }

}
