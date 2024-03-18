package org.example.topic0IntroductionToJavaAndOOP;

public class Ex13 {
    public static void main(String[] args) {
        String str1 = "Python";
        String str2 = "Tutorial";

        if (str1.length() > 1 && str2.length() > 1) {
            String concatenated = str1.substring(1) + str2.substring(1);
            System.out.println(concatenated);
        } else {
            System.out.println("Both strings must have a length of 1 and above.");
        }
    }
}
