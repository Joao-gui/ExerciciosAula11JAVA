package com.db1.db1start;

import java.util.ArrayList;
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

}