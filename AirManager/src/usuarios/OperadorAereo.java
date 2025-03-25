package src.usuarios;

public class OperadorAereo extends Usuario {
    private Aerolinea aerolineaAsignada;

    public OperadorAereo(String nombre, String contraseña, int id, Aerolinea aerolineaAsignada) {
        super(nombre, contraseña, id, "Operador");
        this.aerolineaAsignada = aerolineaAsignada;
    }

    public Aerolinea getAerolineaAsignada() {
        return aerolineaAsignada;
    }

    public void setAerolineaAsignada(Aerolinea aerolineaAsignada) {
        this.aerolineaAsignada = aerolineaAsignada;
    }
    
    public void asignarAvion(Aerolinea aerolinea, Avion avion) {
        if (aerolinea != null && avion != null) {
            aerolinea.añadirAvion(avion);
            System.out.println("Avión " + avion.getId() + " asignado a la aerolínea " + aerolinea.getNombre());
        } else {
            System.out.println("No se puede asignar el avión.");
        }
    }
    
    public void cambiarAerolinea(Aerolinea nuevaAerolinea) {
        this.aerolineaAsignada = nuevaAerolinea;
    }


    @Override
    public String toString() {
        return super.toString() + ", Aerolínea asignada: " + (aerolineaAsignada != null ? aerolineaAsignada.getNombre() : "Ninguna");
    }
}
