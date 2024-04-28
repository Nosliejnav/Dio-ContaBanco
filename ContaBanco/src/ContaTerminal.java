import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
	public static void main(String[] args) {
		//Conhecer e importar a classe Scanner
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
			
		// Exibir as mensagens para o nosso usuário
		// Obter pelo scanner os valores digitados no terminal
		System.out.println("Por favor, Digite o Numero da Conta: ");
		int Numero = scanner.nextInt();
		
		System.out.println("Por favor, Digite o Numero da Agencia: ");
		String Agencia = scanner.next();

		System.out.println("Por favor, Digite o Nome do Cliente: ");
		String NomeCliente = scanner.next();
		
		System.out.println("Por favor, Digite seu sobrenome: ");
		String SobrenomeCliente = scanner.next();
		
		double Saldo = 237.48;

		// exibir a mensagem conta criada

		System.out.print("Olá " + NomeCliente +" "+ SobrenomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " 
		+ Agencia + ", conta " +  Numero + " e seu saldo de " + Saldo + " já esta disponível para saque.");

	}
}
