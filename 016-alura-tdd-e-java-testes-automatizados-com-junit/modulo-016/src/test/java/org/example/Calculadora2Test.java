package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Calculadora2Test {

    @Test
    void somar() {
        assertEquals(10, Calculadora.somar(2, 8));
    }
}