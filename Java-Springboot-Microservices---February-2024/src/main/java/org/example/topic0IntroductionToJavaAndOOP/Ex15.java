package org.example.topic0IntroductionToJavaAndOOP;

import java.util.Arrays;

public class Ex15 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {2, 5, 7, 8};
        int[] result = mergeArrays(array1, array2);

        System.out.println("Array1: " + Arrays.toString(array1));
        System.out.println("Array2: " + Arrays.toString(array2));
        System.out.println("Result: " + Arrays.toString(result));
    }

    public static int[] mergeArrays(int[] array1, int[] array2) {
        int n1 = array1.length;
        int n2 = array2.length;
        int[] result = new int[n1 + n2];
        int i = 0, j = 0, k = 0;

        while (i < n1 && j < n2) {
            if (array1[i] <= array2[j]) {
                result[k] = array1[i];
                i++;
            } else {
                result[k] = array2[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            result[k] = array1[i];
            i++;
            k++;
        }

        while (j < n2) {
            result[k] = array2[j];
            j++;
            k++;
        }

        return result;
    }
}
