package Streams;

import models.Factura;
import models.Usuario;

import java.util.ArrayList;
import java.util.List;

public class EjemploFlatMapFactura {

    public static void main(String[] args) {

        Usuario usuariouno = new Usuario("Juan","Perez",33);
        Usuario usuariodos = new Usuario("federico","villagran",45);

        usuariodos.addFactura(new Factura(" Elementos de limpieza"));
        usuariodos.addFactura(new Factura(" ultiles escolares"));
        usuariouno.addFactura(new Factura("elementos deportivos"));
        usuariouno.addFactura(new Factura("comida"));

        List<Usuario> usuarioList = new ArrayList<>();
        usuarioList.add(usuariouno);
        usuarioList.add(usuariodos);

        usuarioList.stream().map(z->z.getFacturas())//Usuario::getFacturas // T
                     .flatMap(listafacturas ->listafacturas.stream()) // List::streams
                      .forEach(s-> System.out.println(s.getDescripcion()
                        .concat(" ")
                        .concat(s.getUsuariofactura().toString())));


        /*usuarioList.stream().flatMap(u->u.getFacturas().stream())
                 .forEach(s-> System.out.println(s.getDescripcion()
                  .concat(" ")
                  .concat(s.getUsuariofactura().toString())));*/




       /* for(Usuario u : usuarioList){
            for(Factura f : u.getFacturas())
            {
                System.out.println("Descripcion de facturas " + f.getDescripcion());
            }

        }*/










    }
}
