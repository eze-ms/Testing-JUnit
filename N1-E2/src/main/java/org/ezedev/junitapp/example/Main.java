package org.ezedev.junitapp.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Introduce el número del DNI (sin letra):");

            try {
                int dniNumber = Integer.parseInt(scanner.nextLine());

                // Validación del rango
                if (dniNumber < 0 || dniNumber > 99999999) {
                    System.out.println("El número del DNI debe estar entre 0 y 99,999,999.");
                    return;
                }

                // Cálculo de la letra
                char dniLetter = CalculateDni.getLetterDni(dniNumber);
                System.out.println("El DNI completo es: " + dniNumber + dniLetter);
            } catch (NumberFormatException e) {
                System.out.println("Por favor, introduce un número válido.");
            }
        }
    }
}
