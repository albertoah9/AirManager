public class Terminal {
    private int id;
    private int numPuertasEmbarque;
    private int numFingers;
    
    public Terminal(int id, int numPuertasEmbarque, int numFingers) {
        this.id = id;
        this.numPuertasEmbarque = numPuertasEmbarque;
        this.numFingers = numFingers;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getNumPuertasEmbarque() {
        return numPuertasEmbarque;
    }
    public void setNumPuertasEmbarque(int numPuertasEmbarque) {
        this.numPuertasEmbarque = numPuertasEmbarque;
    }

    public int getNumFingers() {
        return numFingers;
    }
    public void setNumFingers(int numFingers) {
        this.numFingers = numFingers;
    }
}
