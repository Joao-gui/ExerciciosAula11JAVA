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
	
	
}
