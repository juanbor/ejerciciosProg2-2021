package logica;

import java.time.LocalDate;
import java.util.ArrayList;

public class Manejador {
	private ArrayList<Usuario> usuarios;
	private static Manejador instance = null;

	// CRUD -> Create Read Update Delete
	
	public static Manejador getInstance() {
		if(instance == null)
			instance = new Manejador();
		
		return instance;
	}
	
	private Manejador() {
		super();
		this.usuarios = new ArrayList<Usuario>();
	}

	// Forma 1
	public void create(Usuario user) {
		this.usuarios.add(user);
	}
	
	// Forma 2
	public void createCliente(Cliente cli) {
		this.usuarios.add(cli);
	}
	
	public void createAdmin(Administrador admin) {
		this.usuarios.add(admin);
	}
	
	// Forma 3
	public void createCliente(String nombre, String username, String password, int cantProductosFav, String ultimoProdVisitado) {
		Usuario userNuevo = new Cliente(nombre, username, password, cantProductosFav, ultimoProdVisitado);
		this.usuarios.add(userNuevo);
	}
	
	public void createAdministrador(String nombre, String username, String password, LocalDate lastLogin, 
			int cantPersonasBaneadas) {
		Usuario userNuevo = new Administrador(nombre, username, password, lastLogin, cantPersonasBaneadas);
		this.usuarios.add(userNuevo);
	}
	
	// Forma 1
	public ArrayList<Usuario> getUsuarios() {
		return this.usuarios;
	}
	
	// Forma 2
	public Usuario getUsuario(String username) {
		for(int i = 0; i< this.usuarios.size(); i++) {
			if(this.usuarios.get(i).getUsername().equals(username)) {
				return this.usuarios.get(i);
			}
		}
		
		return null;
	}
	
	// Forma 1
	public void updateUsuario(String username, Usuario userToUpdate) {
		for(int i = 0; i< this.usuarios.size(); i++) {
			if(this.usuarios.get(i).getUsername().equals(username)) {
				
				try {
					Cliente cli = (Cliente)this.usuarios.get(i);
					Cliente cliNuevo = (Cliente)userToUpdate;
					
					cli.setCantProductosFav(cliNuevo.getCantProductosFav());
					cli.setNombre(cliNuevo.getNombre());
					cli.setPassword(cliNuevo.getPassword());
					cli.setUltimoProdVisitado(cliNuevo.getUltimoProdVisitado());
					cli.setUsername(cliNuevo.getUsername());
					
				}catch(ClassCastException e) {
					Administrador admin = (Administrador)this.usuarios.get(i);
					Administrador adminNuevo = (Administrador)userToUpdate;
					
					admin.setCantPersonasBaneadas(adminNuevo.getCantPersonasBaneadas());
					admin.setLastLogin(adminNuevo.getLastLogin());
					admin.setNombre(adminNuevo.getNombre());
					admin.setPassword(adminNuevo.getPassword());
					admin.setUsername(adminNuevo.getUsername());

				}

			}
		}
	}
	
	public void deleteUsuario(String username) {
		int indice = -1;
		for(int i = 0; i< this.usuarios.size(); i++) {
			if(this.usuarios.get(i).getUsername().equals(username)) {
				indice = i;
			}
		}
		
		if(indice >= 0) {
			this.usuarios.remove(indice);
		} else {
			System.out.println("No existe un usuario con ese username bro");
		}
	}
	
}
