package org.example.topic0IntroductionToJavaAndOOP;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduzca el tamaño: ");
        int size = input.nextInt();

        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }
}
