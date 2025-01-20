package org.ezedev.junitapp.example;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ArrayTest {

    @DisplayName("Test to check if two arrays are identical")
    @Test
    public void testArraysAreIdentical() {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5};

        assertArrayEquals(array1, array2, "Los arrays no son idénticos");
        System.out.println("Los arrays son idénticos");
    }
}
