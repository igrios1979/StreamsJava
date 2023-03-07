package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class EjemploUnoStreams {

    public static void main(String[] args) {

        /*
        Stream<String> primero = Stream.of("ignacio", "malena", "Josefina", "yanina");

         primero.forEach(System.out::println);
       primero.forEach(s -> System.out.println(s + ","));
        //------------------------------------------------------
        System.out.println("---------Segundo FLUJO--------------------"  );
        String[] arr = {"ignacio","male"};
        Stream<String> segundo = Arrays.stream(arr);
        
        segundo.forEach(s-> System.out.println("s = " + s));*/

        Stream<String> nombres = Stream.<String>builder()
                .add("Ignacio")
                .add("Josefina")
                .build();
        System.out.println("-----------|----|Stream Builder |----------" );
        nombres.forEach(a-> System.out.println(a));

        System.out.println("-----------|----|Convertir Lista a Stream|----------" );
        List<String> lista = new ArrayList<>();
        lista.add("hola ");
        lista.add("que ");
        lista.add("tal " );
        lista.add("tu dia !!!!");


        Stream<String> nom = lista.stream();

        //nom.forEach(s-> System.out.print(s));
        nom.forEach(System.out::print);
        lista.stream().forEach(s->{
            System.out.println(s);
        });











        



    }


}
