package com.db1.db1start;

import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTeste {
	
	@Test
	public void deveSomarDoisValores() {
		Calculadora calculadora = new Calculadora(12, 13);
		int soma = calculadora.somar();
		Assert.assertEquals(25, soma);
	}
	
	@Test
	public void deveSubtrairDoisValores() {
		Calculadora calculadora = new Calculadora(5, 4);
		int subtrair = calculadora.subtrair();
		Assert.assertEquals(1, subtrair);
	}
	
	@Test
	public void deveMultiplicarDoisValores() {
		Calculadora calculadora = new Calculadora(5, 5);
		int multiplicar = calculadora.multiplicar();
		Assert.assertEquals(25, multiplicar);
	}
	
	@Test
	public void deveDividirDoisValores() {
		Calculadora calculadora = new Calculadora(10, 2);
		int dividir = calculadora.dividir();
		Assert.assertEquals(5, dividir);
	}
	

}
