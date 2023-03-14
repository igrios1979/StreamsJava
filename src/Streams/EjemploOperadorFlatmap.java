package Streams;

import models.Usuario;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploOperadorFlatmap {

    public static void main(String[] args) {

        Stream<Usuario>  nombres = Stream
                .of("pato fontanet 12","paco Delucia 21","lucho ibañez 32","lucho gatica 56 ")
                .map(nombre -> new Usuario(nombre.split(" ")[0],nombre.split(" ")[1],Integer.parseInt(nombre.split(" ")[2])))
                .flatMap(z->{
                     if(z.getNombre().equalsIgnoreCase("pato")){

                         return Stream.of(z);
                     }

                   return Stream.empty();
                }



                )
                .peek(System.out::println);


        nombres.forEach(System.out::println);




    }// end metodo main
}


