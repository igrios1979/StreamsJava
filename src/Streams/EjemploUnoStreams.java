package Streams;

import java.util.stream.Stream;

public class EjemploUnoStreams {

    public static void main(String[] args) {

        Stream<String> primero = Stream.of("ignacio", "malena", "Josefina", "yanina");

        //  primero.forEach(System.out::println);
        primero.forEach(s -> System.out.print(s + ","));

        String[] arr = {"ignacio","male"};




    }


}
