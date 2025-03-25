package elementos;

import java.time.LocalDate;

public class AvionPasajeros extends Avion {
    private int capacidad;

    public AvionPasajeros(int id, String marca, String modelo, String matricula, int autonomia, LocalDate ultimaRevis,
            LocalDate anyoCompra, boolean controlTemp, Avion.EstadoAvion estadoAvion, int capacidad) {
        super(id, marca, modelo, matricula, autonomia, ultimaRevis, anyoCompra, controlTemp, estadoAvion);
        this.capacidad = capacidad;
    }

    public int getCapacidad() {
        return capacidad;
    }
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    
}
