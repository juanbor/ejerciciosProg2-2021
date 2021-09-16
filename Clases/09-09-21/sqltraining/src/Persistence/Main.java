package Persistence;

import java.sql.*;
import java.util.ArrayList;

public class Main {
	
	//
	
	public static void crearFruta(Fruta fruta) {
		DBConf dbconf = new DBConf();
		Connection con = dbconf.conectarMySQL();
		
		try {
			// INSERTANDO
			Statement stmt = con.createStatement();
			//CREATE TABLE frutas(nombre VARCHAR(15), color VARCHAR(10), tamanio VARCHAR(10), precio INT)
			String insert = "INSERT INTO frutas(nombre, color, tamanio, precio) "
					+ "VALUES('" + fruta.getNombre() + "','" + fruta.getColor() + "', '" + fruta.getTamanio() + "', " + fruta.getPrecio() + ")";
			stmt.executeUpdate(insert);
			

		}catch (SQLException e) {
			// Imprime en pantalla el trace rojo
			e.printStackTrace();
		}
	}
	
	public static void imprimirFrutas() {
		DBConf dbconf = new DBConf();
		Connection con = dbconf.conectarMySQL();
		
		try {
			// INSERTANDO
			Statement stmt = con.createStatement();

			// HACIENDO QUERY
			String query2 = "SELECT * FROM frutas";
			ResultSet rs = stmt.executeQuery(query2);
			while(rs.next()) {
				String nombreFruta = rs.getString(1);
				String colorFruta = rs.getString("color");
				System.out.println(nombreFruta + " - " + colorFruta);
			}

		}catch (SQLException e) {
			// Imprime en pantalla el trace rojo
			e.printStackTrace();
		}
	}
	
	public static ArrayList<Fruta> obtenerFrutas() {
		DBConf dbconf = new DBConf();
		Connection con = dbconf.conectarMySQL();
		
		ArrayList<Fruta> frutas = new ArrayList<Fruta>();
		
		try {
			// INSERTANDO
			Statement stmt = con.createStatement();

			// HACIENDO QUERY
			String query2 = "SELECT * FROM frutas";
			ResultSet rs = stmt.executeQuery(query2);
			while(rs.next()) {
				String nombreFruta = rs.getString(1);
				String colorFruta = rs.getString("color");
				String tamanioFruta = rs.getString("tamanio");
				int precioFruta = rs.getInt("precio");
				
				Fruta fruta = new Fruta(nombreFruta, colorFruta, tamanioFruta, precioFruta);
				
				frutas.add(fruta);
			}
			

		}catch (SQLException e) {
			// Imprime en pantalla el trace rojo
			e.printStackTrace();
		}
		
		return frutas;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Fruta> frutas;
//		
//		frutas.add(new Fruta("Uva", "naranja", "XXS", 1));
//		frutas.add(new Fruta("Mango", "verde", "XXM", 30));
//		frutas.add(new Fruta("Mandarina", "azul", "L", 50));
//		
//		for(int i = 0; i < frutas.size(); i++) {
//			crearFruta(frutas.get(i));
//		}
		
		frutas = obtenerFrutas();
		
		for(int i = 0; i < frutas.size(); i++) {
			System.out.println(frutas.get(i).getNombre());
		}
		
		
		
	}

}
