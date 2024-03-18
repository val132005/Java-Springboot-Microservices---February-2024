package org.example.topic2Javafunctional.part3;

import java.util.Arrays;
import java.util.List;

public class FiltradoDeStreamEjemplo {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numeros.stream()
                .filter(n -> n % 2 == 0)
                .filter(n -> n > 5)
                .forEach(System.out::println);
    }
}