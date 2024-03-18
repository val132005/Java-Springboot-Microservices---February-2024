package org.example.topic0IntroductionToJavaAndOOP;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese una cadena de texto sin formato: ");
        String plainText = input.nextLine().toUpperCase();

        String encryptedText = encrypt(plainText);

        System.out.println("La cadena de texto cifrado es: " + encryptedText);
    }

    public static String encrypt(String plainText) {
        String encryptedText = "";
        final int SHIFT = 3;

        for (int i = 0; i < plainText.length(); i++) {
            char currentChar = plainText.charAt(i);

            if (currentChar >= 'A' && currentChar <= 'W') {
                currentChar += SHIFT;
            } else if (currentChar >= 'X' && currentChar <= 'Z') {
                currentChar -= 23;
            }

            encryptedText += currentChar;
        }

        return encryptedText;
    }
}
