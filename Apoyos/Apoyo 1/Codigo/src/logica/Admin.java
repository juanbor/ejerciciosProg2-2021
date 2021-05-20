package logica;

import java.util.ArrayList;

public class Admin extends Usuario {
	private ArrayList<Usuario> usuariosDelSistema;

	public Admin(String nombre, ArrayList<Usuario> usuariosDelSistema) {
		super(nombre);
		this.usuariosDelSistema = usuariosDelSistema;
	}

	public ArrayList<Usuario> getUsuariosDelSistema() {
		return usuariosDelSistema;
	}

	public void setUsuariosDelSistema(ArrayList<Usuario> usuariosDelSistema) {
		this.usuariosDelSistema = usuariosDelSistema;
	}

}
