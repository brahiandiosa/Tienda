package tienda;

class Persona {
    private String nombreDelComprador;
    private int cedula;
    private int productosComprados;

    public Persona(String nombreDelComprador, 
            int cedula, 
            int productosComprados) {
        this.nombreDelComprador = nombreDelComprador;
        this.cedula = cedula;
        this.productosComprados = productosComprados;
    }

    public String getNombreDelComprador() {
        return nombreDelComprador;
    }

    public void setNombreDelComprador(String nombreDelComprador) {
        this.nombreDelComprador = nombreDelComprador;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getProductosComprados() {
        return productosComprados;
    }

    public void setProductosComprados(int productosComprados) {
        this.productosComprados = productosComprados;
    }
    
    
}
