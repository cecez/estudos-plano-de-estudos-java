import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PilhaTest {

    @Test
    void empilhamento()
    {
        Pilha pilha = new Pilha(10);
        pilha.empilhar("Eins");
        pilha.empilhar("Zwei");
        pilha.empilhar("Drei");

        assertEquals(3, pilha.tamanho());
        assertEquals("Drei", pilha.topo());
    }

    @Test
    void desempilhamento()
    {
        Pilha pilha = new Pilha(5);
        pilha.empilhar("Zehn");
        pilha.empilhar("Neun");
        pilha.empilhar("Acht");

        Object topo = pilha.desempilhar();
        Object topoMenosUm = pilha.desempilhar();

        assertEquals(1, pilha.tamanho());
        assertEquals("Acht", topo);
        assertEquals("Neun", topoMenosUm);
    }

}