package org.example.topic2Javafunctional.part3;

import java.util.Arrays;
import java.util.List;

public class MethodReferencesEjemplo {
    public static void main(String[] args) {
        List<String> nombres = Arrays.asList("Juan", "María", "Pedro", "Ana", "Luis");
        nombres.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
