package org.ezedev.junitapp.example;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ObjectReferenceTest {

    @DisplayName("Test to verify that two references point to the same object")
    @Test
    void testReferencesAreSame() {
        String object1 = "Hello";
        String object2 = object1;

        assertThat(object1).isSameAs(object2);
    }

    @DisplayName("Test to verify that two references point to different objects")
    @Test
    void testReferencesAreDifferent() {
        String object1 = new String("Hello");
        String object2 = new String("Hello");

        assertThat(object1).isNotSameAs(object2);
    }
}
