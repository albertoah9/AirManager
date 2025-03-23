package usuarios;

public class ControladorAereo extends Usuario{
	private Terminal terminalAsignada;
	
	public ControladorAereo(String nombre, String contraseña, int id, Terminal terminalAsignada) {
		super(nombre, contraseña, id, "Controlador");
		this.terminalAsignada = terminalAsignada;
	}
	
	 public Terminal getTerminalAsignada() {
	        return terminalAsignada;
	    }

	    public void setTerminalAsignada(Terminal terminalAsignada) {
	        this.terminalAsignada = terminalAsignada;
	    }

	    @Override
	    public String toString() {
	        return super.toString() + ", Terminal asignada: " + (terminalAsignada != null ? terminalAsignada.getId() : "Ninguna");
	    }
}

"Añadir una lista en terminal de los controladores que hay????????????"