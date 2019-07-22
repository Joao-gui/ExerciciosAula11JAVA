package com.db1.db1start;

import org.junit.Assert;
import org.junit.Test;


public class TextosTeste {

	@Test
	public void letraMaiuscula() {
		Textos textos = new Textos("joao guilherme");
		String texto = textos.letraMaiusculo();
		Assert.assertEquals("JOAO GUILHERME", texto);		
	}
	
	@Test
	public void letraMinuscula() {
		Textos textos = new Textos("JOAO GUILHERME");
		String texto = textos.letraMinuscula();
		Assert.assertEquals("joao guilherme", texto);
	}
	
	@Test
	public void numeroLetras() {
		Textos textos = new Textos("DB1START");
		Integer texto = textos.numeroLetras();
		Assert.assertEquals(8, texto, 0.001);
	}
	
	@Test
	public void numeroLetrasEspaco() {
		Textos textos = new Textos(" DB1START ");
		int texto = textos.numeroLetrasEspaco();
		Assert.assertEquals(10, texto);
	}
	
	@Test
	public void numeroLetrasSemEspaco() {
		Textos textos = new Textos(" DB1START ");
		int texto = textos.numeroLetrasSemEspaco();
		Assert.assertEquals(8, texto);
	}
	
	@Test
	public void quatroPrimeirasLetras() {
		Textos textos = new Textos("Joao Guilherme");
		String texto = textos.quatroPrimeirasLetras();
		Assert.assertEquals("Joao", texto);
	}
	
	@Test
	public void apartirDaTerceiraLetra() {
		Textos textos = new Textos("Joao Guilherme");
		String texto = textos.apartirDaTerceiraLetra();
		Assert.assertEquals("o Guilherme", texto);
	}
	
	@Test
	public void quatroUltimasLetras() {
		Textos textos = new Textos("Joao Guilherme");
		String texto = textos.quatroUltimasLetras();
		Assert.assertEquals("erme", texto);
	}
	
	@Test
	public void substituaPrimeiroNome() {
		Textos textos = new Textos("Joao Guilherme");
		String texto = textos.substituiPrimeiroNome();
		Assert.assertEquals("ALUNO Guilherme", texto);
	}
	
	@Test
	public void textoSeparadamente() {
		Textos textos = new Textos("Banana, maça, melancia");
		String[] arreyString = textos.textoSeparadamente();
		String[] esperado = {"Banana", " maça", " melancia"};
		Assert.assertArrayEquals(esperado, arreyString);
	}
	
	@Test
	public void numeroVogais() {
		Textos textos = new Textos("aeis");
		int texto = textos.numeroVogais();
		Assert.assertEquals(3, texto);
	}
	
	@Test
	public void textoInvertido() {
		Textos textos = new Textos("Joao");
		String texto = textos.textoInvertido();
		Assert.assertEquals("oaoJ", texto);
	}
	
	
}
