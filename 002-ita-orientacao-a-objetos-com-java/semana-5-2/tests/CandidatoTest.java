import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CandidatoTest {

    @Test
    void ordenacaoNotaDiferente() {
        List<Candidato> lista = new ArrayList<>();

        Candidato c1 = new Candidato(9, false, 30);
        Candidato c2 = new Candidato(10, false, 30);

        lista.add(c1);
        lista.add(c2);

        Collections.sort(lista);

        assertEquals(c1, lista.get(0));
        assertEquals(c2, lista.get(1));
    }

    @Test
    void ordenacaoNotaIgualPcdDiferente() {
        List<Candidato> lista = new ArrayList<>();

        Candidato c1 = new Candidato(10, false, 30);
        Candidato c2 = new Candidato(10, true, 22);

        lista.add(c1);
        lista.add(c2);

        Collections.sort(lista);

        assertEquals(c1, lista.get(0));
        assertEquals(c2, lista.get(1));
    }

    @Test
    void ordenacaoNotaPcdIguaisIdadeDiferente() {
        List<Candidato> lista = new ArrayList<>();

        Candidato c1 = new Candidato(10, true, 30);
        Candidato c2 = new Candidato(10, true, 22);

        lista.add(c1);
        lista.add(c2);

        Collections.sort(lista);

        assertEquals(c2, lista.get(0));
        assertEquals(c1, lista.get(1));
    }

}