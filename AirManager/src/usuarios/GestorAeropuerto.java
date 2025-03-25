package src.usuarios;
import java.util.ArrayList;
import java.util.List;
import java.util.List;


public class GestorAeropuerto extends Usuario{
	
	private List<Usuario> usuarios;
	
	public GestorAeropuerto(String nombre, String contraseña, int id) {
		super(nombre, contraseña, id, "Gestor");
		this.usuarios = new ArrayList<>();  //List vacia para que el gestor gestione usuarios
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
	
	public void añadirUsuario(String tipo, String nombre, String contraseña, int id, Terminal terminal, Aerolinea aerolinea) {
	    Usuario nuevoUsuario = null;

	    for (Usuario u : usuarios) {
	        if (u.getId() == id) {
	            System.out.println("Error, este id ya está en uso");
	            return;
	        }
	    }

	    switch (tipo.toLowerCase()) {
	        case "operador":
	            if (aerolinea != null) {
	                nuevoUsuario = new OperadorAereo(nombre, contraseña, id, aerolinea);
	            } else {
	                System.out.println("Error: Se necesita una aerolínea para asignar al operador.");
	                return;
	            }
	            break;
	        case "controlador":
	            if (terminal != null) {
	                nuevoUsuario = new ControladorAereo(nombre, contraseña, id, terminal);
	            } else {
	                System.out.println("Error: Se necesita una terminal para asignar al controlador.");
	                return;
	            }
	            break;
	        default:
	            System.out.println("Error: Tipo de usuario no válido.");
	            return;
	    }

	    usuarios.add(nuevoUsuario);

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
    
    public Usuario buscarUsuario(int id) {
        for (Usuario u : usuarios) {
            if (u.getId() == id) {
                return u;
            }
        }
        return null;
    }
    
    
    public void cambiarTerminal(int idControlador, Terminal nuevaTerminal) {
        ControladorAereo controlador = (ControladorAereo) buscarUsuario(idControlador);
        if (controlador != null) {
            if (nuevaTerminal != null) {
                controlador.cambiarTerminal(nuevaTerminal);
                System.out.println("Controlador asignado a la terminal " + nuevaTerminal.getId());
            } else {
                System.out.println("Error: La terminal no puede ser nula.");
            }
        } else {
            System.out.println("Error: Controlador no encontrado.");
        }
    }

    public void cambiarAerolinea(int idOperador, Aerolinea nuevaAerolinea) {
        OperadorAereo operador = (OperadorAereo) buscarUsuario(idOperador);
        if (operador != null) {
            if (nuevaAerolinea != null) {
                operador.cambiarAerolinea(nuevaAerolinea);
                System.out.println("Operador asignado a la aerolínea " + nuevaAerolinea.getNombre());
            } else {
                System.out.println("Error: La aerolínea no puede ser nula.");
            }
        } else {
            System.out.println("Error: Operador no encontrado.");
        }
    }

}

