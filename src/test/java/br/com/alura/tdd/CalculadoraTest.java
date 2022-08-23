package br.com.alura.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {

    @Test
    public void deveriaSomarDoisNumeroPositivos(){
        Calculadora calc = new Calculadora();
        int soma = calc.somar(3,7);

        assertEquals(10, soma);
    }
}
