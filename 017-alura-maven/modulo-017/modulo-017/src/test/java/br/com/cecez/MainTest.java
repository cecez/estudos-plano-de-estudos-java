package br.com.cecez;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class MainTest {
    @Test
    public void semNome() {
        String[] args = {};
        Main.main(args);
        assertEquals(2, 2);
    }
}
