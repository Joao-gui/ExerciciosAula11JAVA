package com.db1.db1start;

public class Calculadora {
	
	private int numero1;
	
	private int numero2;
	
	public Calculadora(int numero1, int numero2) {
		this.numero1 = numero1;
		this.numero2 = numero2;
	}
	
	public int somar() {
		return this.numero1 + this.numero2;
	}
	
	public int subtrair() {
		return this.numero1 - this.numero2;
	}
	
	public int multiplicar() {
		return this.numero1 * this.numero2;
	}

}
