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
		calculadora = new Calculadora(10, 5, 11.5, 28.74, 17.5);
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
	
	@Test
	public void retornarMenorValorEntreDoisDoubles() {
		double menorValor = calculadora.menorValorEntreDoisDoubles();
		Assert.assertEquals(11.5, menorValor, 0.0001);
	}
	
	@Test 
	public void retornarMenorValorEntreTresDoubles() {
		double menorValor = calculadora.menorValorEntreTresDoubles();
		Assert.assertEquals(11.5, menorValor, 0.0001);
	}
	
	@Test
	public void mediaDeTresValores() {
		double media = calculadora.mediaDeTresValores();
		Assert.assertEquals(19.2466, media, 0.0001);
	}
	
	@Test
	public void areaTriangulo() {
		double area = calculadora.areaTriangulo();
		Assert.assertEquals(100.625, area, 0.0001);
	}
	

}
