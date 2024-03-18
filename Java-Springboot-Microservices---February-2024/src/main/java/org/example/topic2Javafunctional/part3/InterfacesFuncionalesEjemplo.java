package org.example.topic2Javafunctional.part3;

public class InterfacesFuncionalesEjemplo {
    public static void main(String[] args) {
        Funcion<String, Integer> funcion = Integer::parseInt;
        int resultado = funcion.aplicar("123");
        System.out.println("Resultado: " + resultado);
    }

    @FunctionalInterface
    interface Funcion<T, R> {
        R aplicar(T valor);
    }
}