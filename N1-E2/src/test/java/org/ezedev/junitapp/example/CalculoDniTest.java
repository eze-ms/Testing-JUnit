package org.ezedev.junitapp.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CalculateDniTest {

    @DisplayName("Cálculo de la letra del DNI")
    @ParameterizedTest
    @CsvSource({ // Arrange
            "00000000, T",
            "11111111, H",
            "22222222, J",
            "33333333, P",
            "44444444, A",
            "55555555, K",
            "66666666, Q",
            "77777777, B",
            "88888888, Y",
            "99999999, R"
    })
    void testCalculateDniLetter(int num, char expectedLetter) {
        // Act: Calcular la letra del DNI
        char actualLetter = CalculateDni.getLetterDni(num);

        // Assert: Comparar con la letra esperada
        Assertions.assertEquals(expectedLetter, actualLetter,
                "La letra calculada para el DNI " + num + " debería ser '" + expectedLetter + "'.");
    }
}
