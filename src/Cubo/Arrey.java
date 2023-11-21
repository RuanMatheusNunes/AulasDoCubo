package Cubo;

import java.util.Arrays;
import java.util.Iterator;

public class Arrey {

	public static void main(String[] args) {
		
		double nota [] = new double[2]; 
		
		double notaA[] = {9,5,8.0};
		
		nota [0] = 8.4;
		nota[1] = 4.5;
		
		// System.out.println(Arrays.toString(nota));
		
		double media = 0;
		
		for (int i = 0; i < nota.length; i++) {
		    media += nota[i];
			
			
		System.out.println("Media do aluno:"  + media / nota.length);
			
		}
		
		
	}

}
