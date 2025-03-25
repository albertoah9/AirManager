package elementos;

public class TerminalPasajeros extends Terminal{
    private int aforoMax;
    private Finger finger;
    
    public TerminalPasajeros(int id, int numPuertasEmbarque, int numFingers, int aforoMax, Finger finger) {
        super(id, numPuertasEmbarque, numFingers);
        this.aforoMax = aforoMax;
        this.finger = finger;
    }

    public int getAforoMax() {
        return aforoMax;
    }
    public void setAforoMax(int aforoMax) {
        this.aforoMax = aforoMax;
    }

    public Finger getFinger() {
        return finger;
    }
    public void setFinger(Finger finger) {
        this.finger = finger;
    }
    
}
