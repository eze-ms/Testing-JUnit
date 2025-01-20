package org.ezedev.junitapp.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BookManager {

    // Colección para almacenar los libros
    private final List<Book> books = new ArrayList<>();

    // ======================
    //! BLOQUE 1: Añadir libros
    // ======================

    // Añadir un libro al final de la colección
    public void addBook(String name) {
        Book newBook = new Book(name);
        if (!books.contains(newBook)) {
            books.add(newBook);
            books.sort(Comparator.comparing(Book::getName, String.CASE_INSENSITIVE_ORDER)); // Ordenar automáticamente
            System.out.println("Libro añadido: " + name);
        } else {
            System.out.println("El libro '" + name + "' ya existe en la colección.");
        }
    }

    // Añadir un libro en una posición específica
    public void addBookAtPosition(Book book, int position) {
        if (position >= 0 && position <= books.size()) { // Validar posición válida
            books.add(position, book); // Añadir el libro en la posición
            System.out.println("Libro añadido: " + book.getName() + " en la posición " + position);
        } else {
            System.out.println("Posición inválida: " + position);
        }
    }

    // =============================
    //! BLOQUE 2: Obtener libros
    // =============================

    // Obtener un libro por su posición
    public Book getBookAtPosition(int position) {
        if (position >= 0 && position < books.size()) {
            return books.get(position); // Devuelve el libro en la posición
        } else {
            throw new IndexOutOfBoundsException("Posición inválida: " + position);
        }
    }

    // Mostrar un libro por su posición
    public void displayBookAtPosition(int position) {
        try {
            Book book = books.get(position);
            System.out.println("Libro en la posición " + position + ": " + book.getName());
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Posición " + position + " inválida.");
        }
    }

    // Obtener todos los libros
    public List<Book> getBooks() {
        return new ArrayList<>(books); // Devuelve una copia para proteger la lista original
    }

    // =============================
    //! BLOQUE 3: Eliminar libros
    // =============================

    // Eliminar un libro por título
    public void removeBookByTitle(String title) {
        boolean removed = books.removeIf(book -> book.getName().equalsIgnoreCase(title));
        if (removed) {
            books.sort(Comparator.comparing(Book::getName, String.CASE_INSENSITIVE_ORDER)); // Ordenar automáticamente
            System.out.println("El libro '" + title + "' fue eliminado.");
        } else {
            System.out.println("El libro '" + title + "' no se encontró en la colección.");
        }
    }

    // =============================
    //! BLOQUE 4: Mostrar colección
    // =============================

    // Mostrar todos los libros
    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("La colección de libros está vacía.");
        } else {
            System.out.println("Libros en la colección:");
            books.forEach(book -> System.out.println("- " + book.getName()));
        }
    }
}
