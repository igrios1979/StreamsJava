package Streams;

import models.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;

public class EjemploStreamListToStream {

    public static void main(String[] args) {

        List<Usuario> lista = new ArrayList<>();
        lista.add(new Usuario("juan martin","Coggi",62));
        lista.add(new Usuario("Ariel ","Ortega",49));
        lista.add(new Usuario("Enzo","Perez",37));
        lista.add(new Usuario("Milton","Casco",35));
        lista.add(new Usuario("Leonardo","Astrada",53));
        lista.add(new Usuario("Andres","DAlessandro",42));
        lista.add(new Usuario("Enzo","Francescoli",62));

 Stream<String> a = lista.stream().map(u->u.getNombre().toUpperCase()
               .concat(" -> ")
               .concat(u.getApellido().toString())
               .concat(" ")
               .concat(Integer.toString(u.getEdad())))
               .flatMap(nombre -> {
                         if(nombre.contains("ENZO")){
                             return Stream.of(nombre);
                         }
                         return Stream.empty();
                 })
         .map(u->u.toLowerCase())
         .peek(s-> System.out.println(s));

        System.out.println("Total ----> " + a.count());













    }
}
