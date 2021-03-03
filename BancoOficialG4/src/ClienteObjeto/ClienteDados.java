package ClienteObjeto;

public class ClienteDados { //SUPER
/*aqui colocarei informa��es basicas dos clientes,
	*independente da conta que eles usem.
	*/
//variaveis
	
	public String nomeCliente;
	private String cpfCliente;
	private int numeroContaCliente; //podemos usar ALEATORIO
	private char sexoCliente; //F M O
	private double saldoCliente; 
	private boolean ativaCliente;
	private char contaPoupan�a; //tipoConta
	private char contaCorrente; //tipoConta
	private char contaEspecial; //tipoConta
	private char contaEmpresarial; //tipoConta
	private char contaEstudantil; //tipoConta
	private char tipoConta; //1-poupan�a, 2-corrente, 3-especial, 4-empresarial, 5-estudantil, 6-sair
	
	//construtor

	public ClienteDados(char contaPoupan�a, char contaCorrente, char contaEspecial, char contaEmpresarial,
			char contaEstudantil) {
		super();
		this.contaPoupan�a = contaPoupan�a;
		this.contaCorrente = contaCorrente; //ESSE CONSTRUTOR � VALIDO PARA TODAS CONTAS
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
			this.contaPoupan�a = tipoConta ;
			System.out.println("A conta selecionada foi Poupan�a!");
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
			
			System.out.println("Voc� saiu da opera��o!");
			
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
	} //FIM ESCOLHA TIPO DE TRANSA��O
	
	//criar get e set (ATEN�AO JA RETIREI O SET DO SALDO E DADOS DO CLIENTE)

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
