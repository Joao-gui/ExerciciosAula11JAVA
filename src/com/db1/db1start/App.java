package com.db1.db1start;

public class App {
	
	public static void main(String[] args)
	{
		int tamanhoDoNome = Nome.quantidadeDeCaracteres("João Guilherme");
		System.out.println("Tamanho do nome é: "+tamanhoDoNome);
		
		Calculadora calculadora = new Calculadora(10,15);
		Calculadora calculadora2 = new Calculadora(11,15);
		
		System.out.println(calculadora.somar());
		System.out.println(calculadora2.subtrair());
		System.out.println(calculadora.multiplicar());
	}
}
