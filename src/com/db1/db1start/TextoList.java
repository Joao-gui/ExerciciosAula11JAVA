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
	
	public Integer somaDeInteiros(){
		List<Integer> numeros = new ArrayList<Integer>();
		int soma = 0;
		numeros.add(1);
		numeros.add(2);
		numeros.add(5);
		
		for(int i = 0; i <= numeros.size() - 1; i++) {
			soma = numeros.get(i) + soma;
		}
		return soma;		
	}
	
	public Double mediaDeDoubles() {
		List<Double> numeros = new ArrayList<Double>();
		double media = 0;
		double soma = 0;
		int cont = 0;
		numeros.add(11.5);
		numeros.add(25.5);
		numeros.add(3.7);
		
		for(int i=0; i<=numeros.size() - 1; i++) {
			soma = numeros.get(i) + soma;
			cont++;
		}
		media = soma/cont;
		return media;
	}
	
	public Integer menorValorInteger() {
		List<Integer> numeros = new ArrayList<Integer>();
				
		numeros.add(2);
		numeros.add(4);
		numeros.add(1);
		numeros.add(5);
		
		int menor = Collections.min(numeros);
		
		return menor;
	}
	
	public Integer maiorValorInteger() {
		List<Integer> numeros = new ArrayList<Integer>();
		
		numeros.add(2);
		numeros.add(4);
		numeros.add(1);
		numeros.add(5);
		
		int maior = Collections.max(numeros);
		
		return maior;		
	}
	
	public List<Integer> removaOsImpares() {
		List<Integer> numeros = new ArrayList<Integer>();
		
		numeros.add(0);
		numeros.add(1);
		numeros.add(2);
		numeros.add(3);
		numeros.add(4);
		
		for(int i = 0; i <= numeros.size() - 1; i++) {
			if(numeros.get(i)%2 != 0) {
				numeros.remove(i);
			}
		}
		return numeros;
	}
	
	public List<String> fraseRetornaVogais(){
		
		List<String> vogais = new ArrayList<String>();
		
		String frase = ("DB1 Start");
		char c;
		
		for(int i = 0; i <= frase.length() - 1; i++) {
			c = frase.charAt(i);
			if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
			{
				String x = String.valueOf(c);
				vogais.add(x);
			}
			
		}
		return vogais;		
	}

}
