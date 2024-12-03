package operacoes_basicas;

import java.util.Scanner;

public class Exerc4 {

	public static void main(String[] args) {
		
		// Entrada
		float num1;
		float num2;
		float num3;
		float num4;
		float diferenca;
		
		Scanner leia = new Scanner(System.in);
		
		// Processamento
		System.out.println("Número 1: ");
		num1 = leia.nextFloat();
		
		System.out.println("Número 2: ");
		num2 = leia.nextFloat();
		
		System.out.println("Número 3: ");
		num3 = leia.nextFloat();
		
		System.out.println("Número 4:");
		num4 = leia.nextFloat();
		
		diferenca = (num1 * num2) - (num3 * num4);
		
		// Saída
		System.out.println("Diferença: " + diferenca);
	}

}
