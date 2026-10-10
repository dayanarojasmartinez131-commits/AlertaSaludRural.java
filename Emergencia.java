package modelo;

public class Emergencia {

    private String distrito;
    private String zonaAfectada;
    private String fecha;
    private String paciente;
    private String necesidad;
    private String tipoEmergencia;
    private String nivelEmergencia;
    private String descripcion;
    private String buscar;

    public Emergencia(String distrito, String zonaAfectada, String fecha,String paciente,
            String necesidad,String tipoEmergencia, String nivelEmergencia,String descripcion,
            String buscar) {

        this.distrito = distrito;
        this.zonaAfectada = zonaAfectada;
        this.fecha = fecha;
        this.paciente = paciente;
        this.necesidad = necesidad;
        this.tipoEmergencia = tipoEmergencia;
        this.nivelEmergencia = nivelEmergencia;
        this.descripcion = descripcion;
        this.buscar = buscar;
    }

    public String getDistrito() {
        return distrito;
    }

    public String getZonaAfectada() {
        return zonaAfectada;
    }

    public String getFecha() {
        return fecha;
    }

    public String getPaciente() {
        return paciente;
    }

    public String getNecesidad() {
        return necesidad;
    }

    public String getTipoEmergencia() {
        return tipoEmergencia;
    }

    public String getNivelEmergencia() {
        return nivelEmergencia;
    }

    public String getDescripcion() {
        return descripcion;
    }    
    public String getBuscar(){
        return buscar;
    }
    
}
    

