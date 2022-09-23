package org.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.imposto.CalculadoraDecoradoraDeImpostos;
import org.imposto.ICMSDecorador;
import org.imposto.ISSDecorador;
import org.imposto.ImpostoDecorador;
import org.loja.JavaHttpAdapter;
import org.orcamento.ItemOrcamento;
import org.orcamento.Orcamento;
import org.orcamento.RegistroDeOrcamento;

import java.math.BigDecimal;

public class CompositeTest extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public CompositeTest(String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( CompositeTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        Orcamento orcamentoAntigo = new Orcamento();
        orcamentoAntigo.adicionaItem(new ItemOrcamento(new BigDecimal("200")));
        orcamentoAntigo.reprovar();

        Orcamento orcamentoNovo = new Orcamento();
        orcamentoNovo.adicionaItem(new ItemOrcamento(new BigDecimal("300")));
        orcamentoNovo.adicionaItem(orcamentoAntigo);

        assertEquals(new BigDecimal("500"), orcamentoNovo.getValor());
    }

}
