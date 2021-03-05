package ClienteInterface;

import java.util.Random;
import java.util.Scanner;

import ClienteObjeto.ObjetoEstudante;

public class ContaEstudantil {
public static void main(String [] args) {
	Scanner leia = new Scanner (System.in);
	
	 String nomeCliente;
	 char opcao;
	 char tipoConta;
	 int contador;
	 String cpfCliente;
	 double saldoCliente;
	 boolean ativa;
	 double limiteEstudantil; // aqui muda de tpo de conta para tipo de conta
	 int numeroConta=0;
	
	
	 
	System.out.println("BEM-VINDO AO BANCO DiMAdeira");
	System.out.println("SLOGAN");
	
	System.out.println("Deseja Ativar a conta? 1 - Ativar ou qualquer tecla para sair");
	opcao = leia.next().toUpperCase().charAt(0);
	
	if (opcao == '1') {
	System.out.println("Escolha seu tipo de conta: ");
	System.out.println("1 - Conta Poupança\n2 - Conta Corrente\n3 - Conta Especial\n4 - Conta Empresarial\n5 - Estudantil: ");
	tipoConta = leia.next().charAt(0);
	
	
	//ESCOLHA TIPO CONTA
		if (tipoConta == '1') {
				
				System.out.println("A conta selecionada foi Poupança!");
			}
			if (tipoConta == '2') {
				
				System.out.println("A conta selecionada foi Corrente!");
			}
			if (tipoConta == '3') {
				
				System.out.println("A conta selecionada foi Especial!");
			}
			if (tipoConta == '4') {
				
				System.out.println("A conta selecionada foi Empresarial!");
			}
			if (tipoConta == '5') {
				
				System.out.println("A conta selecionada foi Estudantil!");
				
				System.out.println("Informe seu nome: ");
				nomeCliente = leia.next();
				
				System.out.println("Informe seu CPF: ");
				cpfCliente = leia.next();
				
				ObjetoEstudante estudante = new ObjetoEstudante (nomeCliente, cpfCliente, numeroConta);
					
				System.out.printf("Olá Sr(a) %s , o numero da sua conta é: %d", nomeCliente, estudante.getNumeroConta());
			
				
				//LOOPING
				do {
					
				System.out.println("Qual operação deseja realizar? ");
			
				System.out.println("1 - Credito (Adicionar valor a conta): ");
			
				System.out.println("2 - Debito (retirar valor da conta): ");
				opcao = leia.next().charAt(0);
				
				if (opcao != '1' && opcao != '2') {
					
					System.out.println("Opção selecionada INVALIDA!");
				}
				if (opcao == '1') {
					
					estudante.credito(0);
					
				}
				
				
				
				
				
				
				
				}while (opcao != '1' && opcao != '2');  //FINAL LOOPING
				
				
			}
			if (tipoConta == '6') {
				
				System.out.println("Você saiu da operação!");
			}
			//FIM ESCOLHA DE CONTA
	
	
	
	
}
	else {
		System.out.println("Você encerrou a operação!");
	}
}

	
}


	

