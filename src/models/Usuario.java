package models;

public class Usuario {



    private Integer id;
    private String Nombre;
    private String Apellido;
    private  int edad ;
    private static int ultimoId;




    public Usuario(String nombre, String apellido, int edad) {
        Nombre = nombre;
        Apellido = apellido;
        this.edad = edad;
        this.id = ++ultimoId;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return
               "" + Nombre +" "+Apellido + " "+edad ;

    }




}
