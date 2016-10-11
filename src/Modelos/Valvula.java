package Modelos;

public class Valvula {

    private String nombre;
    private int numOperaciones;
    private boolean estado;

    public Valvula() {
        this.nombre = "valvula";
        this.numOperaciones = 0;
        this.estado = false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumOperaciones() {
        return numOperaciones;
    }

    public void setNumOperaciones(int numOperaciones) {
        this.numOperaciones = numOperaciones;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

}
