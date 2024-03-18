package org.example.topic2Javafunctional.part3;
import java.util.Random;
import java.util.stream.Stream;

public class ProveerEjemplo {
    public static void main(String[] args) {
        Stream<Integer> numerosAleatorios = Stream.generate(() -> new Random().nextInt(100))
                .limit(10);
        numerosAleatorios.forEach(System.out::println);
    }
}
