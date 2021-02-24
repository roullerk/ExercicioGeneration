import java.util.Scanner;

public class AulaGeneration {
	public static void main(String[] args)
	{
		Scanner ler = new Scanner(System.in);
		int a, b, soma;
		
		System.out.println("Escreva o numero a: ");
		a=ler.nextInt();
		System.out.println("Escreva o numero b: ");
		b=ler.nextInt();
		soma=a+b;
		System.out.println("A soma é:"+ soma);
		
		
	}
}
