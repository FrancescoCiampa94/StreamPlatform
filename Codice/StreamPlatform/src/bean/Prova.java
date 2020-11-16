package bean;

import java.util.Date;

public class Prova {
	private Date data;

	public Prova(Date data) {
		this.data = data;
	}

	public Prova() {
		
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String toString() {
		return "Prova [data=" + data + "]";
	}
	
	
	
}
