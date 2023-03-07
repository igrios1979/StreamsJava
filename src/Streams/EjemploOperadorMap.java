package Streams;

import java.util.stream.Stream;

public class EjemploOperadorMap {

    public static void main(String[] args) {

        //Asignamos flujo a una variable

        Stream<String> primero = Stream
                .of("ignacio", "malena", "Josefina", "yanina")
                .peek(e-> System.out.println(e))
                .map(n-> {
             return n.toUpperCase();});

         primero.forEach(System.out::println);


      Stream.of("JUAN", "maledsdsdsdsdna", "Josefina", "yanina")
                .map(n-> {
                    return n.toUpperCase();}).forEach(System.out::println);




    }
}


