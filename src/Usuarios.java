
import java.util.ArrayList;
import java.util.List;

public abstract class Usuario{
	
	private List<Notificaciones> notificaciones; //Relacion con la clase notificaciones
	private int id;
	private String contraseña;
	private String nombre;
	private String rol;
	
	public Usuario(String nombre, String contraseña, int id, String rol) {
		this.nombre = nombre;
		this.contraseña = contraseña;
		this.id = id;
		this.rol = rol;
		this.notificaciones = new ArrayList<>(); //Inicia la lista vacia
	}
	
	public void agregarNotificacion(Notificaciones notificacion) {
		notificaciones.add(notificacion);
	}
	
	public void eliminarNotificacion(Notificaciones notificacion) {
        notificaciones.remove(notificacion);  
    }
	
	 public void mostrarNotificacion() {
	        for (Notificaciones notificacion : notificaciones) {
	            notificacion.mostrarNotificacion();  
	        }
	    }
	 
	public List<Notificaciones> getNotificaciones(){
		return notificaciones;
	}
	
	public String getRol() {
		return rol;
	}
	public void setRol(String rol) {
		this.rol = rol;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		return "Usuario [id=" + id + ", contraseña=" + contraseña + ", nombre=" + nombre + "]";
	}
	
	
	
}





