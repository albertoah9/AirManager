import java.util.List;

public class Factura {
	private static int contador = 1;
	private int id;
	private double monto;
	private EstadoFactura estado;
	private List<Hangar> hangares;  
    private List<ZonaAparcamiento> zonasAparcamiento; 
    private List<Finger> fingers;  
    private List<Double> horasDeUso;

    public enum EstadoFactura{
        PENDIENTE_DE_PAGO, PAGADO
    }

    public Factura(double monto, List<Hangar> hangares, List<ZonaAparcamiento> zonasAparcamiento, List<Finger> fingers, List<Double> horasDeUso) {
    	this.id = contador++;
        this.monto = monto;
        this.hangares = hangares;
        this.zonasAparcamiento = zonasAparcamiento;
        this.fingers = fingers;
        this.horasDeUso = horasDeUso;
        this.setEstado(EstadoFactura.PENDIENTE_DE_PAGO);
        this.calcularMontoTotal();
	}
    
    public void calcularMontoTotal() {
        double total = 0;

        for (int i = 0; i < hangares.size(); i++) {
            total += hangares.get(i).getCostePorHora() * horasDeUso.get(i);  // Añadimos el coste de los hangares
        }

        for (int i = 0; i < zonasAparcamiento.size(); i++) {
            total += zonasAparcamiento.get(i).getCostePorHora() * horasDeUso.get(i); 
        }

        for (int i = 0; i < fingers.size(); i++) {
            total += fingers.get(i).getCostePorHora() * horasDeUso.get(i); 
        }

        this.monto = total;  
    }
    

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	public EstadoFactura getEstado() {
		return estado;
	}

	public void setEstado(EstadoFactura estado) {
		this.estado = estado;
	}
	
	public void marcarComoPagado() {
		this.setEstado(EstadoFactura.PAGADO);
	}
}
