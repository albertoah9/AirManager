
public class Factura {
	private static int contador = 1;
	private int id;
	private double monto;
	private EstadoFactura estado;

    public enum EstadoFactura{
        PENDIENTE_DE_PAGO, PAGADO
    }

	public Factura(double monto) {
		this.id = contador++;
		this.monto = monto;
		this.setEstado(EstadoFactura.PENDIENTE_DE_PAGO);
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
