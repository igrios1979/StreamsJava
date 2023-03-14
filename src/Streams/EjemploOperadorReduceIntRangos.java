package Streams;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EjemploOperadorReduceIntRangos {

    public static void main(String[] args) {

        IntStream numerous = IntStream.rangeClosed(1,11)
                .peek(System.out::println);

        // int resultadosuma = numerous.reduce(0,Integer::sum);
        //int resultadosuma = numerous.sum();
        IntSummaryStatistics stats = numerous.summaryStatistics();
        System.out.println("  Maximo " + stats.getMax());
        System.out.println("  Minimo " + stats.getMin());
        System.out.println("  Sumas " + stats.getSum());
        System.out.println("  promedio " + stats.getAverage());
        System.out.println("  cantidad de datos " + stats.getCount());



    }



}
