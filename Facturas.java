
public class Facturas {
	private int id;
	private double monto;
	
	public Facturas(int id, double monto) {
		this.id = id;
		this.monto = monto;
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
	
	static Facturas crearFactura(int id, double monto) {
		return new Factura(id, monto);
	}
}
