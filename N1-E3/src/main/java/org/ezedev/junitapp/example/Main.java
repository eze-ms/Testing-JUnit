package org.ezedev.junitapp.example;

public class Main {
    public static void main(String[] args) {
        testAccessInvalidIndex(10); // Índice fuera de rango
        testAccessInvalidIndex(-1); // Índice negativo
    }

    private static void testAccessInvalidIndex(int index) {
        try {
            OutBounds.accessInvalidIndex(index);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Excepció capturada: Índex " + index + " - " + e.getMessage());
        }
    }
}
