import java.util.ArrayList;
import java.util.List;

public class Aerolinea {
	private String nombre;
	private int pais;
	private String codigoAerolinea;
	private List<Avion> flota;
	private List<Factura> facturas;
	
	public Aerolinea(String nombre, int pais, String codigoAerolinea) {
		this.nombre = nombre;
		this.pais = pais;
		this.codigoAerolinea = codigoAerolinea;
		this.flota = new ArrayList<>();
		this.facturas = new ArrayList<>();
	}
	
    public List<Avion> getFlota() { return flota; }

    public List<Factura> getFacturas() { return facturas; }

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
    
    public void mostrarFacturas() {
        System.out.println("Facturas de " + nombre + ":");
        for (Factura factura : facturas) {
            System.out.println(factura);
        }
    }
    
    public void eliminarAerolinea() {
        facturas.clear();  // Elimina todas las facturas antes de eliminar la aerolínea
        System.out.println("Aerolinea " + nombre + " eliminada junto con sus facturas.");
    }
	
    
    public void agregarFactura(int id, double monto) {
        Factura nuevaFactura = new Factura();
        facturas.add(nuevaFactura);
    }
    
    
	
    @Override
    public String toString() {
        return "Aerolinea [Nombre=" + nombre + ", País=" + pais + ", Código=" + codigoAerolinea +
               ", Flota de aviones=" + flota.size() + "]";
    }
	
}
