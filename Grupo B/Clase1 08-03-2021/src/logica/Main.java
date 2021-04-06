package logica;

public class Main {

	public static void main(String[] args) {
		Usuario[] listaUsers = new Usuario[50];
		
		listaUsers[0] = new Usuario("Carlo", "Magno", 1, 80);
		listaUsers[1] = new Usuario("Pedro", "Picapiedra", 2, 83);
		
		//Lo defino
		Usuario userNuevo = new Usuario("Juan", "Bordagorry", 12345, 25);
		
		
		System.out.println("El user nuevo es: " + userNuevo.getNombre() + " " + userNuevo.getApellido());

		
		String nombreNuevo = "Jose";
		
		userNuevo.setNombre(nombreNuevo);
		
		System.out.println("El user nuevo es: " + userNuevo.getNombre() + " " + userNuevo.getApellido());
	}

}
