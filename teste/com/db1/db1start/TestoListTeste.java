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
	
	@Test
	public void deveRetornarAQuantidadeDeItens() {
		TextoList itens = new TextoList();
		int iten = itens.itens();
		
		Assert.assertEquals(3, iten);
		
	}
	
	@Test
	public void deveRemoverOValorDaSegundaPosicao() {
		TextoList remova = new TextoList();
		List<String> remocao = remova.remova();
		
		Assert.assertEquals(2, remocao.size());
		Assert.assertEquals("Joao", remocao.get(0));
		Assert.assertEquals("Maria", remocao.get(1));
		
		Assert.assertTrue(remocao.contains("Joao"));
		Assert.assertTrue(remocao.contains("Maria"));
		
	}
	
	@Test
	public void deveRetornarNomesDasCores() {
		TextoList nomes = new TextoList();
		List<String> novoNome = nomes.nomesCoresOrdenado();
		
		Assert.assertEquals(3, novoNome.size());
		Assert.assertEquals("Azul", novoNome.get(0) );
		Assert.assertEquals("Branco", novoNome.get(1));
		Assert.assertEquals("Verde", novoNome.get(2));
		
		Assert.assertTrue(novoNome.contains("Azul"));
		Assert.assertTrue(novoNome.contains("Branco"));
		Assert.assertTrue(novoNome.contains("Verde"));
	}
	
	@Test
	public void deveRetornarAsCoresERemoverUma() {
		TextoList cores = new TextoList();
		List<String> novasCores = cores.nomesCoresERemover();
		
		Assert.assertEquals(2, novasCores.size());
		Assert.assertEquals("Azul", novasCores.get(0));
		Assert.assertEquals("Verde", novasCores.get(1));
		
		Assert.assertTrue(novasCores.contains("Azul"));
		Assert.assertTrue(novasCores.contains("Verde"));
	}
	
	@Test
	public void deveRetornarOrdenadoFormaDecrescente() {
		TextoList decrescente = new TextoList();
		List<String> dec = decrescente.stringDecrescente();
		
		Assert.assertEquals(3, dec.size());
		Assert.assertEquals("Verde", dec.get(0));
		Assert.assertEquals("Branco", dec.get(1));
		Assert.assertEquals("Azul", dec.get(2));
		
		Assert.assertTrue(dec.contains("Verde"));
		Assert.assertTrue(dec.contains("Branco"));
		Assert.assertTrue(dec.contains("Azul"));
		
	}
	
	@Test
	public void deveRetornarPareImpar() {
		TextoList numeros = new TextoList();
		List<List<Integer>> num = numeros.numerosInteiros();
		
		Assert.assertEquals(, num);
	}

}
