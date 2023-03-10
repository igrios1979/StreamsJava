package Streams;

import models.Usuario;

import java.util.stream.Stream;

public class EjemploOperadorCount {

    public static void main(String[] args) {

        long existe = Stream
                .of("Pato fontanet","Paco Delucia","lucho ibañez","lucho gatica","ignacio Rios","Elton john")
                .map(nombre -> new Usuario(nombre.split(" ")[0],nombre.split(" ")[1],0))
                .peek(System.out::println)
                .count(); // operador terminal cuando lo encuentra deja de buscar



        System.out.println(existe);






    }// end metodo main
}


