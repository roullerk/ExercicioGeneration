package ClienteObjeto;

public class ClienteDados { //SUPER
/*aqui colocarei informações basicas dos clientes,
	*independente da conta que eles usem.
	*/
//variaveis
	//ATRIBUTOS
	public String nomeCliente;
	private String cpfCliente;
	private int numeroContaCliente; //podemos usar ALEATORIO
	private char sexoCliente; //F M O
	protected double saldoCliente; 
	private boolean ativaCliente;
	private int dia, mes, ano; //ANIVERSARIOCLIENTE
	private char tipoConta;
	//FIM ATRIBUTOS
	
	//construtor
		public ClienteDados(String cpfCliente, int numeroContaCliente, boolean ativaCliente) {
		super();
		this.cpfCliente = cpfCliente;
		this.numeroContaCliente = numeroContaCliente;
		this.ativaCliente = ativaCliente;
	}
		
	public ClienteDados(char tipoConta) {
		
		this.tipoConta = tipoConta;
	}

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
	//METODO DE ENCAPSULAMENTO
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getCpfCliente() {
		return cpfCliente;
	}
	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}
	public char getSexoCliente() {
		return sexoCliente;
	}
	public void setSexoCliente(char sexoCliente) {
		this.sexoCliente = sexoCliente;
	}
	public boolean isAtivaCliente() {
		return ativaCliente;
	}
	public void setAtivaCliente(boolean ativaCliente) {
		this.ativaCliente = ativaCliente;
	}

	public int getNumeroContaCliente() {
		return numeroContaCliente;
	}
	public double getSaldoCliente() {
		return saldoCliente;
	}
	
	//fim METODO DE ENCAPSULAMENTO
	
}
