package org.example.topic2Javafunctional.part3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExpresionesLambdaEjemplo {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> numerosPares = numeros.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Números pares: " + numerosPares);
    }
}