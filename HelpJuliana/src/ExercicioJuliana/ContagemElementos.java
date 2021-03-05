package ExercicioJuliana;

import java.util.Scanner;

public class ContagemElementos {
public static void main (String [] args) {
	
	Scanner ler = new Scanner (System.in);
	
	int N=0;
	int numero [] = new int [N];
	
	do {
		System.out.println("Informe a quantidade de vetores que deseja: ");
		N = ler.nextInt();
		
		for (int i =0;i<=N; i++) {
			
			System.out.printf("Digite o numero do vetor %d: ", (i+1));
			numero[i] = ler.nextInt();
			
		}
		
		
		
	}while (N == 0);
	
}
	
	
}
