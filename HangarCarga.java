public class HangarCarga extends Hangar {
    private int temperatura;
    private boolean mercPeligrosas;

    //asignaciones(constructor)
    public HangarCarga(int id, double ancho, double alto, double largo, int numPlazas, int temperatura, boolean mercPeligrosas){
        super(id, ancho, alto, largo, numPlazas);
        this.temperatura = temperatura;
        this.mercPeligrosas = mercPeligrosas;
    }

    public int getTemperatura(){
        return temperatura;
    }
    public void setTemperatura(int newTemperatura){
        this.temperatura = newTemperatura;
    }

    public boolean getMercPeligrosas(){
        return mercPeligrosas;
    }
    public void setMercPeligrosas(boolean newMercPeligrosas){
        this.mercPeligrosas = newMercPeligrosas;
    }
}