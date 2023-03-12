package Streams;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EjemploOperadorReduceIntRangos {

    public static void main(String[] args) {

        IntStream numerous = IntStream.range(1,11)
                .peek(System.out::println);

       // int resultadosuma = numerous.reduce(0,Integer::sum);
        int resultadosuma = numerous.sum();

        System.out.println("resultadosuma = " + resultadosuma);



    }



}
