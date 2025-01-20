package org.ezedev.junitapp.example;

public class Main {
    public static void main(String[] args) {
        BookManager bookManager = new BookManager();

        // ============================
        //! BLOQUE 1: Añadir libros
        // ============================
        bookManager.addBook("El Quijote");
        bookManager.addBook("Cien Años de Soledad");
        bookManager.addBook("El Quijote"); // Intento duplicado

        // ============================
        //! BLOQUE 2: Mostrar libros
        // ============================
        bookManager.displayBooks();

        // ============================
        //! BLOQUE 3: Obtener libro por posición
        // ============================
        bookManager.displayBookAtPosition(1);

        // ============================
        //! BLOQUE 4: Añadir en posición específica
        // ============================
        bookManager.addBookAtPosition(new Book("La Odisea"), 1);

        // ============================
        //! BLOQUE 5: Eliminar libro por título
        // ============================
        bookManager.removeBookByTitle("El Quijote");

        // ============================
        //! BLOQUE 6: Mostrar libros finales
        // ============================
        bookManager.displayBooks();
    }
}
