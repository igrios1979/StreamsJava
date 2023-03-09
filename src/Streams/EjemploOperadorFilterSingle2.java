package Streams;

import models.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

public class EjemploOperadorFilterSingle2 {

    public static void main(String[] args) {

        Usuario usuario = Stream
                .of("Pato fontanet","Paco Delucia","lucho ibañez","lucho gatica","ignacio Rios","Elton john")
                .map(nombre -> new Usuario(nombre.split(" ")[0],nombre.split(" ")[1],0))
                .peek(System.out::println)
                .filter(z->z.getId().equals(6))
                .findFirst().get(); // operador terminal cuando lo encuentra deja de buscar



        System.out.println("usuario nro  "+usuario.getId()+ " " + usuario);






    }// end metodo main
}


