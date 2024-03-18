package org.example.topic2Javafunctional.part3;

import java.util.Optional;

public class OptionalEjemplo {
    public static void main(String[] args) {
        String nombre = "Juan";
        Optional<String> optionalNombre = Optional.of(nombre);
        String valor = optionalNombre.get();
        System.out.println("Valor: " + valor);
        boolean presente = optionalNombre.isPresent();
        System.out.println("Presente: " + presente);
        optionalNombre.ifPresent(n -> System.out.println("Hola, " + n));
        String valorODefault = optionalNombre.orElse("Desconocido");
        System.out.println("Valor o default: " + valorODefault);
    }
}