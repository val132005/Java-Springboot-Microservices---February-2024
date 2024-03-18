package org.example.topic0IntroductionToJavaAndOOP;

import java.util.Arrays;

public class Ex14 {
    public static void main(String[] args) {
        int[] array1 = {50, -20, 0};
        int[] array2 = {5, -50, 10};

        if (array1.length == 3 && array2.length == 3) {
            int[] newArray = {array1[0], array2[2]};

            System.out.println("Array1: " + Arrays.toString(array1));
            System.out.println("Array2: " + Arrays.toString(array2));
            System.out.println("New Array: " + Arrays.toString(newArray));
        } else {
            System.out.println("Both arrays must have a length of 3.");
        }
    }
}
