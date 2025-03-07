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
    public int getId(){
        return id;
    }
    public void setId(int newId){
        this.id = newId;
    }

    public double getAncho(){
        return ancho;
    }
    public void setAncho(double newAncho){
        this.ancho = newAncho;
    }

    public double getAlto(){
        return alto;
    }
    public void setAlto(double newAlto){
        this.alto = newAlto;
    }

    public double getLargo(){
        return largo;
    }
    public void setLargo(double newLargo){
        this.largo = newLargo;
    }

    public int getNumPlazas(){
        return numPlazas;
    }
    public void setNumPlazas(int newNumPlazas){
        this.id = newNumPlazas;
    }
}