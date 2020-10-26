package tienda;

public class TiendaUno extends Tienda{
    private String tipoDeProducto;
    private String sede;
    private int cantidadDeVentas;
    
    public TiendaUno(String nombre, 
            String dueno, 
            Boolean atencion, 
            int pagoAlquiler){
        super(nombre, 
                dueno, 
                atencion, 
                pagoAlquiler);
    }

    public String getTipoDeProducto() {
        return tipoDeProducto;
    }

    public void setTipoDeProducto(String tipoDeProducto) {
        this.tipoDeProducto = tipoDeProducto;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public int getCantidadDeVentas() {
        return cantidadDeVentas;
    }

    public void setCantidadDeVentas(int cantidadDeVentas) {
        this.cantidadDeVentas = cantidadDeVentas;
    }
}
