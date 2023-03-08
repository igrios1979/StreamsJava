package Streams;

import models.Usuario;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploMapconUsuario {


    public static void main(String[] args) {

        Stream<Usuario>  nombres = Stream
                .of("pato fontanet","paco Delucia","lucho ibañez")
                .map(nombre -> new Usuario(nombre.split(" ")[0],nombre.split(" ")[1],0))
                .peek(u-> System.out.println(u.getNombre()))
                .map(usuario ->{
                    String nombre = usuario.getNombre().toUpperCase();
                    usuario.setNombre(nombre);
                    return usuario;

                } );


        List<Usuario> lista = nombres.collect(Collectors.toList());
        lista.forEach(u-> System.out.println(u.getApellido()));




    }// end metodo main


}// end class
