package com.db1.db1start;

public class Numeros {
	public static void main (String[] args) {
		Integer resultadoSoma = Soma_Subtracao.operacao_soma(2, 5);
		Integer resultadoSubtracao = Soma_Subtracao.operacao_subtracao(2, 5);
		System.out.println("A soma dos numero 2 e 5 é: " +resultadoSoma +"\n"
				+"E a subtração dos numero 2 e 5 é: "+resultadoSubtracao);
		
	}
}
