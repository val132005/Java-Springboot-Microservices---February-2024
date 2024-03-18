package org.example.topic0IntroductionToJavaAndOOP;

public class Ex06 {
    public static void main(String[] args) {
        int sum = 0;
        double average;
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 100;

        for (int number = LOWERBOUND; number <= UPPERBOUND; ++number) {
            sum += number;
        }
        average = (double) sum / (UPPERBOUND - LOWERBOUND + 1);

        System.out.println("La suma del " + LOWERBOUND + " al " + UPPERBOUND + " es " + sum);
        System.out.println("El promedio es " + average);
    }
}
