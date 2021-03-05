

	package default;

	import java.util.Random;
	import java.util.Scanner;

	public class ProjetoTeste {
		Scanner leia = new Scanner(System.in);
		private int numero = 0;//numero da conta que vai ser criado
		private int numeroconta = 0;//criado para salvar o numero da conta e criar um  get, para eu poder mostrar na tela o numero da conta sem rodar um aleatorio denovo
		private String cpf = " ";//cpf do cidadão
		private Double saldo = 0.00;//valor do saldo, só pode ser manipulado atraves de débito e crédito
		private boolean ativa;//ve se a conta esta ativa(não usei no programa, devo colocar mais tarde)
		private String nome = " ";//retornar o nome do cidadão
		private Random gerador = new Random();//gera um numero da conta aleatorio, até 2000
		private Double limiteEstudantil = 5000.0;//limite estudantil de 5000 reais
		protected double valor = 0.0;//inicializei valor mas não sei pq, vai q da problema em algo
		private int opcao;//caso escolham usar o limite estudantil
		private int opcao2;//caso desejem usar o saldo para juntar com o limite estudantil e fazer o débito
		private int contador;//contador para contar o numero de transações
		
		//métodos-encapsulamento:
		
		//contador de transações
		public int getContador() {
			return contador;
		}
		//numero da conta criado aleatoriamente até 2000
		public int getNumero() {
			numero = gerador.nextInt(2000);
			return numero;
		}
		//criado para salvar o numero da conta e não rodar denovo
		public int getNumeroconta() {
			numeroconta=numero;
			return numeroconta;
		}
		// retornar o numero de cpf q ele botar
		public String getCpf() {
			return cpf;
		}
		// retornar o saldo
		public Double getSaldo() {
			return saldo;
		}
		// retornar se a conta ta ativa, não usei
		public boolean isAtiva() {
			return ativa;
		}
		// retornar o limite estudantil
		public Double getlimiteEstudantil(){
			return limiteEstudantil;
		}
			
		// conta ta ativa
		public void setAtiva(boolean ativa) {
			this.ativa = ativa;
		}
		// aqui ele retorna o nome que você colocou la na sua conta
			public String getNome() {
				return nome;
			}
		// Construtores:
		// aqui a conta pode ser criada com cpf, estado da conta e nome, no caso eu não utilizei, só utilizei cpf e nome.
		public Conta(int numero, String cpf,String nome, boolean ativa) {
			numero = gerador.nextInt(2000);
			this.cpf = cpf;
			this.ativa = ativa;
			this.nome = nome;
		}
		
		// aqui é outro método, onde eu q crio o numero da conta e ela não gera aleatorio, tbm n usei
		public Conta(int numero, String cpf)  {
			this.numero = numero;
			this.cpf = cpf;
		}
		// aqui é oq eu usei, a conta é criada com nome, numero e cpf lembrando que o numero é gerado aleatório
		public Conta(String nome, int numero, String cpf) {
			numero = gerador.nextInt(2000);
			this.cpf = cpf;
			this.nome = nome;
		}
		// como vai ser debitado o valor da conta
		public void debito(double valor) {
			if(this.saldo>=valor) {
				this.saldo = this.saldo - valor;
				contador++;
			}
			// aqui ele tenta debitar mas o valor que tem na conta e no limite estudantil é menor do q a conta q ele qr pagar(debito)
			else if(valor>saldo && valor>limiteEstudantil+saldo) {
				System.out.println("Você não possui saldo nem limite estudantil suficiente para debitar esse valor.");
			}
			// aqui ele ve que a conta é maior que o saldo da conta dele, então ele pergunta se quer utilizar o limite estudantil pra pagar a conta
			else if(valor>this.saldo && valor<=limiteEstudantil+saldo) {
					System.out.println("O saldo é menor do que o valor a ser debitado, deseja usar o Limite Estudantil?\n[1]Sim\n[2]Nao");
					opcao = leia.nextInt();
						if(opcao == 1 && saldo<=0) {// aqui ele paga só com o valor do limite estudatil, ja que o saldo é 0
							this.limiteEstudantil = this.limiteEstudantil - valor;
							contador++;
						}
						if(opcao == 1 && saldo>0) {// aqui ele checa se tem algo no saldo, e pergunta se qr utilizar o saldo pra completar pra pagar a conta
							System.out.printf("Você possui %.2f de saldo, deseja usar esse saldo para completar o débito?\n[1]Sim\n[2]Não",this.saldo);
							opcao2 = leia.nextInt();
								if(opcao2 ==1) {// aqui se você aceitar, ele zera o saldo e desconta o resto na conta estudantil
									valor = valor - this.saldo;
									this.saldo = this.saldo - this.saldo;
									this.limiteEstudantil = this.limiteEstudantil - valor;
									contador++;
								}
								else {// aqui se você recusar a usar o saldo que tem, ele checa se a conta é maior que o limite estudantil e bloqueia o débito se for
									if(valor > this.limiteEstudantil) {
										System.out.println("Você não possui limite estudantil o suficiente para completar a transação.");
									}
									else {//aqui se a conta for menor que o limite estudantil, ele debita do limite sem mexer no saldo
										this.limiteEstudantil = this.limiteEstudantil - valor;
										contador++;
									}
									
								}
							
						}
						// aqui ele volta se vc dizer que não pra pergunta da linha 91, no caso ele bloqueia o débito 
						//pq o saldo é menor que a conta e vc nao qr usar o limite estudantil
						if(opcao == 2) {
							
						}
				}
		}
		// aqui é a formula do crédito
		public  void credito(double valor) {
			this.saldo = this.saldo + valor;
			contador++;
		}
		

	}
}
