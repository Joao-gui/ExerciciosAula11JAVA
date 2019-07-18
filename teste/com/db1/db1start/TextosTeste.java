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
	
	
}
