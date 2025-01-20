package org.ezedev.junitapp.example;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class IntegerAssertionTests {

    @DisplayName("Test to verify that two integers are equal")
    @Test
    void testIntegersAreEqual() {
        Integer number1 = 42;
        Integer number2 = 42;

        assertThat(number1).isEqualTo(number2);
    }

    @DisplayName("Test to verify that two integers are not equal")
    @Test
    void testIntegersAreNotEqual() {
        Integer number1 = 42;
        Integer number2 = 24;

        assertThat(number1).isNotEqualTo(number2);
    }
}
