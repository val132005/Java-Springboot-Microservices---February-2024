package org.example.topic0IntroductionToJavaAndOOP;

import java.util.Scanner;

public class Ex08 {

    public static void main(String[] args) {
        final int NUM_STUDENTS = 3;
        int sum = 0;
        double average;

        Scanner input = new Scanner(System.in);

        for (int studentNum = 1; studentNum <= NUM_STUDENTS; ++studentNum) {
            boolean isValid = false;
            int score;

            do {
                System.out.print("Ingrese la calificación (0-100) para el estudiante " + studentNum + ": ");
                score = input.nextInt();

                if (score >= 0 && score <= 100) {
                    isValid = true;
                } else {
                    System.out.println("Entrada no válida, inténtalo de nuevo...");
                }
            } while (!isValid);

            sum += score;
        }

        average = (double) sum / NUM_STUDENTS;
        System.out.printf("El promedio es: %.2f%n", average);
    }
}
