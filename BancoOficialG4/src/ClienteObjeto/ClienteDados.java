package ClienteObjeto;

import java.util.Random;
import java.util.Scanner;

public class ClienteDados { //SUPER
	//atributos
	private int numeroContaCliente;
	private String cpfCliente;
	protected double saldoCliente;
	private boolean ativa;
	
	private double [] movimento = new double[10]; //aqui estou condicionando os movimentos que serão realizados
	Random numeroAleatorio = new Random(); //ja chamei o random pois vamos utilizar mais pra frente
	Scanner ler = new Scanner (System.in); //ja add as bibliotecas chamadas que iremos utilizar
	
	//CONSTRUTOR para chamarmos as VARIAVEIS DAQUI para OUTROS LOCAIS!
	public ClienteDados () {} //verificar se é necessário essa parte, se não excluir

	public ClienteDados(int numeroContaCliente, String cpfCliente) {
		super();
		this.numeroContaCliente = numeroContaCliente;
		this.cpfCliente = cpfCliente;
	}

	public ClienteDados(int numeroContaCliente, String cpfCliente, double saldoCliente, boolean ativa) {
		super();
		this.numeroContaCliente = numeroContaCliente;
		this.cpfCliente = cpfCliente;
		this.saldoCliente = saldoCliente;
		this.ativa = ativa;
	}
	//FIM CONSTRUTOR
	//COMEÇO GET E SET
	public int getNumeroContaCliente() {
		return numeroContaCliente;
	}

	public void setNumeroContaCliente(int numeroContaCliente) {
		this.numeroContaCliente = numeroContaCliente;
	}

	public String getCpfCliente() {
		return cpfCliente;
	}

	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}

	public boolean isAtiva() {
		return ativa;
	}

	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}

	public double getSaldoCliente() {
		return saldoCliente;
	}
	
	// Devemos deixar as movimentações para serem adquiridas e geradas pela classe, por tanto, get e set p/ elas
		public void setMovimento(double movimento[]) {
			this.movimento = movimento;
		}
		
		public double[] getMovimento() {
			return this.movimento;
		}
	//FIM GET E SET
		//COMEÇO METODOS
		//OQ TODA CONTA TERÁ DEBITO E CREDITO
		public void credito(double credito) { //ESTOU COLOCANDO DINHEIRO NA CONTA
			if(credito > 0) {
				this.saldoCliente = this.saldoCliente + credito;
				System.out.printf("O valor R$ %.2f foi inserido em sua conta!\n", credito);
			
				
			}else if(credito == 0) {
				System.out.printf("ATENÇÃO! O valor a ser depositado deve ser maior que R$ 0,00 \n");
				System.out.println("Impossivel completar a transação! Tente outro valor.");
				
			}else if(credito < 0) {
				System.out.printf("O valor informado deve ser positivo!");
				System.out.println("Impossivel completar a transação! Tente outro valor.");
			}
		}
		public void debito(double debito) { //ESTOU TIRANDO DINHEIRO DA CONTA
			if(debito <= this.getSaldoCliente()) {
				this.saldoCliente = this.getSaldoCliente() - debito;
				System.out.printf("Saque solicitado de R$ %.2f realizado! \n", debito);
				System.out.printf("Seu saldo atual é de R$ %.2f \n", this.getSaldoCliente());
				
			}else {
				System.out.printf("Você não possuí saldo suficiente! \n");
			
			}
		}//ESSE BLOCO É O SIMPLES DE DEBITO, IGNORANDO OS LIMITES
		
		//DEBITO PARA CONTAS COM LIMITE
		public void debito(double debito, double limite) {
			System.out.printf("Seu saldo atual é de R$ %.2f \n", this.getSaldoCliente());
		
			
			if(debito <= this.getSaldoCliente() && debito <= limite) {
				this.saldoCliente = this.getSaldoCliente() - debito;
				
				
			}else if(debito > limite){
				System.out.println("O valor solicitado ultrapassa seu limite de credito!");
				
			}else {
				this.saldoCliente = this.getSaldoCliente() - debito;
			
			}
			
		}//FIM DO IF E ELSE RELACIONADO A LIMITE E DEBITO
		//MAIS METODOS
		public void GeraNumeroCliente() {
			this.setNumeroContaCliente(numeroAleatorio.nextInt((999999 - 111111) + 1) + 111111); //VERIFICAR SE FUNCIONA
		}
	
	
	
	
}