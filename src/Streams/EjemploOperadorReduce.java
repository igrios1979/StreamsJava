package Streams;

import java.util.stream.Stream;

public class EjemploOperadorReduce {

    public static void main(String[] args) {

         Stream<String>  nombre =Stream.of("Ernesto farias","Ariel Ortega","Gabriel Batistuta")
                 .distinct();



         String resultado = nombre.reduce("resultado =",(a,b)->a+"|"+b);

        System.out.println(resultado);



    }



}
