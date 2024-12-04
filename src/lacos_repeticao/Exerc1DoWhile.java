package lacos_repeticao;

import java.util.Scanner;

public class Exerc1DoWhile {

	public static void main(String[] args) {
		
		int num, somaNum = 0;
		
		Scanner leia = new Scanner(System.in);
		
		do {
			
			System.out.println("Digite um número: ");
			num = leia.nextInt();
			
			if (num > 0) {
				somaNum += num;
			}
			
		} while (num != 0);
		
		System.out.println("A soma dos números positivos é: " + somaNum);

	}

}
