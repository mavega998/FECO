package Modelos;

public class Modulo {

    private String nombre;
    private int entDigtal;
    private int salDigital;
    private int entAnaloga;
    private int salAnaloga;
    private boolean estado;
    private Sensor sensor;

    public Modulo() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEntDigtal() {
        return entDigtal;
    }

    public void setEntDigtal(int entDigtal) {
        this.entDigtal = entDigtal;
    }

    public int getSalDigital() {
        return salDigital;
    }

    public void setSalDigital(int salDigital) {
        this.salDigital = salDigital;
    }

    public int getEntAnaloga() {
        return entAnaloga;
    }

    public void setEntAnaloga(int entAnaloga) {
        this.entAnaloga = entAnaloga;
    }

    public int getSalAnaloga() {
        return salAnaloga;
    }

    public void setSalAnaloga(int salAnaloga) {
        this.salAnaloga = salAnaloga;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Sensor getSensor() {
        return sensor;
    }

    public void setSensor(Sensor sensor) {
        this.sensor = sensor;
    }

}
