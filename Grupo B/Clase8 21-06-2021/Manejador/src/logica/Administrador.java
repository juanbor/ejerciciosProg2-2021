package logica;

import java.time.LocalDate;

public class Administrador extends Usuario {
	private LocalDate lastLogin;
	private int cantPersonasBaneadas;
	
	public Administrador(String nombre, String username, String password, LocalDate lastLogin, 
			int cantPersonasBaneadas) {
		super(nombre, username, password);
		this.lastLogin = lastLogin;
		this.cantPersonasBaneadas = cantPersonasBaneadas;
	}
	
	public Administrador() {
		super();
	}

	public LocalDate getLastLogin() {
		return lastLogin;
	}

	public void setLastLogin(LocalDate lastLogin) {
		this.lastLogin = lastLogin;
	}

	public int getCantPersonasBaneadas() {
		return cantPersonasBaneadas;
	}

	public void setCantPersonasBaneadas(int cantPersonasBaneadas) {
		this.cantPersonasBaneadas = cantPersonasBaneadas;
	}
	
	@Override
	public boolean logear(String username, String password){
		//aplico un algorito al password
		//autentico con la bd
		//hago mas cosas
		
		return false;
	}
	
	
}
