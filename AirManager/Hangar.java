public class Hangar{
    private int id;
    private double ancho;
    private double alto;
    private double largo;
    private int numPlazas;

    //asignaciones(constructor)
    public Hangar(int id, double ancho, double alto, double largo, int numPlazas){
        this.id = id;
        this.alto = alto;
        this.ancho = ancho;
        this.largo = largo;
        this.numPlazas = numPlazas;
    }

    //geters y seters
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