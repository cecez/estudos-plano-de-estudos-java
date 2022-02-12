import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AutenticadorTest {

    @Test
    void autenticacaoComSucesso() throws LoginException {

        Autenticador a = new Autenticador();

        Usuario u = a.autentica("admin", "admin");

        assertEquals("admin", u.getLogin());
    }

    @Test
    void autenticacaoComFalha() throws LoginException {

        Autenticador a = new Autenticador();

        LoginException loginException = assertThrows(LoginException.class, () -> {
            a.autentica("asd", "asd");
        });
    }

    @Test
    void verificaInformacaoDaAutenticacaoComFalha() {
        Autenticador a = new Autenticador();

        try {
            a.autentica("asd", "asd");
            fail();
        } catch (LoginException e) {
            assertEquals("asd", e.getLogin());
            assertEquals("deu ruim no login", e.getMessage());
        }
    }
}