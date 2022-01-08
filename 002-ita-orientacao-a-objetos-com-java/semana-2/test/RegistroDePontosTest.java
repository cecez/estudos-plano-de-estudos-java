import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegistroDePontosTest {

    @Test
    public void pontosParaCriarTopicoComUsuarioNaoVip()
    {
        // arrange
        Usuario usuarioNaoVip = new Usuario();
        usuarioNaoVip.nome = "Cezar não vip";
        usuarioNaoVip.vip = false;
        usuarioNaoVip.pontos = 0;

        CalculadoraDeBonus calculadoraDeBonus = new CalculadoraDeBonus();
        RegistroDePontos registroDePontos = new RegistroDePontos(calculadoraDeBonus);

        // act
        registroDePontos.criarUmTopico(usuarioNaoVip);

        // assert
        assertEquals(5, usuarioNaoVip.pontos);
    }

    @Test
    public void pontosParaCriarTopicoComUsuarioVip()
    {
        // arrange
        Usuario usuarioNaoVip = new Usuario();
        usuarioNaoVip.nome = "Cezar vip";
        usuarioNaoVip.vip = true;
        usuarioNaoVip.pontos = 0;

        CalculadoraDeBonus calculadoraDeBonus = new CalculadoraDeBonus();
        RegistroDePontos registroDePontos = new RegistroDePontos(calculadoraDeBonus);

        // act
        registroDePontos.criarUmTopico(usuarioNaoVip);

        // assert
        assertEquals(5*5, usuarioNaoVip.pontos);
    }

}