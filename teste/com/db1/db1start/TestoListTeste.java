package com.db1.db1start;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;



public class TestoListTeste {
	
	@Test
	public void deveRetornarCores() {
		TextoList cores = new TextoList();
		List<String> cor = cores.cores();
		
		Assert.assertEquals(3, cor.size());
		Assert.assertEquals("Azul", cor.get(0));
		Assert.assertEquals("Branco", cor.get(1));
		Assert.assertEquals("Verde", cor.get(2));
		
		Assert.assertTrue(cor.contains("Azul"));
		Assert.assertTrue(cor.contains("Branco"));
		Assert.assertTrue(cor.contains("Verde"));		
	}

}
