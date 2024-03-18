package org.example.topic2Javafunctional.part3;

public class FuncionesEInterfacesGenericasEjemplo {
    public static void main(String[] args) {
        Funcion<Integer, String> funcion = (n) -> String.valueOf(n * 2);
        String resultado = funcion.aplicar(5);
        System.out.println("Resultado: " + resultado);
    }

    interface Funcion<T, R> {
        R aplicar(T valor);
    }
}