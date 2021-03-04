package ClienteInterface;

import java.util.Scanner;

import ClienteObjeto.ClienteDados;
import ClienteObjeto.ContaEstudantil;

public class ClienteMain {
public static void main(String[] args) {
	Scanner ler=new Scanner (System.in);
			char tipoConta;
			char contaPoupança; //tipoConta
			char contaCorrente; //tipoConta
			char contaEspecial; //tipoConta
			char contaEmpresarial; //tipoConta
			char contaEstudantil; //tipoConta
			double valor;
			char opcao;
			double LimiteEstudantilAtual; 
			//1-poupança, 2-corrente, 3-especial, 4-empresarial, 5-estudantil, 6-sair
			
			
			//ESCOLHA CONTA
		System.out.println(" BANCO DiMadeira ");
		System.out.println(" XXXXXX ");
		System.out.println(" 1 - Conta Poupança\n2 - Conta Corrente\n3 - Conta Especial\n4 - Conta Empresarial\n5 - Estudantil: ");
		tipoConta = ler.next().charAt(0);
		ClienteDados cliente = new ClienteDados(tipoConta);
		
		
		//TESTE
		//System.out.println("Digite o valor:");
		
	
		
		System.out.println("Digite o valor:");
		valor = ler.nextDouble();
		
		
		
		
		
		
		//ESCOLHA TIPO CONTA
		if (tipoConta == '1') {
				contaPoupança = tipoConta ;
				System.out.println("A conta selecionada foi Poupança!");
			}
			if (tipoConta == '2') {
				contaCorrente = tipoConta ;
				System.out.println("A conta selecionada foi Corrente!");
			}
			if (tipoConta == '3') {
				contaEspecial = tipoConta ;
				System.out.println("A conta selecionada foi Especial!");
			}
			if (tipoConta == '4') {
				contaEmpresarial = tipoConta ;
				System.out.println("A conta selecionada foi Empresarial!");
			}
			if (tipoConta == '5') {
				contaEstudantil = tipoConta ;
				System.out.println("A conta selecionada foi Estudantil!");
			}
			if (tipoConta == '6') {
				
				System.out.println("Você saiu da operação!");
			}
			//FIM ESCOLHA DE CONTA
	
	
	
}
}
