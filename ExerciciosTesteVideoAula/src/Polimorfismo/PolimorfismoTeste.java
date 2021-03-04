package Polimorfismo;

public class PolimorfismoTeste {
public static void main(String[] args) {
	
	PessoaFisica fisica = new PessoaFisica();
	fisica.setNome("Juliana");
	fisica.setCpf(4554525852L);
	
	PessoaJuridica juridica = new PessoaJuridica ();
	juridica.setNome("Cristiano");
	juridica.setCnpj(4585445545455L);
	
	Pessoa[] pessoas = new Pessoa [2];
	pessoas[0] = fisica;
	pessoas[1] = juridica;
	
	for(Pessoa pessoa:pessoas) {
		System.out.println(pessoa.getNome());
	}
}
}
