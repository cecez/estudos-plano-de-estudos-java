# Testes de Unidade

**Teste de regressão:** além de executar testes no código que está sendo feito, testes são executados nos demais locais da aplicação. (é a reexecução de algum subconjunto de testes que já foram conduzidos para garantir que as modificações não propagaram efeitos colaterais indesejáveis. "por Pressman")

**Teste de unidade: ** testa uma única classe ou método.

**Teste de integração: ** testa a colaboração de um grupo de classes.

**Teste funcional: ** testa o software como um todo de acordo com os requisitos.

```java
// necessário importar as anotações e classes JUnit
import org.junit.Test;
import static org.junit.Assert.*;

// necessário incluir @Test acima do método de teste
public class TestCalculadora
{
    @Test
    public void testSoma() { 
        // soma
    }
    
    @BeforeEach // (antes era Before)
    public void antesDeCadaMetodoDeTeste() {}
    
    @AfterEach // (antes era After)
    public void depoisDeCadaMetodoDeTeste() {}
    
    @BeforeAll // precisa ser estático (antes era BeforeClass)
    public static void antesDoPrimeiroTesteDaClasse() {}
    
    @AfterAll // precisa ser estático (antes era AfterClass)
    public static void depoisDoUltimoTesteDaClasse() {}
}

```