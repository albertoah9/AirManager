public class PuertaEmbarque {
    private int id;
    private Finger finger;

    public PuertaEmbarque(int id, Finger finger) {
        this.id = id;
        this.finger = finger;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public Finger getFinger() {
        return finger;
    }
    public void setFinger(Finger finger) {
        this.finger = finger;
    }
}
