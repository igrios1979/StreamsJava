package Streams;

import models.Usuario;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EjemploOperadorUsuariosSum {

    public static void main(String[] args) {

        IntStream numerous = Stream
                .of("Ignacio Rios 32","pato fontanet 21","paco Delucia 33","lucho ibañez 50","lucho gatica 65","pato fontanet 21")
                .map(nombre -> new Usuario(nombre.split(" ")[0],nombre.split(" ")[1],Integer.parseInt(nombre.split(" ")[2])))
                .distinct()
                .mapToInt( i->i.getEdad());


        IntSummaryStatistics stast = numerous.summaryStatistics(); //
        System.out.println("suma --> "+stast.getSum());
        System.out.println("maximo --> "+stast.getMax());
        System.out.println("minimo --> "+stast.getMin());
        System.out.println("cuenta --> "+stast.getCount());

        System.out.println("promedio de edad  --> "+stast.getAverage());
        



    }



}
