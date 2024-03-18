package org.example.topic0IntroductionToJavaAndOOP;

public class Ex16 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5};
        int[] array3 = {1, 2, 3, 4};

        System.out.println("Array1: " + arrayToString(array1));
        System.out.println("Array2: " + arrayToString(array2));
        System.out.println("Array3: " + arrayToString(array3));

        System.out.println("Array1 equals Array2: " + equals(array1, array2));
        System.out.println("Array1 equals Array3: " + equals(array1, array3));
    }

    public static boolean equals(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }

        return true;
    }

    public static String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i < array.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
