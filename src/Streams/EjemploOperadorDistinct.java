package Streams;

import models.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

public class EjemploOperadorDistinct {

    public static void main(String[] args) {

        Stream<Usuario>  nombres = Stream
                .of("pato fontanet 12","paco Delucia 33","lucho ibañez 50","lucho gatica 56","pato fontanet 12")
                .map(nombre -> new Usuario(nombre.split(" ")[0],nombre.split(" ")[1],Integer.parseInt(nombre.split(" ")[2])))
                 .distinct();
             
        nombres.forEach(u-> System.out.println(u));


    }// end metodo main
}


