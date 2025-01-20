package org.ezedev.junitapp.example;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class EmptyOptionalTest {

    @DisplayName("Empty Optional Test")
    @Test
    public void emptyTest() {
        EmptyOptional emptyOptional = new EmptyOptional();

        Assertions.assertThat(emptyOptional.getEmptyOptional()).isEmpty();
        System.out.println("Test passed: The Optional is empty.");
    }
}