package org.example.topic2Javafunctional.part3;

import java.util.Arrays;
import java.util.List;

public class ActuarYConsumirEjemplo {
    public static void main(String[] args) {
        List<String> colores = Arrays.asList("Rojo", "Verde", "Azul");
        colores.stream()
                .forEach(color -> System.out.println("Color: " + color));
        colores.stream()
                .forEach(System.out::println);
    }
}