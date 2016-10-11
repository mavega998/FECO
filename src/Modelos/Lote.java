package Modelos;

public class Lote {

    private String tamaño;
    private String capacidad;
    private String estado;
    private float altura;
    private float paramIniPot;
    private float paramIniFos;
    private float paramIniCal;
    private float paramIniPh;
    private Cultivo cultivo;

    public Lote() {

    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getParamIniPot() {
        return paramIniPot;
    }

    public void setParamIniPot(float paramIniPot) {
        this.paramIniPot = paramIniPot;
    }

    public float getParamIniFos() {
        return paramIniFos;
    }

    public void setParamIniFos(float paramIniFos) {
        this.paramIniFos = paramIniFos;
    }

    public float getParamIniCal() {
        return paramIniCal;
    }

    public void setParamIniCal(float paramIniCal) {
        this.paramIniCal = paramIniCal;
    }

    public float getParamIniPh() {
        return paramIniPh;
    }

    public void setParamIniPh(float paramIniPh) {
        this.paramIniPh = paramIniPh;
    }

    public Cultivo getCultivo() {
        return cultivo;
    }

    public void setCultivo(Cultivo cultivo) {
        this.cultivo = cultivo;
    }

}
