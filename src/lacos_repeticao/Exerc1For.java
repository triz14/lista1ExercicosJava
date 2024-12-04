package lacos_repeticao;

import java.util.Scanner;

public class Exerc1For {

	public static void main(String[] args) {

		int num1, num2;

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o primeiro número do intervalo: ");
		num1 = leia.nextInt();

		System.out.println("Digite o segundo número do intervalo: ");
		num2 = leia.nextInt();

		num1++;

		for (; num1 < num2; num1++) {
			if (num1 % 5 == 0 && num1 % 3 == 0) {
				System.out.println(num1 + " é múltiplo de 3 e 5");
			}
		}

		if (num1 > num2) {
			System.out.println("Intervalo inválido");
		}
	}
}
