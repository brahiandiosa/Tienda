package tienda;

class Consumismo {
    private String productoExportado;
    private int cantidad;
    private Boolean necesidadDelCliente;

    public Consumismo(String productoExportado, int cantidad, Boolean necesidadDelCliente) {
        this.productoExportado = productoExportado;
        this.cantidad = cantidad;
        this.necesidadDelCliente = necesidadDelCliente;
    }

    public String getProductoExportado() {
        return productoExportado;
    }

    public void setProductoExportado(String productoExportado) {
        this.productoExportado = productoExportado;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Boolean getNecesidadDelCliente() {
        return necesidadDelCliente;
    }

    public void setNecesidadDelCliente(Boolean necesidadDelCliente) {
        this.necesidadDelCliente = necesidadDelCliente;
    }
    
    
}
