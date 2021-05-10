package logica;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Admin
		Usuario admin1 = new Administrador("Carlos Perez", "c.p", "1234", LocalDate.now(), 3);
		
		//Cliente
		Usuario cliente1 = new Cliente("Jose Pedro", "j.p", "1111", 4, "Guitarras Gibson");
		
		//ImprimirDatos
		System.out.println(admin1.getNombre());
		System.out.println(cliente1.getNombre());
		
		//Castear con variable intermedia
		Administrador temp = (Administrador)admin1; // Clase_Hija var = (Clase_Hija)varPadre;
		System.out.println(temp.getLastLogin());
		
		Cliente temp2 = (Cliente)cliente1;
		System.out.println(temp2.getUltimoProdVisitado());
		
		//Castear sin variable intermedia
		System.out.println(((Administrador)admin1).getLastLogin());
		
		System.out.println(((Cliente)cliente1).getUltimoProdVisitado());
		
		//Castear MAL
		try {
			Administrador temp3 = (Administrador)cliente1;
			
		} catch (ClassCastException e) {
			System.out.println("Estas casteando mal bro");
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
		
		
		//Polimorfismo
		System.out.println(cliente1.toString());
		System.out.println(cliente1.logear("a","a"));
		System.out.println(((Administrador)admin1).logear("a","a"));
		
		System.out.println(cliente1.getUsername());
		System.out.println(cliente1.getUsername(true));
		System.out.println(cliente1.getUsername(false));
		
	}

}
