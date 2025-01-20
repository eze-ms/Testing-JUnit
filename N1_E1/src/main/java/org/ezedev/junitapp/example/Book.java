package org.ezedev.junitapp.example;

import java.util.Objects;

public class Book {

    // ============================
    //! BLOQUE 1: Atributos
    // ============================
    private final int id; // Identificador único del libro
    private String name; // Nombre del libro
    private static int numberBook = 0; // Contador para generar IDs únicos

    // ============================
    //! BLOQUE 2: Constructor
    // ============================
    public Book(String name) {
        this.id = ++Book.numberBook; // Genera un ID único
        setName(name); // Valida y asigna el nombre
    }

    // ============================
    //! BLOQUE 3: Getters y Setters
    // ============================
    public int getId() {
        return id; // Devuelve el ID del libro
    }

    public String getName() {
        return name; // Devuelve el nombre del libro
    }

    public void setName(String name) {
        // Valida que el nombre no sea nulo o vacío
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Book name cannot be null or empty.");
        }
        this.name = name.trim(); // Asigna el nombre, eliminando espacios innecesarios
    }

    // ============================
    //! BLOQUE 4: Métodos sobrescritos
    // ============================
    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // Verifica si es el mismo objeto
        if (o == null || getClass() != o.getClass()) return false; // Verifica tipo
        Book book = (Book) o;
        return Objects.equals(name.toLowerCase(), book.name.toLowerCase()); // Compara nombres ignorando mayúsculas/minúsculas
    }

    @Override
    public int hashCode() {
        return Objects.hash(name.toLowerCase()); // Genera un hash basado en el nombre
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
