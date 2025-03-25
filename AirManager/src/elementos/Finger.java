package elementos;

public class Finger {

    public enum EstadoFinger{
        LIBRE, OCUPADO
    }

    private int id;
    private double alturaMax;
    private EstadoFinger estadoFinger;
    private PuertaEmbarque puertaEmbarque;
    
    public Finger(int id, double alturaMax, Finger.EstadoFinger estadoFinger, PuertaEmbarque puertaEmbarque) {
        this.id = id;
        this.alturaMax = alturaMax;
        this.estadoFinger = estadoFinger;
        this.puertaEmbarque = puertaEmbarque;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public double getAlturaMax() {
        return alturaMax;
    }
    public void setAlturaMax(double alturaMax) {
        this.alturaMax = alturaMax;
    }

    public EstadoFinger getEstadoFinger() {
        return estadoFinger;
    }
    public void setEstadoFinger(EstadoFinger estadoFinger) {
        this.estadoFinger = estadoFinger;
    }

    public PuertaEmbarque getPuertaEmbarque() {
        return puertaEmbarque;
    }
    public void setPuertaEmbarque(PuertaEmbarque puertaEmbarque) {
        this.puertaEmbarque = puertaEmbarque;
    }
}
