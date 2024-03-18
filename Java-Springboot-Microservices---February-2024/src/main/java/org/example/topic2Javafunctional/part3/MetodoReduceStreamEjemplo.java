package org.example.topic2Javafunctional.part3;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MetodoReduceStreamEjemplo {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
        Optional<Integer> suma = numeros.stream()
                .reduce(Integer::sum);
        suma.ifPresent(s -> System.out.println("Suma: " + s));
    }
}
