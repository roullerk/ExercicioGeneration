package ClienteObjeto;

public class ContaEstudantil extends ClienteDados {

	
	private double LimiteEstudantil=5000.00;
	
//CONSTRUTOR DA SUB
	public ContaEstudantil(char tipoConta, double limiteEstudantil) {
		super(tipoConta);
		LimiteEstudantil = limiteEstudantil;
	}
	//FIM DO CONSTRUTOR SUB
	
	//METODO
	public void UsoLimite(double valor) {
		if (saldoCliente<0) {
			this.LimiteEstudantil = this.LimiteEstudantil + valor;
			System.out.println("O seu limite disponível atual é: "+LimiteEstudantil);
		}
		else {
			System.out.println("Você ainda não gastou seu limite!\nLimite atual: "+ LimiteEstudantil);
		}
	}//FIM METODO
		
	
	
	
	//ENCAPSULAMENTO
	public double getLimiteEstudantil() {
		return LimiteEstudantil;
	}
	public void setLimiteEstudantil(double limiteEstudantil) {
		LimiteEstudantil = limiteEstudantil;
	}//ENCAPSULAMENTO
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//CONSTRUTOR
	//public ContaEstudantil(int numeroContaCliente, double limiteEstudantil) {
		//super(numeroContaCliente);
		//LimiteEstudantil = limiteEstudantil;
	//}
	
		//CONSTRUTOR SOBRECARGA
	/*	public ContaEstudantil(String cpfCliente, int numeroContaCliente, boolean ativaCliente, double limiteEstudantil) {
		super(cpfCliente, numeroContaCliente, ativaCliente);
		this.LimiteEstudantil = limiteEstudantil;
	}
		
		public ContaEstudantil(char tipoConta) {
			super(tipoConta);
		}
		//METODO
		public void EmprestimoEstudantil  (double LimiteEstudantilAtual) {
			LimiteEstudantilAtual = this.LimiteEstudantil + (super.saldoCliente);
		}
		//LimiteEstudantilAtual = LimiteEstudantil + (clienteSaldo);
		//X = 5.000 + (2000)

	public double getLimiteEstudantil() {
		return LimiteEstudantil;
	}*/

	}
	

