package org.ezedev.junitapp.example;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


public class ListAssertionsTest {

    @DisplayName("Verify the order of objects in the ArrayList")
    @Test
    void testOrderOfObjects() {
        List<Object> objectList = new ArrayList<>();
        objectList.add("Hello");
        objectList.add(123);
        objectList.add(true);

        assertThat(objectList).containsExactly("Hello", 123, true);
        System.out.println("Test passed: Objects are in the correct order.");
    }

    @DisplayName("Verify the objects are present in any order")
    @Test
    void testObjectsInAnyOrder() {
        List<Object> objectList = new ArrayList<>();
        objectList.add("Hello");
        objectList.add(123);
        objectList.add(true);

        assertThat(objectList).contains("Hello", 123, true);
        System.out.println("Test passed: Objects are present in any order.");
    }

    @DisplayName("Verify an object is added only once")
    @Test
    void testObjectAddedOnlyOnce() {
        List<Object> objectList = new ArrayList<>();
        objectList.add("Hello");
        objectList.add(123);
        objectList.add(true);

        assertThat(objectList).containsOnlyOnce("Hello");
        System.out.println("Test passed: Object is added only once.");
    }

    @DisplayName("Verify a specific object is not in the list")
    @Test
    void testObjectNotInList() {
        List<Object> objectList = new ArrayList<>();
        objectList.add("Hello");
        objectList.add(123);
        objectList.add(true);

        assertThat(objectList).doesNotContain("Goodbye");
        System.out.println("Test passed: Specific object is not in the list.");
    }

}
