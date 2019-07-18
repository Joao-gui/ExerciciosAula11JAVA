package com.db1.db1start;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculadoraTeste {
	
	//Field
	private Calculadora  calculadora;
	
	//Vai rodar o Before antes de rodar o Programa
	@Before
	public void serUp() {
		calculadora = new Calculadora(10, 5);
	}
	
	@Test
	public void deveSomarDoisValores() {
		int soma = calculadora.somar();
		Assert.assertEquals(15, soma);
	}
	
	@Test
	public void deveSubtrairDoisValores() {
		int subtrair = calculadora.subtrair();
		Assert.assertEquals(5, subtrair);
	}
	
	@Test
	public void deveMultiplicarDoisValores() {
		int multiplicar = calculadora.multiplicar();
		Assert.assertEquals(50, multiplicar);
	}
	
	@Test
	public void deveDividirDoisValores() {
		int dividir = calculadora.dividir();
		Assert.assertEquals(2, dividir);
	}
	
	@Test
	public void deveRetornarNumeroPar() {
		int par = calculadora.par();
		Assert.assertEquals(0, par);
	}
	
	@Test
	public void deveRetornarMaiorNumeroDeDois() {
		int maior = calculadora.maior();
		Assert.assertEquals(10, maior);
	}
	
	@Test
	public void deveRetornarQuantidadeDeNumerosImpares() {
		int impares = calculadora.impares();
		Assert.assertEquals(45, impares);
	}

}
