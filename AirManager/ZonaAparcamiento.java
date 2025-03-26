public class ZonaAparcamiento {
    public enum TipoZonaAparcamiento{
        PASAJEROS, MERCANCIAS
    }
    private int id;
    private double ancho;
    private double largo;
    private int numPlazas;
    private double costePorHora;
    private TipoZonaAparcamiento tipoZonaAparcamiento;

    public ZonaAparcamiento(int id, double costePorHora, double ancho, double largo, int numPlazas,
            ZonaAparcamiento.TipoZonaAparcamiento tipoZonaAparcamiento) {
        this.id = id;
        this.ancho = ancho;
        this.largo = largo;
        this.numPlazas = numPlazas;
        this.tipoZonaAparcamiento = tipoZonaAparcamiento;
        this.costePorHora = costePorHora;
    }
    
    
    public double getCostePorHora() {
        return costePorHora;
    }

    public void setCostePorHora(double costePorHora) {
        this.costePorHora = costePorHora;
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
