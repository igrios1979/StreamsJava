package Streams;

import models.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

public class EjemploOperadorFilterSingleEmpty {

    public static void main(String[] args) {

    long count = Stream
                .of("pato fontanet","","paco Delucia","lucho ibañez","","lucho gatica","")
                .filter(z->z.isEmpty())
                .count();

        System.out.println("count = " + count);










    }// end metodo main
}


