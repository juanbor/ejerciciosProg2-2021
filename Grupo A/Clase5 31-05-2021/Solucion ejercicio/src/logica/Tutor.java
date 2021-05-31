package logica;

import java.util.ArrayList;

public class Tutor extends Usuario{
	private ArrayList<Usuario> Usuario;

	public Tutor(String nombre, int ci, ArrayList<logica.Usuario> usuario) {
		super(nombre, ci);
		Usuario = usuario;
	}
	
}
