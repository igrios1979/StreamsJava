package Streams;

import models.Usuario;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploOperadorDistinctSingle {


    public static void main(String[] args) {


      Stream<String> n =   Stream.of("pato fontanet","paco Delucia","lucho ibañez","lucho gatica","lucho gatica","lucho gatica","lucho gatica")
                .distinct();


                n.forEach(System.out::println);


   /* Stream.of("pato fontanet","paco Delucia","lucho ibañez","lucho gatica","lucho gatica","lucho gatica","lucho gatica")
            .distinct()
            .forEach(System.out::println);*/









    }// end metodo main




}
