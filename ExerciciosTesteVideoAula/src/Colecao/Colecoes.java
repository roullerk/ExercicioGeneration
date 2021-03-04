package Colecao;

import java.util.ArrayList;
import java.util.Collection;

public class Colecoes {
public static void main (String[] args) {
	
	Collection <String> nomes = new ArrayList();
	nomes.add ("Mario");
	nomes.add ("Juliana");
	nomes.add ("Rafa");
	System.out.println("Contem o nome Maria?"+nomes.contains("Maria"));
	System.out.println("Lista: "+nomes);
	/*System.out.println("Lista de nomes: "+nomes);
	nomes.clear();
	System.out.println("Lista de nomes: "+nomes);*/
	/*if(nomes.isEmpty()) {
		System.out.println("Lista vazia...");
	}else {
		System.out.println("Lista de nomes: "+nomes);
	}*/
	
	
	
}
}
