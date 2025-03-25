package src.aeropuertos;

import java.util.ArrayList;

public class Aeropuerto {
    private ArrayList<PuertaEmbarque> puertasEmbarque;
    private ArrayList<Terminal> terminales;
    private ArrayList<Pista> pistas;
    private ArrayList<AeropuertoDestino> aeropuertosDestino;
    private ArrayList<Vuelo> vuelos;
    private ArrayList<Aerolinea> aerolineas; 
    private ArrayList<Notificacion> notificaciones;
    private ArrayList<Usuario> usuarios;
    private ArrayList<Hangar> hangares;
    private ArrayList<ZonaAparcamiento> aparcamientos;
    

    /* Constructor */
    


    /* Getters y Setters */


    /* Métodos */
    // Añadir usuario
    public void addUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }
    public void addNotificacion(Notificacion notificacion){
        notificaciones.add(notificacion);
    }
    public void addAerolinea(Aerolinea aerolinea){
        aerolineas.add(aerolinea);
    }
    public void addVuelo(Vuelo vuelo){
        vuelos.add(vuelo);
    }
    public void addAeropuertoDestino(AeropuertoDestino aeropuertoDest){
        aeropuertosDestino.add(aeropuertoDest);
    }
    public void addPista(Pista pista){
        pistas.add(pista);
    }
    public void addTerminalPasajeros(TerminalPasajeros terminalPasaj){
        terminales.add(terminalPasaj);
    }
    public void addTerminalCarga(TerminalCarga terminalCarg){
        terminales.add(terminalCarg);
    }
    public void addZonaAparcamiento(ZonaAparcamiento zonaAparc){
        aparcamientos.add(zonaAparc);
    }
    public void addHangarCarga(HangarCarga hangarCarg){
        hangares.add(hangarCarg);
    }
    public void addHangarPasajeros(HangarPasajeros hangarPasaj){
        hangares.add(hangarPasaj);
    }

}
