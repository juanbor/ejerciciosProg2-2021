package logic;

import java.util.ArrayList;

public class Manejador {

	private ArrayList<Usuario> users;
	
	public Manejador() {
		this.users = new ArrayList<Usuario>();
	}
	
	public void addUser(String username, String pass) {
		this.users.add(new Usuario(username, pass));
	}
	
	public boolean login(String username, String pass) {
		for(int i=0; i<users.size(); i++) {
			if(users.get(i).getUsername().equals(username) && users.get(i).getPass().equals(pass)) {
				return true;
			}
		}
		
		return false;
	}
}
