package Streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploOperadorMap {

    public static void main(String[] args) {

        //Asignamos flujo a una variable

        Stream<String> primero = Stream
                .of("ignacio", "malena", "Josefina", "yanina")
               //.peek(e-> System.out.println(e))
                .map(String::toUpperCase)
                .peek(e-> System.out.println(e))
                .map(String::toLowerCase);

       // primero.forEach(System.out::println);

        List<String> lista = primero.collect(Collectors.toList());
        lista.forEach(System.out::println);



     /* Stream.of("juan", "maledsdna", "Josefina", "yanina")
                .map(n-> {
                    return n.toUpperCase();}).forEach(System.out::println);*/




    }
}


