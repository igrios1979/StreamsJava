package Streams;

import models.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

public class EjemploOperadorFilterSingle2 {

    public static void main(String[] args) {

        boolean existe = Stream
                .of("Pato fontanet","Paco Delucia","lucho ibañez","lucho gatica","ignacio Rios","Elton john")
                .map(nombre -> new Usuario(nombre.split(" ")[0],nombre.split(" ")[1],0))
                .peek(System.out::println)
                .anyMatch(u->u.getId().equals(7));



        System.out.println(existe);






    }// end metodo main
}


