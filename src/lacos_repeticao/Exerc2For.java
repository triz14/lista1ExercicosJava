package lacos_repeticao;

import java.util.Scanner;

public class Exerc2For {

	public static void main(String[] args) {

		int num, cont, pares = 0, impares = 0;

		Scanner leia = new Scanner(System.in);

		for (cont = 1; cont <= 10; cont++) {
			System.out.println("Digite 0 " + cont + "º número: ");
			num = leia.nextInt();

			if (num % 2 == 0) {
				pares++;
			} else {
				impares++;
			}
		}

		System.out.println("Total de números pares " + pares);
		System.out.println("Total de números impares " + impares);

	}

}
