package Model;

import java.io.Serializable;

public class Juego implements Serializable{

	String titulo, consola, genero;

	public Juego(String consola, String titulo, String genero) {
		//super();
		this.titulo = titulo;
		this.consola = consola;
		this.genero = genero;
	}
	
	

	public Juego() {
		//super();
	}



	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getConsola() {
		return consola;
	}

	public void setConsola(String consola) {
		this.consola = consola;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
}
