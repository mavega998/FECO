package Modelos;

public class Cultivo {

    private String nombre;
    private int tiempoDias;
    private int numPlantas;
    private int fechaIni;

    private float humRealActual;
    private float PhRealActual;

    private float SpHumRelFloracion;
    private float SpHumRelMaduracion;
    private float SpHumRelFinalizacion;
    private float SpPhFloracion;
    private float SpPhMaduracion;
    private float SpPhFinalizacion;
    private float SpTemAmbiente;
    private float SpTemPiso;
    private int SpDiasFloracion;
    private int SpDiasMaduracion;
    private int SpDiasFinalizacion;

    public Cultivo() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTiempoDias() {
        return tiempoDias;
    }

    public void setTiempoDias(int tiempoDias) {
        this.tiempoDias = tiempoDias;
    }

    public int getNumPlantas() {
        return numPlantas;
    }

    public void setNumPlantas(int numPlantas) {
        this.numPlantas = numPlantas;
    }

    public float getHumRealActual() {
        return humRealActual;
    }

    public void setHumRealActual(float humRealActual) {
        this.humRealActual = humRealActual;
    }

    public float getSpHumRelFloracion() {
        return SpHumRelFloracion;
    }

    public void setSpHumRelFloracion(float SpHumRelFloracion) {
        this.SpHumRelFloracion = SpHumRelFloracion;
    }

    public float getSpHumRelMaduracion() {
        return SpHumRelMaduracion;
    }

    public void setSpHumRelMaduracion(float SpHumRelMaduracion) {
        this.SpHumRelMaduracion = SpHumRelMaduracion;
    }

    public float getSpHumRelFinalizacion() {
        return SpHumRelFinalizacion;
    }

    public void setSpHumRelFinalizacion(float SpHumRelFinalizacion) {
        this.SpHumRelFinalizacion = SpHumRelFinalizacion;
    }

    public float getPhRealActual() {
        return PhRealActual;
    }

    public void setPhRealActual(float PhRealActual) {
        this.PhRealActual = PhRealActual;
    }

    public float getSpPhFloracion() {
        return SpPhFloracion;
    }

    public void setSpPhFloracion(float SpPhFloracion) {
        this.SpPhFloracion = SpPhFloracion;
    }

    public float getSpPhMaduracion() {
        return SpPhMaduracion;
    }

    public void setSpPhMaduracion(float SpPhMaduracion) {
        this.SpPhMaduracion = SpPhMaduracion;
    }

    public float getSpPhFinalizacion() {
        return SpPhFinalizacion;
    }

    public void setSpPhFinalizacion(float SpPhFinalizacion) {
        this.SpPhFinalizacion = SpPhFinalizacion;
    }

    public int getFechaIni() {
        return fechaIni;
    }

    public void setFechaIni(int fechaIni) {
        this.fechaIni = fechaIni;
    }

    public float getTemAmbiente() {
        return SpTemAmbiente;
    }

    public void setTemAmbiente(float temAmbiente) {
        this.SpTemAmbiente = temAmbiente;
    }

    public float getTemPiso() {
        return SpTemPiso;
    }

    public void setTemPiso(float temPiso) {
        this.SpTemPiso = temPiso;
    }

}
