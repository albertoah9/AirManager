package elementos;

import java.util.ArrayList;
import java.util.List;

public class Terminal {
    private int id;
    private int numPuertasEmbarque;
    private int numFingers;
    private List<ControladorAereo> controladores;

    public Terminal(int id, int numPuertasEmbarque, int numFingers) {
        this.id = id;
        this.numPuertasEmbarque = numPuertasEmbarque;
        this.numFingers = numFingers;
        this.controladores = new ArrayList<>();
    }

    public List<ControladorAereo> getControladores() {
        return new ArrayList<>(controladores); // Evita modificaciones externas
    }

    public void agregarControlador(ControladorAereo controlador) {
        if (controlador == null || controladores.contains(controlador)) return;

        if (controlador.getTerminalAsignada() != null) {
            controlador.getTerminalAsignada().eliminarControlador(controlador); // Elimina de la anterior
        }

        controladores.add(controlador);
        controlador.setTerminalAsignada(this);
    }

    public void eliminarControlador(ControladorAereo controlador) {
        if (controlador != null && controladores.remove(controlador)) {
            controlador.setTerminalAsignada(null);
        }
    }

    public int getId() {
        return id;
    }

    public int getNumPuertasEmbarque() {
        return numPuertasEmbarque;
    }

    public int getNumFingers() {
        return numFingers;
    }

    @Override
    public String toString() {
        StringBuilder info = new StringBuilder("Terminal ID: " + id +
                ", Puertas de embarque: " + numPuertasEmbarque +
                ", Fingers: " + numFingers + 
                ", Controladores: [");
        for (ControladorAereo c : controladores) {
            info.append(c.getNombre()).append(", ");
        }
        if (!controladores.isEmpty()) {
            info.setLength(info.length() - 2); // Elimina la última coma
        }
        info.append("]");
        return info.toString();
    }
}
