package src.elementos;

public class ZonaAparcamiento {
    public enum TipoZonaAparcamiento{
        PASAJEROS, MERCANCIAS
    }
    private int id;
    private double ancho;
    private double largo;
    private int numPlazas;
    private TipoZonaAparcamiento tipoZonaAparcamiento;

    public ZonaAparcamiento(int id, double ancho, double largo, int numPlazas,
            ZonaAparcamiento.TipoZonaAparcamiento tipoZonaAparcamiento) {
        this.id = id;
        this.ancho = ancho;
        this.largo = largo;
        this.numPlazas = numPlazas;
        this.tipoZonaAparcamiento = tipoZonaAparcamiento;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public double getAncho() {
        return ancho;
    }
    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }
    public void setLargo(double largo) {
        this.largo = largo;
    }

    public int getNumPlazas() {
        return numPlazas;
    }
    public void setNumPlazas(int numPlazas) {
        this.numPlazas = numPlazas;
    }

    public TipoZonaAparcamiento getTipoZonaAparcamiento() {
        return tipoZonaAparcamiento;
    }
    public void setTipoZonaAparcamiento(TipoZonaAparcamiento tipoZonaAparcamiento) {
        this.tipoZonaAparcamiento = tipoZonaAparcamiento;
    }
}
