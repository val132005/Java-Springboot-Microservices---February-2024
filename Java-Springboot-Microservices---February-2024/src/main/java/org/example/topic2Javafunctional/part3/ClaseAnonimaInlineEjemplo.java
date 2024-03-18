package org.example.topic2Javafunctional.part3;

public class ClaseAnonimaInlineEjemplo {
    public static void main(String[] args) {
        Funcion funcion = new Funcion() {
            @Override
            public int aplicar(int numero) {
                return numero * 2;
            }
        };
        int resultado = funcion.aplicar(5);
        System.out.println("Resultado: " + resultado);
    }

    interface Funcion {
        int aplicar(int numero);
    }
}