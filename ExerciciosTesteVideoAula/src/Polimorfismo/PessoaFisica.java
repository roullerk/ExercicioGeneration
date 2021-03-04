package Polimorfismo;

public class PessoaFisica extends Pessoa{

	private long cpf;
	
	public PessoaFisica() {
		
	}
	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	
	public String getNome () {
		return "Pessoa Fisica: " +super.getNome()+ "CPF " + this.getCpf();
	}
	
	
}
