import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AutoridadeTest {

    @Test
    void informal() {
        FormatadorNome informal = new Informal();
        Autoridade autoridade = new Autoridade("José", "Silva", informal);

        assertEquals("José", autoridade.getTratamento());
    }

    @Test
    void respeitoso() {
        FormatadorNome respeitoso = new Respeitoso(false);
        Autoridade autoridade = new Autoridade("Amanda", "Silva", respeitoso);

        assertEquals("Sra. Silva", autoridade.getTratamento());
    }

    @Test
    void comTitulo() {
        FormatadorNome comTitulo = new ComTítulo("Conde Barão");
        Autoridade autoridade = new Autoridade("Drácula", "Frankestein", comTitulo);

        assertEquals("Conde Barão Drácula Frankestein", autoridade.getTratamento());
    }

}