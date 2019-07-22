package com.db1.db1start;

import java.util.ArrayList;
import java.util.List;

public class App {
	
	public static void main(String[] args)
	{
		
		List<String> nomes = new ArrayList<String>();
		
		nomes.add("João");
		nomes.add("Maiko");
		nomes.add("Maria");
		
		System.out.println(nomes);
		
		nomes.remove("João");
		
		System.out.println(nomes);
		
		nomes.add("Fernando");
		
		System.out.println(nomes);
		
		for(String nome : nomes) {
			System.out.println(nome);
		}
		
		List<Integer> numeros = new ArrayList<>();
		
		numeros.add(2);
		numeros.add(4);
		
		System.out.println(numeros);
		
		
		
		int tamanhoDoNome = Nome.quantidadeDeCaracteres("João Guilherme");
		System.out.println("Tamanho do nome é: "+tamanhoDoNome);
		
		Calculadora calculadora = new Calculadora(10,2,11.5,57.1,22.41);
		Calculadora calculadora2 = new Calculadora(11,15,54.2,18.2,63.2);
		
		System.out.println(calculadora.somar());
		System.out.println(calculadora2.subtrair());
		System.out.println(calculadora.multiplicar());
		System.out.println(calculadora.dividir());
		System.out.println(calculadora.par());
		System.out.println(calculadora2.maior());
		System.out.println(calculadora2.impares());
	}
}
