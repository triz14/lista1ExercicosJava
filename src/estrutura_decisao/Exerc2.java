package estrutura_decisao;

import java.util.Scanner;

public class Exerc2 {

	public static void main(String[] args) {
		
		int num;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		num = leia.nextInt();
		
		if (num % 2 == 0 && num > 0) {
			System.out.println("O número " + num + " é par e é positivo");
		} else if (num % 2 != 0 && num < 0) {
			System.out.println("O número " + num + " é impar e é negativo");
		} else if (num % 2 != 0 && num > 0) {
			System.out.println("O número " + num + " é impar e é positivo");
		} else {
			System.out.println("O número " + num + " é par e é negativo");
		}

	}

}
