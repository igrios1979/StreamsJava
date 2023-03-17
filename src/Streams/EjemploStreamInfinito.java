package Streams;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class EjemploStreamInfinito {

    public static void main(String[] args) {


        AtomicInteger contador = new AtomicInteger(0);
        Stream.generate(()->{
                    try {
                        TimeUnit.SECONDS.sleep(1);
                        } catch (InterruptedException e) {
                                    e.printStackTrace();
                                                }
                return contador.incrementAndGet();
        })
        .limit(10)
        .forEach(System.out::println);



     /*   Supplier<String> saludoSuplier =  ()->"hola desde suplier ";
        String cadenaSaludo = saludoSuplier.get();
        System.out.println("cadenaSaludo = " + cadenaSaludo);*/


    }
}
