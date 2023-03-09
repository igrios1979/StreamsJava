package Streams;

import models.Usuario;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploOperadorFilterSingle {

    public static void main(String[] args) {

        Stream<Usuario>  nombres = Stream
                .of("pato fontanet","paco Delucia","lucho ibañez","lucho gatica")
                .map(nombre -> new Usuario(nombre.split(" ")[0],nombre.split(" ")[1],0))
                .filter(z->z.getNombre().equals("lucho"));
             //   .peek(System.out::println);




        Optional<Usuario> usuario = nombres.findFirst();
        System.out.println(usuario.get());






    }// end metodo main
}


