package org.ezedev.junitapp.example;

public class OutBounds {
    public static void accessInvalidIndex(int index) {
        int[] array = {1, 2, 3, 4, 5}; // Array de 5 elements
        System.out.println("Intentant accedir a l'índex: " + index);
        System.out.println("Valor: " + array[index]); // Això llença l'excepció si l'índex no és vàlid
    }
}
