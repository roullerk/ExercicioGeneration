package APLICATION;

import java.util.Scanner;

import CLASS.CONTA;

public class Teste {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		CONTA conta1 = new CONTA(1,"111.111.111-11");
		
		CONTA conta3 = new CONTA (345, "111.222.333-44", true);
		double valor;
		char option;
		
		System.out.println("Digite o valor: ");
		valor = ler.nextDouble();
		System.out.println("Debito ou credito? D/C");
		option = ler.next().toUpperCase().charAt(0);
		
		if (option == 'D') {
			conta3.debito(valor);
		}
		else if (option == 'C'){
			conta3.credito(valor);
		}
		else {
			System.out.println("Opção inválida!");
		}
		
		System.out.println(conta3.getSaldo());
			
	}

}
