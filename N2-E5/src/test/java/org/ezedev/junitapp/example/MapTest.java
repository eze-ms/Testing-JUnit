package org.ezedev.junitapp.example;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class MapTest {

    private HashMap<Integer, String> map;

    @DisplayName("Initialization")
    @BeforeEach
    public void init() {
        map = new HashMap<>();
        map.put(1,"One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");
    }

    @DisplayName("Contains Key")
    @Test
    public void testContainsKey() {
        Assertions.assertThat(map).containsKeys(3);
        System.out.println("Test passed: Map contains the key 3.");
    }

}
