package Cubo;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		
		try (Scanner input = new Scanner(System.in)) {
			String nome="";
					
			
			do {
				System.out.println("Digite os nomes que desejar, para concluir digite 'SAIR': ");
				nome = input.nextLine();
			} while(!nome.equalsIgnoreCase("SAIR"));
			
			System.out.println("Programa finalizado");
		}
		}

	
	
	}


