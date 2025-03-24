
public class Factura {
    private static int contador = 1;
    private int id;
    private double monto;

    public Factura() {
        this.id = contador++;
    }

	public int getId() {
		return id;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}
}
