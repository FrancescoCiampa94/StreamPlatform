package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connessione {
	private Connection con;
	private String url="jdbc:mysql://localhost:3306/streamplatform?&serverTimezone=UTC";
	private String user="root";
	private String password="";
	
	public Connessione() throws SQLException {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver trovato OK");
		} catch (ClassNotFoundException e) {
			System.out.println("driver non trovato");
		}
		con=DriverManager.getConnection(url, user, password);
	}
	
	public Connection getConnessione() {
		return this.con;
	}

}
