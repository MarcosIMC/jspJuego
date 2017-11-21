package Model;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import DataBase.DataManager;

public class JuegoPeer {
	
	public static boolean insertarJuego(String consola, String titulo, String genero, DataManager manager) {
		
		Connection conn = manager.getConnection();
		
		if(conn != null) {
			
			String query = "INSERT into juegos (id, consola, titulo, genero) VALUES (?,?,?,?)";
			
			try {
				PreparedStatement pstm = conn.prepareStatement(query);
				
				pstm.setInt(1, 0);
				pstm.setString(2, consola);
				pstm.setString(3, titulo);
				pstm.setString(4, genero);
				
				pstm.executeUpdate();
				
				
				pstm.close();
				conn.close();
				
				return true;
			}
			
			catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
		}
		
		return false;
		
	}
	
	public static ArrayList<Juego> devolverJuegos(DataManager manager) {
		
		Connection conn = manager.getConnection();
		ArrayList<Juego> arrayListJuegos = null;
		
		if(conn != null) {
			String query = "SELECT * FROM juegos";
			arrayListJuegos = new ArrayList<>();
			
			try {
				PreparedStatement ps = conn.prepareStatement(query);
				
				ResultSet rs = ps.executeQuery();
				
				Juego juego = null;
				
				while(rs.next()) {
					
					String consola = rs.getString("consola");
					String titulo = rs.getString("titulo");
					String genero = rs.getString("genero");
					
					juego = new Juego(consola, titulo, genero);
					
					arrayListJuegos.add(juego);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return arrayListJuegos;
	}
	
}
