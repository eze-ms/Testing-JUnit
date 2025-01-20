package org.ezedev.junitapp.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OutBoundsTest {

    @Test
    void testAccessInvalidIndexThrowsException() {
        // Act & Assert: Verificar que se lanza la excepción con un índice fuera de rango
        ArrayIndexOutOfBoundsException exception = assertThrows(
                ArrayIndexOutOfBoundsException.class,
                () -> OutBounds.accessInvalidIndex(10), // Índice fuera de rango
                "Debería lanzar una ArrayIndexOutOfBoundsException para índices fuera de rango."
        );

        // Assert adicional: Verificar el mensaje de la excepción
        assertTrue(exception.getMessage().contains("Index 10"),
                "El mensaje de la excepción debería contener el índice inválido.");
    }

    @Test
    void testAccessNegativeIndexThrowsException() {
        // Act & Assert: Verificar que se lanza la excepción con un índice negativo
        ArrayIndexOutOfBoundsException exception = assertThrows(
                ArrayIndexOutOfBoundsException.class,
                () -> OutBounds.accessInvalidIndex(-1), // Índice negativo
                "Debería lanzar una ArrayIndexOutOfBoundsException para índices negativos."
        );

        // Assert adicional: Verificar el mensaje de la excepción
        assertTrue(exception.getMessage().contains("Index -1"),
                "El mensaje de la excepción debería contener el índice inválido.");
    }
}
