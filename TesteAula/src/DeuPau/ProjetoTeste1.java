package DeuPau;





	import java.util.Scanner;

	import DeuPau.ProjetoTeste;

	public class ProjetoTeste1 {
			
		public static void main(String[] args) {
			char opcao;
			int opcao2;
			int opcao3;
			char tipoConta;
			int qntContas = 0;
			String cpf = " " ;
			String nome = " " ;
			int numero = 0;
			double saldo = 0.00;
			double limiteEstudantil = 0.00;
			double valor = 0.00;
			
			
			Scanner leia = new Scanner(System.in);
					
			System.out.println("Bem-vindo ao banco X");
			
			System.out.println("Deseja criar sua conta?\n (S)sim ou (N)não:  ");
			opcao = leia.nextLine().toUpperCase().charAt(0);
				if (opcao == 'S')
				{
					System.out.println("Qual tipo de conta você deseja criar?\n[1]Conta Poupança\n"
						+ "[2]Conta Corrente\n[3]Conta Especial\n[4]Conta Empresa\n[5]Conta Estudantil" );//aqui ele pergunta ql tipo de conta vc qr criar
					tipoConta = leia.nextLine().charAt(0);
					// aqui entra meu programa, caso ele escolha a conta 5 :
						if(tipoConta == '5') 
						{
							qntContas++; 
							
							System.out.println("Você escolheu a Conta Estudantil!!\nDigite seu nome completo: ");
							 	nome = leia.nextLine();
							 
							 System.out.println("Digite seu CPF: ");
							 	cpf = leia.nextLine();
							
							ProjetoTeste conta = new ProjetoTeste(nome,numero,cpf);
							System.out.printf("Sua conta estudantil foi criada com sucesso!!\n Dados da conta\n"
									+ " Nome: %s \n Numero da conta: %d\n Seu CPF: %s\n Saldo atual: %.3f\n SaldoEstudantil: %.3f\n" 
										,conta.getNome() , conta.getNumero(), conta.getCpf(), conta.getSaldo(), conta.getlimiteEstudantil());
							
							for(int y=0;conta.getContador()<10;y++) {// aqui fica o loop pra ele rodar até o contador for menor que 10
								System.out.println("Deseja movimentar a conta com [1]Débito ou [2]Crédito? ");//ele pergunta se qr débito ou crédito
									opcao2= leia.nextInt();
								
								if(opcao2 == 2) {// aqui é o que o crédito vai gerar no programa
									System.out.println("Deseja continuar?\n[1]Sim\n[2]Não");
											opcao3= leia.nextInt();
												if(opcao3!=2) {
												System.out.println("Qual valor deseja creditar na sua conta?");
												valor = leia.nextDouble();
												conta.credito(valor);
												System.out.printf("Dados da conta\n"
												+ " Nome: %s \n Numero da conta: %d\n Seu CPF: %s\n Saldo atual: %.3f\n SaldoEstudantil: %.3f\n Movimentos feito na conta: %d\n" 
												,conta.getNome() , conta.getNumeroconta(), conta.getCpf(), conta.getSaldo(), conta.getlimiteEstudantil(), conta.getContador());
													}
												
												if(opcao3==2)
												{
															
												}
										}
								else if(opcao2 == 1) {// aqui é o que o débito vai gerar no programa
									System.out.println("Deseja continuar?\n[1]Sim\n[2]Não");
										opcao3= leia.nextInt();
											if(opcao3!=2) {
											System.out.println("Qual valor deseja debitar da sua conta?");
											valor = leia.nextDouble();
											conta.debito(valor);
											System.out.printf("Dados da conta\n"
											+ " Nome: %s \n Numero da conta: %d\n Seu CPF: %s\n Saldo atual: %.3f\n SaldoEstudantil: %.3f\n Movimentos feito na conta: %d\n" 
											,conta.getNome() , conta.getNumeroconta(), conta.getCpf(), conta.getSaldo(), conta.getlimiteEstudantil(), conta.getContador());
												}
											if(opcao3==2)
											{
												
											}
								}
							}
					}
				}
				else {
					System.out.println("rala rapá");
				}
			}
		}

