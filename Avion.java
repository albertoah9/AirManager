import java.time.LocalDate;

public class Avion {
    private int id;
    private String marca;
    private String modelo;
    private String matricula;
    private int autonomia;
    private LocalDate ultimaRevis;
    private LocalDate anyoCompra;
    private boolean controlTemp;

    //asignaciones(constructor)
    public Avion(int id, String marca, String modelo, String matricula, int autonomia, 
                    LocalDate ultimaRevis, LocalDate anyoCompra, boolean controlTemp){
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.autonomia = autonomia;
        this.ultimaRevis = ultimaRevis;
        this.anyoCompra = anyoCompra;
        this.controlTemp = controlTemp;
    }

    //geters y seters
    public int getId(){
        return id;
    }
    public void setId(int newId){
        this.id = newId;
    }

    public String getMarca(){
        return marca;
    }
    public void setMarca(String newMarca){
        this.marca = newMarca;
    }

    public String getModelo(){
        return modelo;
    }
    public void setModelo(String newModelo){
        this.modelo = newModelo;
    }

    public String getMatricula(){
        return matricula;
    }
    public void setMatricula(String newMatricula){
        this.matricula = newMatricula;
    }

    public int getAutonomia(){
        return autonomia;
    }
    public void setAutonomia(int newAutonomia){
        this.autonomia = newAutonomia;
    }

    public LocalDate getUltimaRevis(){
        return ultimaRevis;
    }
    public void setUltimaRevis(LocalDate newUltimaRevis){
        this.ultimaRevis = newUltimaRevis;
    }

    public LocalDate getAnyoCompra(){
        return anyoCompra;
    }
    public void setAnyoCompra(LocalDate newAnyoCompra){
        this.anyoCompra = newAnyoCompra;
    }

    public boolean getControlTemp(){
        return controlTemp;
    }
    public void setControlTemp(boolean newControlTemp){
        this.controlTemp = newControlTemp;
    }
}
