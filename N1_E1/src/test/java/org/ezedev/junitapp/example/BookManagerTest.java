package org.ezedev.junitapp.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class BookManagerTest {
    private BookManager bookManager;

    @BeforeEach
    void setUp() {
        bookManager = new BookManager(); // Arrange Global
    }

    // ============================
    //! BLOQUE 1: Verificaciones iniciales
    // ============================
    @Test
    void testBookListIsNotNullAfterCreation() {

        // Assert: Verificar que la lista no es nula
        assertNotNull(bookManager, "La lista de libros debería inicializarse como no nula.");
    }

    // ============================
    //! BLOQUE 2: Operaciones de añadir libros
    // ============================
    @Test
    void testBookListSizeAfterAddingBooks() {
        // Act: Añadir varios libros
        bookManager.addBook("El Quijote");
        bookManager.addBook("Cien Años de Soledad");
        bookManager.addBook("La Odisea");

        // Assert: Verificar el tamaño de la lista
        assertEquals(3, bookManager.getBooks().size(), "El tamaño de la lista debería ser 3 después de añadir tres libros.");
    }

    @Test
    void testAddBookUpdatesList() {
        // Act: Añadir un libro
        bookManager.addBook("El Quijote");

        // Assert: Verificar el tamaño de la lista y el contenido del primer libro
        assertAll(
                () -> assertEquals(1, bookManager.getBooks().size(),
                        "La lista debería contener un libro después de añadir uno."),
                () -> assertEquals("El Quijote", bookManager.getBooks().get(0).getName(),
                        "El primer libro debería ser 'El Quijote'.")
        );
    }


    // ============================
    //! BLOQUE 3: Operaciones de posiciones específicas
    // ============================
    @Test
    void testBookAtSpecificPosition() {
        // Act: Añadir libros y uno en una posición específica
        bookManager.addBook("El Quijote");
        bookManager.addBook("Cien Años de Soledad");
        bookManager.addBookAtPosition(new Book("La Odisea"), 1);

        // Assert: Verificar que "La Odisea" está en la posición 1
        Book bookAtPosition = bookManager.getBookAtPosition(1);
        assertEquals("La Odisea", bookAtPosition.getName(), "El libro en la posición 1 debería ser 'La Odisea'.");
    }

    @Test
    void testGetBookAtSpecificPosition() {
        bookManager.addBook("El Quijote");
        bookManager.addBook("Cien Años de Soledad");
        bookManager.addBook("La Odisea");

        assertAll(
                () -> assertEquals("Cien Años de Soledad", bookManager.getBookAtPosition(0).getName(),
                        "El título del libro en la posición 0 debería ser 'Cien Años de Soledad'."),
                () -> assertEquals("El Quijote", bookManager.getBookAtPosition(1).getName(),
                        "El título del libro en la posición 1 debería ser 'El Quijote'."),
                () -> assertEquals("La Odisea", bookManager.getBookAtPosition(2).getName(),
                        "El título del libro en la posición 2 debería ser 'La Odisea'.")
        );
    }

    // ============================
    //! BLOQUE 4: Verificación de duplicados
    // ============================
    @Test
    void testNoDuplicateBookTitles() {
        // Act: Añadir libros, incluyendo un duplicado
        bookManager.addBook("El Quijote");
        bookManager.addBook("Cien Años de Soledad");
        bookManager.addBook("El Quijote"); // Intento duplicado

        // Assert: Verificar que la lista contiene solo dos libros
        assertEquals(2, bookManager.getBooks().size(), "La lista debería contener solo dos libros, sin duplicados.");
    }

    // ============================
    //! BLOQUE 5: Operaciones de eliminar libros
    // ============================
    @Test
    void testListSizeAfterRemovingBook() {
        // Arrange: Añadir libros
        bookManager.addBook("El Quijote");
        bookManager.addBook("Cien Años de Soledad");

        // Act: Eliminar un libro
        bookManager.removeBookByTitle("El Quijote");

        // Assert: Verificar el tamaño de la lista y que el libro eliminado no esté
        assertAll(
                () -> assertEquals(1, bookManager.getBooks().size(),
                        "El tamaño de la lista debería ser 1 después de eliminar un libro."),
                () -> assertFalse(bookManager.getBooks().stream()
                                .anyMatch(book -> book.getName().equalsIgnoreCase("El Quijote")),
                        "El libro 'El Quijote' no debería estar en la lista.")
        );
    }

    // ============================
    //! BLOQUE 6: Verificación de orden
    // ============================
    @Test
    void testListRemainsAlphabeticallySorted() {
        // Act: Añadir libros y eliminar uno
        bookManager.addBook("Cien Años de Soledad");
        bookManager.addBook("El Quijote");
        bookManager.addBook("La Odisea");
        bookManager.addBook("Alicia en el País de las Maravillas");
        bookManager.removeBookByTitle("El Quijote");

        // Assert: Comparar con una lista ordenada manualmente
        List<Book> sortedBooks = new ArrayList<>(bookManager.getBooks());
        sortedBooks.sort(Comparator.comparing(Book::getName, String.CASE_INSENSITIVE_ORDER));

        assertEquals(sortedBooks, bookManager.getBooks(),
                "La lista debería estar ordenada alfabéticamente.");
    }
}
