package org.ezedev.junitapp.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class OutBoundTest {

    @DisplayName("Validate Exception")
    @Test
    public void testException() {
        OutBound out = new OutBound();

        assertThrows(IndexOutOfBoundsException.class, out::getOutBounds);
        System.out.println("Running test to validate ArrayIndexOutOfBoundsException...");
    }
}
