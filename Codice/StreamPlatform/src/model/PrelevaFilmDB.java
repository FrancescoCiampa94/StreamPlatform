package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bean.FilmDB;
import bean.Prova;

public class PrelevaFilmDB {
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	private ArrayList<FilmDB>filmList;
	
	
	public ArrayList<FilmDB> prelevaTuttiFilm() throws SQLException {
		Connessione c= new Connessione();
		con=c.getConnessione();
		filmList=new ArrayList<>();
		FilmDB film=new FilmDB();
		String query="SELECT * FROM film";
		ps=con.prepareStatement(query);
		rs=ps.executeQuery();
		while(rs.next()) {
			film.setId(rs.getInt("id"));
			film.setTitolo(rs.getString("titolo"));
			film.setImmagine(rs.getString("immagine"));
			film.setAnnoUscita(rs.getDate("anno"));
			film.setDurata(rs.getInt("durata"));
			film.setRegisti(rs.getString("registi"));
			film.setAttori(rs.getString("attori"));
			film.setGenere(rs.getString("genere"));
			film.setLingua(rs.getString("lingua"));
			film.setTrailer(rs.getString("trailer"));
			film.setDescrizione(rs.getString("descrizione"));
			film.setDataAggiunta(rs.getDate("dataAggiunta"));
			film.setPrezzo(rs.getDouble("prezzo"));
			filmList.add(film);
			film=new FilmDB();
		}
		return filmList;
	}

}
