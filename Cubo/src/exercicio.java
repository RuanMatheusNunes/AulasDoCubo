import java.util.Scanner;

public class exercicio {
	public static void main(String[] args) {

		// Importa a classe Scanner

//		import util.Scanner;

		// Instancia um objeto Scanner para ler dados do usuário

		Scanner entrada = new Scanner(System.in);

		// Solicita o nome do usuário

		System.out.println("Digite o seu nome: ");

		String nome = entrada.nextLine();

		// Solicita o bairro do usuário

		System.out.println("Digite o seu bairro: ");

		String bairro = entrada.nextLine();

		// Solicita a cidade do usuário

		System.out.println("Digite a sua cidade: ");

		String cidade = entrada.nextLine();

		// Solicita o estado do usuário

		System.out.println("Digite o seu estado: ");

		String estado = entrada.nextLine();

		// Solicita a rua do usuário

		System.out.println("Digite a sua rua: ");

		String rua = entrada.nextLine();

		// Solicita o número da casa do usuário

		System.out.println("Digite o número da sua casa: ");

		int numero = entrada.nextInt();

		// Solicita o CEP do usuário

		System.out.println("Digite o seu CEP: ");

		String cep = entrada.next();

		// Exibe os dados fornecidos pelo usuário

		System.out.println("Dados do usuário:");

		System.out.println("Nome: " + nome);

		System.out.println("Bairro: " + bairro);

		System.out.println("Cidade: " + cidade);

		System.out.println("Estado: " + estado);

		System.out.println("Rua: " + rua);

		System.out.println("Número: " + numero);

		System.out.println("CEP: " + cep);

	}
}
