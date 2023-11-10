import java.util.Scanner;

public class JogoAdivinhacao {

    public static void main(String[] args) {
        // Gera um número aleatório entre 1 e 5
        int numeroSecreto = (int) (Math.random() * 5) + 1;

        // Cria um leitor de entrada
        Scanner leitor = new Scanner(System.in);

        // Inicia o jogo
        System.out.println("Adivinhe o número entre 1 e 5:");

        // Loop principal do jogo
        for (int tentativas = 0; tentativas < 5; tentativas++) {
            // Lê a entrada do usuário
            int numero = leitor.nextInt();

            // Compara o número do usuário com o número secreto
            if (numero == numeroSecreto) {
                // Usuário venceu
                System.out.println("Parabéns! Você adivinhou o número em " + tentativas + " tentativas.");
                break;
            } else {
                // Usuário errou
                if (numero < numeroSecreto) {
                    System.out.println("O número secreto é maior que " + numero + ".");
                } else {
                    System.out.println("O número secreto é menor que " + numero + ".");
                }
            }
        }

        int tentativas = 0;
		// Se o usuário não adivinhou o número em 5 tentativas
        if (tentativas == 5) {
            System.out.println("Você perdeu! O número secreto era " + numeroSecreto + ".");
        }
    }
}
