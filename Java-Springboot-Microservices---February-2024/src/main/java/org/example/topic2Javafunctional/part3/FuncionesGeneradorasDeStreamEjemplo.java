package org.example.topic2Javafunctional.part3;

import java.util.stream.Stream;

public class FuncionesGeneradorasDeStreamEjemplo {
    public static void main(String[] args) {
        Stream<Integer> numerosPares = Stream.iterate(2, n -> n + 2)
                .limit(5);
        numerosPares.forEach(System.out::println);
    }
}
