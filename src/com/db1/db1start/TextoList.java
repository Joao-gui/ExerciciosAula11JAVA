package com.db1.db1start;

import java.util.ArrayList;
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
		List<Integer> numerosImpares = new ArrayList<Integer>();
		
		numerosPares.add(2);
		numerosPares.add(4);
		
		numerosImpares.add(1);
		numerosImpares.add(3);
		
		numeros.add(1);
		numeros.add(2);
		numeros.add(3);
		numeros.add(4);
		
		todosOsNumeros.add(numeros);
		todosOsNumeros.add(numerosPares);
		todosOsNumeros.add(numerosImpares);
		
		return todosOsNumeros;
	}
	
	public List<List<String>> nomesOrdenados(){
		List<List<String>> todosOsNomes = new ArrayList<List<String>>();
		List<String> nomesComLetraA = new ArrayList<String>();
		List<String> nomesComLetraC = new ArrayList<String>();
		List<String> nomesComLetraJ = new ArrayList<String>();
		List<String> nomesComLetraM = new ArrayList<String>();
		List<String> nomesComLetraR = new ArrayList<String>();
		List<String> nomesComLetraV = new ArrayList<String>();
		List<String> nomesComLetraW = new ArrayList<String>();
		
		nomesComLetraA.add("Ana");
		nomesComLetraA.add("Ana Laura");
		
		nomesComLetraC.add("Clecio");
		
		nomesComLetraJ.add("Jose");
		nomesComLetraJ.add("José");
		nomesComLetraJ.add("Joaldo");
		nomesComLetraJ.add("José");
		
		nomesComLetraM.add("Maria");
		nomesComLetraM.add("Marcos");
		
		nomesComLetraR.add("Rodolfo");
		nomesComLetraR.add("Roberval");
		nomesComLetraR.add("Rodolpho");
		
		nomesComLetraV.add("Vagner");
		
		nomesComLetraW.add("Wagner");
		
		todosOsNomes.add(nomesComLetraA);
		todosOsNomes.add(nomesComLetraC);
		todosOsNomes.add(nomesComLetraJ);
		todosOsNomes.add(nomesComLetraM);
		todosOsNomes.add(nomesComLetraR);
		todosOsNomes.add(nomesComLetraV);
		todosOsNomes.add(nomesComLetraW);
		
		return todosOsNomes;
		
	}

}
