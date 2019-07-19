package com.db1.db1start;

public class Textos {
	
	private String texto1;	
	
	public Textos (String texto1) {
		this.texto1 = texto1;	
	}
	
	public String letraMaiusculo() {
		return this.texto1.toUpperCase();
	}
	
	public String letraMinuscula() {
		return this.texto1.toLowerCase();
	}
	
	public int numeroLetras() {
		return this.texto1.length();
	}
	
	public int numeroLetrasEspaco() {
		return this.texto1.length();
	}
	
	public int numeroLetrasSemEspaco() {
		return this.texto1.replaceAll(" ", "").length();
	}
	
	public String quatroPrimeirasLetras() {
		return this.texto1.substring(0, 4);
	}

}
