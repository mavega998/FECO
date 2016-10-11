package Modelos;

public class Bomba {

    private String nombre;
    private int timeTrabajo;
    private float nivCorriente;
    private float caudal;

    public Bomba() {
        this.nombre = "bomba";
        this.timeTrabajo = 0;
        this.nivCorriente = 0;
        this.caudal = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTimeTrabajo() {
        return timeTrabajo;
    }

    public void setTimeTrabajo(int timeTrabajo) {
        this.timeTrabajo = timeTrabajo;
    }

    public float getNivCorriente() {
        return nivCorriente;
    }

    public void setNivCorriente(float nivCorriente) {
        this.nivCorriente = nivCorriente;
    }

    public float getCaudal() {
        return caudal;
    }

    public void setCaudal(float caudal) {
        this.caudal = caudal;
    }

}
