package com.db1.db1start;

public class NumeroDouble {
	public static void main (String[] args) {
		Integer menorDe2Valores = MenorMaior.operacao(30, 87);
		Integer menorDe3Valores = MenorMaior.operacao3Numeros(30, 87, 64);
		System.out.println("O menor numero entre 2 é: " +menorDe2Valores +"\n"
				+"Menor entre 3 valores é: "+menorDe3Valores);
		
	}

}
