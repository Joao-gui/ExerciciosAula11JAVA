package com.db1.db1start;

public class NumeroDouble {
	public static void main (String[] args) {
		Double valor1 = 87.5;
		Double valor2 = 55.47;
		Double valor3 = 48.2;
		Double menorDe2Valores = MenorMaior.operacao(valor1, valor2);
		Double menorDe3Valores = MenorMaior.operacao3Numeros(valor1, valor2, valor3);
		System.out.println("O menor numero entre " +valor1+" e "+valor2 +" é " +menorDe2Valores +"\n"
				+"Menor entre "+valor1+ ", "+valor2+" e "+valor3+" é: "+menorDe3Valores);
		
	}

}
