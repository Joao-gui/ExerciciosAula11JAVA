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
	
	public int dividir() {
		return this.numero1 / this.numero2;
	}
	
	public int par() {
		return this.numero1 % 2;
	}
	
	public int maior() {
		if (this.numero1 > this.numero2) {
			return this.numero1;
		}
		else if (this.numero1 < this.numero2) {
			return this.numero2;
		}
		return 0;
	}
	
	public int impares() {
		int count = 0;
		for (int i = this.numero1; i <= 100; i++) {
			if(i%2 != 0) {
				count++;
			}
		}
		return count;
	}

}
