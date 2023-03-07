package Streams;

import java.util.Arrays;
import java.util.stream.Stream;

public class EjemploUnoStreams {

    public static void main(String[] args) {

        Stream<String> primero = Stream.of("ignacio", "malena", "Josefina", "yanina");

        //  primero.forEach(System.out::println);
        primero.forEach(s -> System.out.println(s + ","));
        //------------------------------------------------------
        System.out.println("---------Segundo FLUJO--------------------"  );
        String[] arr = {"ignacio","male"};
        Stream<String> segundo = Arrays.stream(arr);
        
        segundo.forEach(s-> System.out.println("s = " + s));




    }


}
