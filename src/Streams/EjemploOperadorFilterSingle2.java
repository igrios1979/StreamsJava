package Streams;

import models.Usuario;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class EjemploOperadorFilterSingle2 {

    public static void main(String[] args) {

        Usuario usuario = Stream
                .of("Pato fontanet","Paco Delucia","lucho ibañez","lucho gatica","ignacio Rios","Elton john")
                .map(nombre -> new Usuario(nombre.split(" ")[0],nombre.split(" ")[1],0))
                .peek(System.out::println)
                .filter(u->u.getId().equals(4))
                .findFirst().orElseGet(()->new Usuario("nadie","nadie",3));



        System.out.println(usuario);


        //ejemplo lo mismo pero con lista y for

        List<Usuario> lista = Arrays.asList(new Usuario("Pato", "fontanet",23),
                                            new Usuario("Paco", "Delucia",56),
                                            new Usuario("lucho", "ibañez",56),
                                            new Usuario("lucho", "gatica",56));

        boolean resul = false;

        for(Usuario u : lista) {
            if (u.getId().equals(3)) {
                resul = true;
                break;
            }
        }
        System.out.println("resul = " + resul);
                







    }// end metodo main
}


