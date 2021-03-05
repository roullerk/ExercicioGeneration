package ClienteObjeto;

import java.util.Random;

public class ObjetoEstudante {
	
	private String nomeCliente;
	private char tipoConta;
	private int contador;
	private String cpfCliente;
	protected double saldoCliente;
	private boolean ativa;
	private double limiteEstudantil;
	private int numeroConta;
	Random aleatorio = new Random();
	
	
	
	//CONSTRUTOR - VOU PERGUNTAR ISSO PARA O CLIENTE NA MINHA MAIN!!!
	public ObjetoEstudante(String nomeCliente, String cpfCliente) {
		super();
		this.nomeCliente = nomeCliente;
		this.cpfCliente = cpfCliente;
	}
	
	public ObjetoEstudante(String nomeCliente, String cpfCliente, int numeroConta) {
		super();
		this.nomeCliente = nomeCliente;
		this.cpfCliente = cpfCliente;
		//numeroConta = aleatorio.nextInt(1000);
		
	}
	//FIM CONSTRUTOR

	
	//SET E GET
	public int getNumeroConta() {
		numeroConta = aleatorio.nextInt(1000);
		return numeroConta ;
	}
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta; //= aleatorio.nextInt(1000);;
	}
	
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public char getTipoConta() {
		return tipoConta;
	}
	public void setTipoConta(char tipoConta) {
		this.tipoConta = tipoConta;
	}
	public int getContador() {
		return contador;
	}
	public void setContador(int contador) {
		this.contador = contador;
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
	public double getLimiteEstudantil() {
		return limiteEstudantil;
	}
	public void setLimiteEstudantil(double limiteEstudantil) {
		this.limiteEstudantil = limiteEstudantil;
	}
	public double getSaldoCliente() {
		return saldoCliente;
	}
	
	
	//FIM GET E SET

	//INICIO METODO
	public void credito(double credito) { //ESTOU COLOCANDO DINHEIRO NA CONTA
		
		if(credito > 0) {
			this.saldoCliente = this.saldoCliente + credito;
			System.out.printf("O valor R$ %.2f foi inserido em sua conta!\n", credito);
		}
		else if(credito == 0) {
			System.out.printf("ATENÇÃO! O valor a ser depositado deve ser maior que R$ 0,00 \n");
			System.out.println("Impossivel completar a transação! Tente outro valor.");
			
		}else if(credito < 0) {
			System.out.printf("O valor informado deve ser positivo!");
			System.out.println("Impossivel completar a transação! Tente outro valor.");
		}
	}
	public void debito(double debito) { //ESTOU TIRANDO DINHEIRO DA CONTA
		if(debito <= this.getSaldoCliente()) 
		{
			this.saldoCliente = this.getSaldoCliente() - debito;
			System.out.printf("Saque solicitado de R$ %.2f realizado! \n", debito);
			System.out.printf("Seu saldo atual é de R$ %.2f \n", this.getSaldoCliente());
			
		}else {
			System.out.printf("Você não possuí saldo suficiente! \n");
		
		}
	}
	
	
	
	
}
