package ClienteObjeto;

public class ContaEstudantil extends ClienteDados {

	
	private double LimiteEstudantil;
	private double LimiteEstudantilAtual;
	//construtor
	public ContaEstudantil(char contaPoupan�a, char contaCorrente, char contaEspecial, char contaEmpresarial,
			char contaEstudantil) 
	{
		super(contaPoupan�a, contaCorrente, contaEspecial, contaEmpresarial, contaEstudantil);
		
	}
		
		public ContaEstudantil(char tipoConta) {
			super(tipoConta);
		}
	//condicionais
		//public void tipoConta (char tipoConta) {
		//	if (tipoConta == 'E') {
				
			//	System.out.println("Voc� optou pela conta Estudantil!");
			//	System.out.println("O que deseja fazer agora? ");
			//	System.out.println("Realizar Cr�dito (Retirar dinheiro) - Digite 'C': ");
			//	System.out.println("Realizar D�bito (Colocar dinheiro) - Digite 'D': ");
			//	System.out.println("Realizar o Resgate de um empr�stimo Estudantil? - Digite 'R': ");
				
			//}
		//	}
		public void tipoConta (char tipoConta) {
		if (tipoConta == contaEstudantil) { //PERGUNTAR PARA O ED COMO PUXA
			
		}
		}
	public double getLimiteEstudantil() {
		return LimiteEstudantil;
	}
	public double getLimiteEstudantilAtual() {
		return LimiteEstudantilAtual;
	}
	
}
