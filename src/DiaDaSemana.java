import java.util.Scanner;

public class DiaDaSemana {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Informe um numero: ");
			int diaSemana = scanner.nextInt();

			if (diaSemana == 1) {
			    System.out.println("Domingo.");
			} else if (diaSemana == 2) {
			    System.out.println("Segunda-feira.");
			} else if (diaSemana == 3) {
			    System.out.println("Terça-feira.");
			} else if (diaSemana == 4) {
			    System.out.println("Quarta-feira.");
			} else if (diaSemana == 5) {
			    System.out.println("Quinta-feira.");
			} else if (diaSemana == 6) {
			    System.out.println("Sexta-feira.");
			} else if (diaSemana == 7) {
			    System.out.println("Sabado.");
			} else {
			    System.out.println("Dia da semana inválido.");
			}
		}
    }
}