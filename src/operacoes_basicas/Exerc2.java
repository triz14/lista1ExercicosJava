package operacoes_basicas;

import java.util.Scanner;

public class Exerc2 {

	public static void main(String[] args) {
		
		// Entrada
		float nota1;
		float nota2;
		float nota3;
		float nota4;
		float media;
		
		Scanner leia = new Scanner(System.in);
		
		// Processamento 
		System.out.println("Nota 1: ");
		nota1 = leia.nextFloat();
		
		System.out.println("Nota 2: ");
		nota2 = leia.nextFloat();
		
		System.out.println("Nota 3: ");
		nota3 = leia.nextFloat();
		
		System.out.println("Nota 4: ");
		nota4 = leia.nextFloat();
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		// Saída
		System.out.println("Média final: " + media);

	}

}
