package elementos;

import java.time.LocalDate;

public class AvionCarga extends Avion {
    private double cargaMax;
    private boolean mercPeligrosas;
    private int temperatura;

    public AvionCarga(int id, String marca, String modelo, String matricula, int autonomia, LocalDate ultimaRevis, LocalDate anyoCompra, 
                        boolean controlTemp, Avion.EstadoAvion estadoAvion, double cargaMax, boolean mercPeligrosas, int temperatura) {
        super(id, marca, modelo, matricula, autonomia, ultimaRevis, anyoCompra, controlTemp, estadoAvion);
        this.cargaMax = cargaMax;
        this.mercPeligrosas = mercPeligrosas;
        this.temperatura = temperatura;
    }

    public double getCargaMax() {
        return cargaMax;
    }

    public void setCargaMax(double cargaMax) {
        this.cargaMax = cargaMax;
    }

    public boolean isMercPeligrosas() {
        return mercPeligrosas;
    }

    public void setMercPeligrosas(boolean mercPeligrosas) {
        this.mercPeligrosas = mercPeligrosas;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }
}
