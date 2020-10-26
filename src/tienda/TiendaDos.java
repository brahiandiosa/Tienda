package tienda;

public class TiendaDos extends Tienda{
    private String tipoDeProductoDos;
    private String sedeDos;
    private String horario;
    
    public TiendaDos(String nombre, 
            String dueno, 
            Boolean atencion, 
            int pagoAlquiler){
        super(nombre, 
                dueno, 
                atencion, 
                pagoAlquiler);
    }

    public String getTipoDeProductoDos() {
        return tipoDeProductoDos;
    }

    public void setTipoDeProductoDos(String tipoDeProductoDos) {
        this.tipoDeProductoDos = tipoDeProductoDos;
    }

    public String getSedeDos() {
        return sedeDos;
    }

    public void setSedeDos(String sedeDos) {
        this.sedeDos = sedeDos;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
}
