public class Pista {
    public enum EstadoPista{
        LIBRE, OCUPADA
    }
    private int id;
    private double longitud;
    private double anchura;
    
    public Pista(int id, double longitud, double anchura) {
        this.id = id;
        this.longitud = longitud;
        this.anchura = anchura;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public double getLongitud() {
        return longitud;
    }
    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public double getAnchura() {
        return anchura;
    }
    public void setAnchura(double anchura) {
        this.anchura = anchura;
    }
    
}
