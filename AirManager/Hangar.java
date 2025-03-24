public class Hangar{
    private int id;
    private double ancho;
    private double alto;
    private double largo;
    private int numPlazas;
    private double costePorHora;

    //asignaciones(constructor)
    public Hangar(int id, double ancho, double alto, double largo, int numPlazas, double costePorHora){
        this.id = id;
        this.alto = alto;
        this.ancho = ancho;
        this.largo = largo;
        this.numPlazas = numPlazas;
        this.costePorHora = costePorHora;
    }

    //geters y seters
    
    public double getCostePorHora() {
        return costePorHora;
    }

    public void setCostePorHora(double costePorHora) {
        this.costePorHora = costePorHora;
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public double getAncho() {
        return ancho;
    }
    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }
    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getLargo() {
        return largo;
    }
    public void setLargo(double largo) {
        this.largo = largo;
    }

    public int getNumPlazas() {
        return numPlazas;
    }
    public void setNumPlazas(int numPlazas) {
        this.numPlazas = numPlazas;
    }
    public void Plazas(){
        
    }

}