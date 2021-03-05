package DeuPau;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TesteErros {

	public static void main(String[] args) {
		
		// se - if - desvio condicional - switch - função
		// for - while - do while - laços de repetição
		// try - catch (se misturado com switch)
		
		Scanner leia = new Scanner (System.in);

		int numero = 0;
		String nomes[] = {"João", "Maria", "Pedro"};
		
		try {
			System.out.print("Digite o numero da posição do vetor: [0-2] ");
			numero = leia.nextInt();
		
			System.out.println("O nome escolhido foi: "+nomes[numero]);
		}
		catch ( InputMismatchException erro) {
			//aqui ele descobre qual erro deu
			System.out.println("Você digitou uma letra ao invez de número!");
		}
		finally {
			System.out.println("VAI SEMPRE ACONTECER!");
		}
		
			System.out.println("FIM DE PROGRAMA");
		
		
		//pode ter mais de um catch
		//tipo de rotina que usaremos na progração
		//em situações muito comuns
		//eu sei q aqui pode ter um problema, e por isso uso o catch
		//coloca onde há interação com o usuario
		
		
		
	}

}
