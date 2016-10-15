package Modelos;

public class Sensor {

    private String idSensor;
    private String refSensor;       
    private String tipoSensor;      // Temperatura, Humedad, pH
    private String estadoSensor;    // Mantenimiento, Activo, Inactivo

    public Sensor() {
    }

    public String getIdSensor() {
        return idSensor;
    }

    public void setIdSensor(String idSensor) {
        this.idSensor = idSensor;
    }

    public String getRefSensor() {
        return refSensor;
    }

    public void setRefSensor(String refSensor) {
        this.refSensor = refSensor;
    }

    public String getTipoSensor() {
        return tipoSensor;
    }

    public void setTipoSensor(String tipoSensor) {
        this.tipoSensor = tipoSensor;
    }

    public String getEstadoSensor() {
        return estadoSensor;
    }

    public void setEstadoSensor(String estadoSensor) {
        this.estadoSensor = estadoSensor;
    }

}
