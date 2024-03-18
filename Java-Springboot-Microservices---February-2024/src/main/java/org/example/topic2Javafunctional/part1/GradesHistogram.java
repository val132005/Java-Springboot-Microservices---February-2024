package org.example.topic2Javafunctional.part1;

import java.util.Scanner;

public class GradesHistogram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el número de grados: ");
        int numGrades = input.nextInt();

        int[] grades = new int[numGrades];

        for (int i = 0; i < numGrades; i++) {
            System.out.print("Ingrese el grado #" + (i + 1) + ": ");
            grades[i] = input.nextInt();
        }

        Histogram histogram = new Histogram(grades);
        System.out.println("\nHistograma horizontal:");
        histogram.printHorizontal();
        System.out.println("\nHistograma vertical:");
        histogram.printVertical();
    }
}
