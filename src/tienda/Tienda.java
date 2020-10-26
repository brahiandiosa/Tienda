package tienda;

public class Tienda {
    private String nombre;
    private String dueno;
    private Boolean atencion;
    private int pagoAlquiler;
    
    private Persona clientesRecibidos = null;
    private Consumismo productoEspecializado;

    public Persona getClientesRecibidos() {
        return clientesRecibidos;
    }

    public void setClientesRecibidos(Persona clientesRecibidos) {
        this.clientesRecibidos = clientesRecibidos;
    }

    public Consumismo getProductoEspecializado() {
        return productoEspecializado;
    }

    public void setProductoEspecializado(Consumismo productoEspecializado) {
        this.productoEspecializado = productoEspecializado;
    }
    
    

    public Tienda(String nombre, String dueno, Boolean atencion, int pagoAlquiler) {
        this.nombre = nombre;
        this.dueno = dueno;
        this.atencion = atencion;
        this.pagoAlquiler = pagoAlquiler;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDueno() {
        return dueno;
    }

    public void setDueno(String dueno) {
        this.dueno = dueno;
    }

    public Boolean getAtencion() {
        return atencion;
    }

    public void setAtencion(Boolean atencion) {
        this.atencion = atencion;
    }

    public int getPagoAlquiler() {
        return pagoAlquiler;
    }

    public void setPagoAlquiler(int pagoAlquiler) {
        this.pagoAlquiler = pagoAlquiler;
    }
    
    public void datosTienda(){
        this.atencion = true;
        this.pagoAlquiler +=100000;
    }

    public static void main(String[] args) {
        Tienda tiendaPrincipal = new Tienda("Esquina Don Oscar", 
                "Oscar Rodriguez", 
                true, 
                500000);
        
        
        TiendaDos informacionGeneral = new TiendaDos("Licorera Santa Rabia", 
                "Oscar Rodriguez", 
                true, 
                2000000);
        
        tiendaPrincipal.setPagoAlquiler(0);
        
        System.out.println("El nombre de la tienda es:");
        System.out.println(informacionGeneral.getNombre());
        System.out.println("El nombre del dueño es:");
        System.out.println(informacionGeneral.getDueno());
        System.out.println("Estan atendiendo en la tienda:");
        System.out.println(informacionGeneral.getAtencion());
        System.out.println("El pago total del alquiler este mes es de:");
        System.out.println(informacionGeneral.getPagoAlquiler());
    }
    
}
