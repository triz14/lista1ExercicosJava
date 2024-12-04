package lacos_repeticao;

import java.util.Scanner;

public class Exerc2DoWhile {

	public static void main(String[] args) {

		int num, somaNum = 0, div = 0, media = 0;

		Scanner leia = new Scanner(System.in);

		do {

			System.out.println("Digite um número: ");
			num = leia.nextInt();

			if (num % 3 == 0) {
				somaNum += num;
				div++;
			}

		} while (num != 0);

		div = div - 1; // não sei pq mas ele conta um a mais
		media = somaNum / div;

		System.out.println("A média de todos os números múltiplos de 3 é: " + media);

	}

}
