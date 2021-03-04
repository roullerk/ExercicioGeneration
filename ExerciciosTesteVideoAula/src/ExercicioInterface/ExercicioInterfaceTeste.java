package ExercicioInterface;

public class ExercicioInterfaceTeste {
public static void main(String[] args) {
	TesteInterface participante = new TesteInterface();
	
	 Leitor leitor = participante;
	
	System.out.println("O participante esta lendo: "+leitor.lendo());
	
	Programador programador = participante;
	String java = "Java";
	programador.pensando(java.toCharArray());
	System.out.println("E programador: "+programador.digitando());
	
}
}
