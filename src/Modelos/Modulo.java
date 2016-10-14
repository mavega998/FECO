package Modelos;

import java.util.ArrayList;
import java.util.Date;

public class Modulo {

    private String idModulo;
    private String nombreModulo;
    private int numEntradasDigtales;
    private int numSalidasDigitales;
    private int numEntradasAnalogas;
    private int numSalidasAnalogas;
    private boolean estado;
    private ArrayList<Sensor> sensores;
    private Date fechaDesactivacion;

    public Modulo() {

    }

    public String getIdModulo() {
        return idModulo;
    }

    public void setIdModulo(String idModulo) {
        this.idModulo = idModulo;
    }

    public String getNombreModulo() {
        return nombreModulo;
    }

    public void setNombreModulo(String nombreModulo) {
        this.nombreModulo = nombreModulo;
    }

    public int getNumEntradasDigtales() {
        return numEntradasDigtales;
    }

    public void setNumEntradasDigtales(int numEntradasDigtales) {
        this.numEntradasDigtales = numEntradasDigtales;
    }

    public int getNumSalidasDigitales() {
        return numSalidasDigitales;
    }

    public void setNumSalidasDigitales(int numSalidasDigitales) {
        this.numSalidasDigitales = numSalidasDigitales;
    }

    public int getNumEntradasAnalogas() {
        return numEntradasAnalogas;
    }

    public void setNumEntradasAnalogas(int numEntradasAnalogas) {
        this.numEntradasAnalogas = numEntradasAnalogas;
    }

    public int getNumSalidasAnalogas() {
        return numSalidasAnalogas;
    }

    public void setNumSalidasAnalogas(int numSalidasAnalogas) {
        this.numSalidasAnalogas = numSalidasAnalogas;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public ArrayList<Sensor> getSensores() {
        return sensores;
    }

    public void setSensores(ArrayList<Sensor> sensor) {
        this.sensores = sensor;
    }

    public Date getFechaDesactivacion() {
        return fechaDesactivacion;
    }

    public void setFechaDesactivacion(Date fechaDesactivacion) {
        this.fechaDesactivacion = fechaDesactivacion;
    }

}
