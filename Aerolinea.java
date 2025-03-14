import java.util.ArrayList;
import java.util.List;

public class Aerolinea {
	private String nombre;
	private int pais;
	private String codigoAerolinea;
	private List<Avion> flota;
	
	public Aerolinea(String nombre, int pais, String codigoAerolinea) {
		this.nombre = nombre;
		this.pais = pais;
		this.codigoAerolinea = codigoAerolinea;
		this.flota = new ArrayList<>();
	}
	
    public List<Avion> getFlota() { return flota; }

	
	public String getNombre() {
	    return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getPais() {
		return pais;
	}
	
	public void setPais(int pais) {
		this.pais = pais;
	}
	
	public String getCodigoAerolinea() {
		return codigoAerolinea;
	}
	
	public void setCodigoAerolinea(String codigoAerolinea) {
		this.codigoAerolinea = codigoAerolinea;
	}
	
	
	public void añadirAvion(Avion avion) {
		flota.add(avion);
	}
	
    public void removerAvion(Avion avion) {
        if (flota.contains(avion)) {
            flota.remove(avion);
            avion.asignarAerolinea(null);  // Desasignar la aerolínea del avión
        }
    }
	
	
    @Override
    public String toString() {
        return "Aerolinea [Nombre=" + nombre + ", País=" + pais + ", Código=" + codigoAerolinea +
               ", Flota de aviones=" + flota.size() + "]";
    }
	
}
