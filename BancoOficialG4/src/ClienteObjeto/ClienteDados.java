package ClienteObjeto;

public class ClienteDados { //SUPER
/*aqui colocarei informações basicas dos clientes,
	*independente da conta que eles usem.
	*/
//variaveis
	
	public String nomeCliente;
	private String cpfCliente;
	private int numeroContaCliente; //podemos usar ALEATORIO
	private char sexoCliente; //F M O
	private double saldoCliente; 
	private boolean ativaCliente;
	private char contaPoupança; //tipoConta
	private char contaCorrente; //tipoConta
	private char contaEspecial; //tipoConta
	private char contaEmpresarial; //tipoConta
	private char contaEstudantil; //tipoConta
	private char tipoConta; //1-poupança, 2-corrente, 3-especial, 4-empresarial, 5-estudantil, 6-sair
	
	//construtor

	public ClienteDados(char contaPoupança, char contaCorrente, char contaEspecial, char contaEmpresarial,
			char contaEstudantil) {
		super();
		this.contaPoupança = contaPoupança;
		this.contaCorrente = contaCorrente; //ESSE CONSTRUTOR É VALIDO PARA TODAS CONTAS
		this.contaEspecial = contaEspecial;
		this.contaEmpresarial = contaEmpresarial;
		this.contaEstudantil = contaEstudantil;
	}
	public ClienteDados(char tipoConta) {
		this.tipoConta = tipoConta;
	}
	//ESCOLHA CONTA
	public void tipoConta (char tipoConta) {
		if (tipoConta == '1') {
			this.contaPoupança = tipoConta ;
			System.out.println("A conta selecionada foi Poupança!");
		}
		if (tipoConta == '2') {
			this.contaCorrente = tipoConta ;
			System.out.println("A conta selecionada foi Corrente!");
		}
		if (tipoConta == '3') {
			this.contaEspecial = tipoConta ;
			System.out.println("A conta selecionada foi Especial!");
		}
		if (tipoConta == '4') {
			this.contaEmpresarial = tipoConta ;
			System.out.println("A conta selecionada foi Empresarial!");
		}
		if (tipoConta == '5') {
			this.contaEstudantil = tipoConta ;
			System.out.println("A conta selecionada foi Estudantil!");
		}
		if (tipoConta == '6') {
			
			System.out.println("Você saiu da operação!");
			
		}
	}
	//FIM ESCOLHA DE CONTA
	
	//METODOS DEBITO E CREDITO - BASICO TODA CONTA TEM
	public  void credito(double valor) {
		this.saldoCliente = this.saldoCliente + valor;
	}
	public void debito(double valor) {
		if(this.saldoCliente>=valor) 
		{
			
		this.saldoCliente = this.saldoCliente - valor;
		}
		else {
			System.out.println("Saldo insuficiente!");
		}
	} //FIM ESCOLHA TIPO DE TRANSAÇÃO
	
	//criar get e set (ATENÇAO JA RETIREI O SET DO SALDO E DADOS DO CLIENTE)

	public boolean isAtivaCliente() {
		return ativaCliente;
	}

	public void setAtivaCliente(boolean ativaCliente) {
		this.ativaCliente = ativaCliente;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public String getCpfCliente() {
		return cpfCliente;
	}

	public int getNumeroContaCliente() {
		return numeroContaCliente;
	}

	public char getSexoCliente() {
		return sexoCliente;
	}

	public double getSaldoCliente() {
		return saldoCliente;
	}
	//fim get e set
	
}
