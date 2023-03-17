package models;

public class Factura {

    private String descripcion;
    private Usuario usuariofactura;

    public Usuario getUsuariofactura() {
        return usuariofactura;
    }

    public void setUsuariofactura(Usuario usuariofactura) {
        this.usuariofactura = usuariofactura;
    }



    public Factura(String descripcion) {
        this.descripcion = descripcion;
    }




    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
