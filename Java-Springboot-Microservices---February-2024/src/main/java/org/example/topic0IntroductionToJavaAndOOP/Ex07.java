package org.example.topic0IntroductionToJavaAndOOP;

public class Ex07 {
    public static void main(String[] args) {
        int product = 1;
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 10;

        for (int number = LOWERBOUND; number <= UPPERBOUND; ++number) {
            product *= number;
        }

        System.out.println("El producto de " + LOWERBOUND + " a " + UPPERBOUND + " es " + product);
    }
}
