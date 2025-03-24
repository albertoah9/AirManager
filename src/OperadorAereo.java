package usuarios;

public class OperadorAereo extends Usuario{
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
	
	 @Override
	    public String toString() {
	        return super.toString() + ", Aerolínea asignada: " + (aerolineaAsignada != null ? aerolineaAsignada.getNombre() : "Ninguna");
	    }
}


"Añadir una lista en aerolinea de los operadores que hay????????????"

