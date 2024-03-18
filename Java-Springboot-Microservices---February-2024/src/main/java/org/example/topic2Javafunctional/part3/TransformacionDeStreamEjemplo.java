package org.example.topic2Javafunctional.part3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TransformacionDeStreamEjemplo {
    public static void main(String[] args) {
        List<String> nombres = Arrays.asList("Juan", "María", "Pedro", "Ana", "Luis");
        List<String> nombresMayusculas = nombres.stream()
                .map(String::toUpperCase)
                .filter(n -> n.length() > 3)
                .collect(Collectors.toList());
        System.out.println("Nombres en mayúsculas y con más de 3 caracteres: " + nombresMayusculas);
    }
}