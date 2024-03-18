package org.example.topic2Javafunctional.part1;

public class ArrayEquals {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5};
        int[] array3 = {1, 2, 3, 4};

        System.out.println("Array1: " + arrayToString(array1));
        System.out.println("Array2: " + arrayToString(array2));
        System.out.println("Array3: " + arrayToString(array3));

        boolean equals = ArrayUtils.equals(array1, array2);
        System.out.println("Array1 equals Array2: " + equals);

        equals = ArrayUtils.equals(array1, array3);
        System.out.println("Array1 equals Array3: " + equals);
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
