package org.example.topic0IntroductionToJavaAndOOP;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduzca el tamaño: ");
        int size = input.nextInt();

        System.out.print(" * |");
        for (int col = 1; col <= size; col++) {
            System.out.printf("%4d", col);
        }
        System.out.println();
        printSeparator(size);

        for (int row = 1; row <= size; row++) {
            System.out.printf("%2d |", row);
            for (int col = 1; col <= size; col++) {
                System.out.printf("%4d", row * col);
            }
            System.out.println();
        }
    }

    public static void printSeparator(int size) {
        System.out.print("----");
        for (int i = 1; i <= size; i++) {
            System.out.print("----");
        }
        System.out.println();
    }
}
