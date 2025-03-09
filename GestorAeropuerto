package usuarios;

import java.util.ArrayList;
import java.util.List;

public class GestorAeropuerto extends Usuario{
	
	private List<Usuario> usuarios;
	
	public GestorAeropuerto(String nombre, String contraseña, int id) {
		super(nombre, contraseña, id, "Gestor");
		this.usuarios = new ArrayList<>();  //Lista vacia para que el gestor gestione usuarios
		
	}
	
	public void modificarUsuario(int idUsuario, String nuevoNombre, String nuevaContraseña) {
	    Usuario usuarioAModificar = null;

	    for (Usuario u : usuarios) {
	        if (u.getId() == idUsuario) {
	            usuarioAModificar = u;
	            break;
	        }
	    }

	    if (usuarioAModificar != null) {
	        usuarioAModificar.setNombre(nuevoNombre); 
	        usuarioAModificar.setContraseña(nuevaContraseña); 
	        System.out.println("El usuario ha sido modificado con los siguientes valores:");
	        System.out.println("Nuevo Nombre: " + nuevoNombre);
	        System.out.println("Nueva Contraseña: " + nuevaContraseña);
	    } else {
	        System.out.println("Error: usuario no encontrado");
	    }
	}
	
    public void añadirUsuario(String tipo, String nombre, String contraseña, int id) {
    	Usuario nuevoUsuario = null;
    	
    	for(Usuario u : usuarios) {
    		if(u.getId() == id) {
    			System.out.println("Error, este id ya esta en uso");
    			return;
    		}
    	}
    	
    	switch(tipo.toLowerCase()) {
    	case "operador":
    		nuevoUsuario = new OperadorAereo(nombre, contraseña, id);
    		break;
    	case "controlador":
    		nuevoUsuario = new ControladorAereo(nombre, contraseña, id);
    		break;
    	default: 
    		System.out.println("Error");
    		return;
    	}
    	
    	usuarios.add(nuevoUsuario);
    	System.out.println("Usuario de tipo" + tipo + "añadido");
    	System.out.println("Nombre" + nombre);
    	System.out.println("ID" + id);
    }
    
    public void eliminarUsuario(int idUsuario) {
        Usuario usuarioAEliminar = null;
        for (Usuario u : usuarios) {
            if (u.getId() == idUsuario) {
                usuarioAEliminar = u;
                break;
            }
        }

        if (usuarioAEliminar != null) {
            usuarios.remove(usuarioAEliminar);
            System.out.println("Usuario con ID " + idUsuario + " eliminado correctamente.");
        } else {
            System.out.println("Error: Usuario no encontrado.");
        }
    }
    
    
    public void verUsuarios() {
        if (usuarios.isEmpty()) {
            System.out.println("No hay usuarios registrados.");
        } else {
            System.out.println("Lista de usuarios registrados:");
            for (Usuario usuario : usuarios) {
                System.out.println(usuario);
            }
        }
    }

}

