package org.ezedev.junitapp.example;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void testNoDuplicateBookTitles() {
        // Arrange: Crear un BookManager y añadir libros
        BookManager bookManager = new BookManager();
        bookManager.addBook("Book 1");
        bookManager.addBook("Book 2");
        bookManager.addBook("Book 3");
        bookManager.addBook("Book 2");

        // Act: Obtener la lista de libros
        List<Book> books = bookManager.getBooks();

        // Assert: Verificar que no hay duplicados
        Set<Book> uniqueBooks = new HashSet<>(books);
        assertEquals(uniqueBooks.size(), books.size(),
                "La lista debería contener únicamente libros únicos, sin duplicados.");
    }
}
