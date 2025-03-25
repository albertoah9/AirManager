package src.usuarios;
public class ControladorAereo extends Usuario {
    private Terminal terminalAsignada;

    public ControladorAereo(String nombre, String contraseña, int id, Terminal terminalAsignada) {
        super(nombre, contraseña, id, "Controlador");
        this.terminalAsignada = null; // Se asigna con agregarControlador() en Terminal
    }

    public Terminal getTerminalAsignada() {
        return terminalAsignada;
    }

    public void setTerminalAsignada(Terminal nuevaTerminal) {
        if (this.terminalAsignada != null) {
            this.terminalAsignada.eliminarControlador(this); // Elimina de la terminal anterior
        }
        this.terminalAsignada = nuevaTerminal;
        if (nuevaTerminal != null) {
            nuevaTerminal.agregarControlador(this); // Agrega a la nueva terminal
        }
    }
    
    public void cambiarTerminal(Terminal nuevaTerminal) {
        this.terminalAsignada = nuevaTerminal;
    }

    @Override
    public String toString() {
        return super.toString() + ", Terminal asignada: " + (terminalAsignada != null ? terminalAsignada.getId() : "Ninguna");
    }
}
