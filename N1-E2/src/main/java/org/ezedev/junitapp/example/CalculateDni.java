package org.ezedev.junitapp.example;

public class CalculateDni {

    public static char getLetterDni(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("El número del DNI no puede ser negativo.");
        }

        String letters = "TRWAGMYFPDXBNJZSQVHLCKE";
        return letters.charAt(num % 23);
    }
}
