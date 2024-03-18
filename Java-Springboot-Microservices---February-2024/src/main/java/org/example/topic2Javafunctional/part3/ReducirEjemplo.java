package org.example.topic2Javafunctional.part3;

import java.util.Arrays;
import java.util.List;

public class ReducirEjemplo {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
        int suma = numeros.stream()
                .reduce(0, Integer::sum);
        System.out.println("Suma: " + suma);
    }
}