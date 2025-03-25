package elementos;

import java.time.LocalDate;

public class Avion {

    public enum EstadoAvion {
        APARCADO, EN_PREPARACION
    }

    private int id;
    private String marca;
    private String modelo;
    private String matricula;
    private int autonomia;
    private LocalDate ultimaRevis;
    private LocalDate anyoCompra;
    private boolean controlTemp;
    private EstadoAvion estadoAvion;
    private Aerolinea aerolinea; //Añadido, ver a que aerolinea pertenece el avion

    //asignaciones(constructor)
    public Avion(int id, String marca, String modelo, String matricula, int autonomia, 
                    LocalDate ultimaRevis, LocalDate anyoCompra, boolean controlTemp, EstadoAvion estadoAvion){
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.autonomia = autonomia;
        this.ultimaRevis = ultimaRevis;
        this.anyoCompra = anyoCompra;
        this.controlTemp = controlTemp;
        this.estadoAvion = estadoAvion;
        this.aerolinea = null; //Añadido
    }

    //geters y seters
    public Aerolinea getAerolinea() { return aerolinea; } //Añadido

    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getAutonomia() {
        return autonomia;
    }
    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }

    public LocalDate getUltimaRevis() {
        return ultimaRevis;
    }
    public void setUltimaRevis(LocalDate ultimaRevis) {
        this.ultimaRevis = ultimaRevis;
    }

    public LocalDate getAnyoCompra() {
        return anyoCompra;
    }
    public void setAnyoCompra(LocalDate anyoCompra) {
        this.anyoCompra = anyoCompra;
    }

    public boolean isControlTemp() {
        return controlTemp;
    }
    public void setControlTemp(boolean controlTemp) {
        this.controlTemp = controlTemp;
    }

    public EstadoAvion getEstadoAvion() {
        return estadoAvion;
    }
    public void setEstadoAvion(EstadoAvion estadoAvion) {
        this.estadoAvion = estadoAvion;
    }
    
    //Añadido, metodo para asignar una aerolinea al avion
    public void asignarAerolinea(Aerolinea aerolinea) {
        if (this.aerolinea != null) {
            this.aerolinea.removerAvion(this);  // Si el avión ya tiene aerolínea, lo removemos de la anterior
        }
        this.aerolinea = aerolinea;
        aerolinea.añadirAvion(this);  // Añadimos el avión a la nueva aerolínea
    }
    

}
