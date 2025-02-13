import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		
        System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();

		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		
		try {
			//chama o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		} catch (ParametrosInvalidosException exception) {
			//captura a exceção e exibe a mensagem de erro
		 	System.out.println("Erro: " + exception.getMessage());
		} finally {
			terminal.close();
		}
	}
		
	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		//valida se parametroUm é MAIOR que parametroDois, se sim, lança a exceção
		if(parametroUm > parametroDois){
			throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
		}
		
		//imprime os números com base na variável contagem
		int contagem = parametroDois - parametroUm;
		for(int x = 1; x <= contagem; x++){
			System.out.println("Imprimindo o número " + x);	
		}
	}
}