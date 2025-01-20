package org.ezedev.junitapp.example;

public class OutBound {

    public void getOutBounds() {
        int[] array = {1, 2, 3};
        System.out.println("Attempting to access an invalid index...");
        int invalidAccess = array[5];
    }
}
