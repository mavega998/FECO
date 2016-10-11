package Modelos;

public class Sensor {

    private String nombre;
    private String tipo;
    private int vlrMax;
    private int vlrMin;
    private String unidadDato;

    public Sensor() {
        this.nombre = "sensor";
        this.tipo = "";
        this.vlrMax = 0;
        this.vlrMin = 0;
        this.unidadDato = "";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getVlrMax() {
        return vlrMax;
    }

    public void setVlrMax(int vlrMax) {
        this.vlrMax = vlrMax;
    }

    public int getVlrMin() {
        return vlrMin;
    }

    public void setVlrMin(int vlrMin) {
        this.vlrMin = vlrMin;
    }

    public String getUnidadDato() {
        return unidadDato;
    }

    public void setUnidadDato(String unidadDato) {
        this.unidadDato = unidadDato;
    }

}
