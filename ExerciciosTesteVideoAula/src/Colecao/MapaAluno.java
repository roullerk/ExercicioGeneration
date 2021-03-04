package Colecao;

import java.util.Map;
import java.util.TreeMap;

public class MapaAluno {

		public static void main(String[] args) {
			Map<String, Aluno> mapa = new TreeMap <String, Aluno>();
			
			Aluno a= new Aluno ("Mafagafo", "Java",6.8 );
			Aluno b= new Aluno ("P4nda", "Linux",10.0 );
			Aluno c= new Aluno ("Bruno", "Google",0.0 );
			Aluno d= new Aluno ("Jaque", "Java",6.8 );
		}
	
}
