package Modelos;

public class SensorDigital extends Sensor{
    
    private Float valorMax;
    private Float valorMin;
    private String unidadMedida;
    private Float valorReal;

    public SensorDigital() {
        super();
    }

    public Float getValorMax() {
        return valorMax;
    }

    public void setValorMax(Float valorMax) {
        this.valorMax = valorMax;
    }

    public Float getValorMin() {
        return valorMin;
    }

    public void setValorMin(Float valorMin) {
        this.valorMin = valorMin;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public Float getValorReal() {
        return valorReal;
    }

    public void setValorReal(Float valorReal) {
        this.valorReal = valorReal;
    }
    
    
    
}
