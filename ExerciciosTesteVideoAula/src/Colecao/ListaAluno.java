package Colecao;

import java.util.HashSet;
import java.util.Set;

public class ListaAluno {
public static void main (String [] args) {
	
	Set<Aluno> conjunto = new HashSet<Aluno>(); //pra saber onde vou buscar
	Aluno a= new Aluno ("Mafagafo", "Java",6.8 );
	Aluno b= new Aluno ("P4nda", "Linux",10.0 );
	Aluno c= new Aluno ("Bruno", "Google",0.0 );
	Aluno d= new Aluno ("Jaque", "Java",6.8 );
	
	conjunto.add(a);
	conjunto.add(b);
	conjunto.add(c);
	conjunto.add(d);
	
	System.out.println(conjunto);
}
}
