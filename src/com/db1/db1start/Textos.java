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
	
	public String apartirDaTerceiraLetra() {
		return this.texto1.substring(3);
	}
	
	public String quatroUltimasLetras() {
		return this.texto1.substring(10);
	}
	
	public String substituiPrimeiroNome() {
		return this.texto1 = this.texto1.replace("Joao", "ALUNO");
	}
	
	public String[] textoSeparadamente() {
		String[] arreyString = this.texto1.split(",");
		return arreyString;
	}
	
	public int numeroVogais() {
		int cont = 0;
		int i = 0;
		for(i = 0; i <= this.texto1.length() - 1; i++) {
			char c = this.texto1.charAt(i);
			if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
			{
				cont++;
			}
			
		}
		return cont;
	}
	
	public String textoInvertido() {
		return this.texto1 = new StringBuilder(texto1).reverse().toString();
	}

}
