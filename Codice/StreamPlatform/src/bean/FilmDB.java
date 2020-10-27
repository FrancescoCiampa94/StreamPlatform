package bean;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FilmDB{
	private String titolo;
	private String immagine;
	private Date annoUscita;
	private int durata;
	private String registi;
	private String attori;
	private String genere;
	private String lingua;
	private String trailer;
	private String descrizione;
	private Date dataAggiunta;
	private double prezzo;
		
	
		public FilmDB() {
		
		}


		public FilmDB(String titolo, String immagine, Date annoUscita, int durata, String registi, String attori,
				String genere, String lingua, String trailer, String descrizione, Date dataAggiunta, double prezzo) {
			this.titolo = titolo;
			this.immagine = immagine;
			this.annoUscita = annoUscita;
			this.durata = durata;
			this.registi = registi;
			this.attori = attori;
			this.genere = genere;
			this.lingua = lingua;
			this.trailer = trailer;
			this.descrizione = descrizione;
			this.dataAggiunta = dataAggiunta;
			this.prezzo = prezzo;
		}


		public String getTitolo() {
			return titolo;
		}


		public void setTitolo(String titolo) {
			this.titolo = titolo;
		}


		public String getImmagine() {
			return immagine;
		}


		public void setImmagine(String immagine) {
			this.immagine = immagine;
		}


		public Date getAnnoUscita() {
			return annoUscita;
		}


		public void setAnnoUscita(Date annoUscita) {
			SimpleDateFormat format= new SimpleDateFormat("yyyy/MM/dd");
			this.annoUscita = annoUscita;
		}


		public int getDurata() {
			return durata;
		}


		public void setDurata(int durata) {
			this.durata = durata;
		}


		public String getRegisti() {
			return registi;
		}


		public void setRegisti(String registi) {
			this.registi = registi;
		}


		public String getAttori() {
			return attori;
		}


		public void setAttori(String attori) {
			this.attori = attori;
		}


		public String getGenere() {
			return genere;
		}


		public void setGenere(String genere) {
			this.genere = genere;
		}


		public String getLingua() {
			return lingua;
		}


		public void setLingua(String lingua) {
			this.lingua = lingua;
		}


		public String getTrailer() {
			return trailer;
		}


		public void setTrailer(String trailer) {
			this.trailer = trailer;
		}


		public String getDescrizione() {
			return descrizione;
		}


		public void setDescrizione(String descrizione) {
			this.descrizione = descrizione;
		}


		public Date getDataAggiunta() {
			return dataAggiunta;
		}


		public void setDataAggiunta(Date dataAggiunta) {
			this.dataAggiunta = dataAggiunta;
		}


		public double getPrezzo() {
			return prezzo;
		}


		public void setPrezzo(double prezzo) {
			this.prezzo = prezzo;
		}


		public String toString() {
			return "FilmDB [titolo=" + titolo + ", immagine=" + immagine + ", annoUscita=" + annoUscita + ", durata="
					+ durata + ", registi=" + registi + ", attori=" + attori + ", genere=" + genere + ", lingua="
					+ lingua + ", trailer=" + trailer + ", descrizione=" + descrizione + ", dataAggiunta="
					+ dataAggiunta + ", prezzo=" + prezzo + "]";
		}
		
		
}
