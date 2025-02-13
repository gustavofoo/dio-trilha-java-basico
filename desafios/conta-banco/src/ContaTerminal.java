import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        //Criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //Recebe os valores via terminal
        System.out.println("Por favor, digite o número da agência");
        String agenciaBancaria = scanner.next();

        System.out.println("Agora digite o número da conta bancária");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite o seu nome");
        String nomeCliente = scanner.next();

        System.out.println("Por fim, digite o saldo da conta");
        double saldoConta = scanner.nextDouble();
    
        //Imprime os dados obtidos do usuário
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agenciaBancaria + ", conta " + numeroConta + " e seu saldo " + saldoConta + " já está disponível para saque");

        //Fecha o scanner para liberar recursos do sistema
        scanner.close();
    }
}
