package CLASS;

public class CONTA {

	private int numero;
	private String cpf;
	private double saldo;
	private boolean ativa;

	public CONTA(int numero,String cpf) //construtor tem o mesmo nome da classe, só q ele tem parenteses
	{
		this.numero = numero;
		this.cpf = cpf;
	}
	//sobrecarga - preguiçosa
	
	
	public CONTA(int numero, String cpf, boolean ativa) {
		super(); //pode apagar, pode deixar
		this.numero = numero;
		this.cpf = cpf;
		this.ativa = ativa;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public double getSaldo() {
		return saldo;
	}


	public boolean isAtiva() {
		return ativa;
	}


	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}
	//metodos
	//criar credito na conta
	public  void credito(double valor) {
		this.saldo = this.saldo + valor;
	}
	public void debito(double valor) {
		if(this.saldo>=valor) {
			
		this.saldo = this.saldo - valor;
		}
		else {
			System.out.println("Saldo insuficiente!");
		}
	}
}
//public void setSaldo(double saldo) {
//this.saldo = saldo;
//}
