package DeuPau;

import java.io.File; //i de imput - entrada e o de out put -saida
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Leiturinha {

	public static void main(String[] args) {
		

		File arquivo = new File("c:\\teste\\lista.txt");
		Scanner sc = null;
		try {
		sc = new Scanner(arquivo); //quero que escaneiei o arquivo
		
		while (sc.hasNextLine()) { //tem uma linha?
			//se tiver imprima
			System.out.println(sc.nextLine());
				}
			}
		catch (FileNotFoundException erro) {
		//se nao tiver pare
			System.out.println("Arquivo não encontrado!");
		}
		finally {
			if(sc !=null) {
			sc.close();
			}
		}
		}
}

