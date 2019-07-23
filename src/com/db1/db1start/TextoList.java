package com.db1.db1start;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


public class TextoList {
	
	
	
	public List<String> cores() {
		List<String> cores = new ArrayList<String>();
		cores.add("Azul");
		cores.add("Branco");
		cores.add("Verde");
		return cores;
	}
	
	public int itens(){
		List<String> itens = new ArrayList<String>();
		itens.add("Caneta");
		itens.add("Lapis");
		itens.add("Borracha");
		return itens.size();
	}
	
	public List<String> remova(){
		List<String> remova = new ArrayList<String>();
		remova.add("Joao");
		remova.add("Maria");
		remova.add("Ana");
		remova.remove(2);
		return remova;
	}
	
	public List<String> nomesCoresOrdenado(){
		List<String> nomes = new ArrayList<String>();
		nomes.add("Azul");
		nomes.add("Branco");
		nomes.add("Verde");
		for(int i=0; i <= nomes.size() - 1; i++) {
			nomes.get(i);
		}
		return nomes;
	}
	
	public List<String> nomesCoresERemover(){
		List<String> cores = new ArrayList<String>();
		cores.add("Azul");
		cores.add("Branco");
		cores.add("Verde");
		cores.remove("Branco");
		return cores;
	}
	
	public List<String> stringDecrescente(){
		List<String> decrescente = new ArrayList<String>();
		decrescente.add("Azul");
		decrescente.add("Branco");
		decrescente.add("Verde");
		Collections.sort(decrescente, Collections.reverseOrder());		
		return decrescente;
	}
	
	public List<List<Integer>> numerosInteiros(){
		List<Integer> numeros = new ArrayList<Integer>();
		List<List<Integer>> todosOsNumeros = new ArrayList<List<Integer>>();
		List<Integer> numerosPares = new ArrayList<Integer>();
		
		numerosPares.add(2);
		numerosPares.add(4);
		
		numeros.add(1);
		numeros.add(2);
		numeros.add(3);
		numeros.add(4);
		todosOsNumeros.add(numeros);
		todosOsNumeros.add(numerosPares);
		
		return todosOsNumeros;
	}

}
