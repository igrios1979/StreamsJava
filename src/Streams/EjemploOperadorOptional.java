package Streams;

import models.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

public class EjemploOperadorOptional {

    public static void main(String[] args) {

        Stream<Usuario>  nombres = Stream
                .of("pato fontanet 23","paco Delucia 26","lucho ibañez 33","lucho gatica 89")
                .map(n -> new Usuario(n.split(" ")[0],n.split(" ")[1],Integer.parseInt(n.split(" ")[2])))
                .filter(z->z.getNombre().equals("paco"));
        //  .filter(z->z.getEdad() == 23);
        Optional<Usuario> usuario = nombres.findFirst();
        
        if(!usuario.isEmpty()){ // isPresent()
            System.out.println(usuario.get());
        }else{
            System.out.println("NO EXISTE|-> objeto" );
        }
        
      //  System.out.println(usuario.orElseGet(()->new Usuario("Nadie","nadie",0)).getNombre());
      //  System.out.println(usuario.orElse(null));
     //   System.out.println(usuario.orElseThrow());
    //    System.out.println(usuario.orElseGet(()->new Usuario("Nadie","nadie",0)).getNombre());
   //     System.out.println(usuario.orElse(new Usuario("Nadie","nadie",0)));

    }// end metodo main
}


