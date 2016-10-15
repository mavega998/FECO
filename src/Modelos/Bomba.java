package Modelos;

public class Bomba {

    private String nombre;
    private int tiempoTrabajo;
    private float corrienteNominal;
    private float cuadal;
    private int voltajeTrabajo;
    private boolean estado;
    private String modoOperacion;
    private int horasTrabajo;

    public Bomba() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTiempoTrabajo() {
        return tiempoTrabajo;
    }

    public void setTiempoTrabajo(int tiempoTrabajo) {
        this.tiempoTrabajo = tiempoTrabajo;
    }

    public float getCorrienteNominal() {
        return corrienteNominal;
    }

    public void setCorrienteNominal(float corrienteNominal) {
        this.corrienteNominal = corrienteNominal;
    }

    public float getCuadal() {
        return cuadal;
    }

    public void setCuadal(float cuadal) {
        this.cuadal = cuadal;
    }

    public int getVoltajeTrabajo() {
        return voltajeTrabajo;
    }

    public void setVoltajeTrabajo(int voltajeTrabajo) {
        this.voltajeTrabajo = voltajeTrabajo;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getModoOperacion() {
        return modoOperacion;
    }

    public void setModoOperacion(String modoOperacion) {
        this.modoOperacion = modoOperacion;
    }

    public int getHorasTrabajo() {
        return horasTrabajo;
    }

    public void setHorasTrabajo(int horasTrabajo) {
        this.horasTrabajo = horasTrabajo;
    }

}
