package lacos_repeticao;

import java.util.Scanner;

public class Exerc1While {

	public static void main(String[] args) {

		int idade, menor = 0, maior = 0;

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite uma idade: ");
		idade = leia.nextInt();

		while (idade > 0) {
			System.out.println("Digite uma idade: ");
			idade = leia.nextInt();

			if (idade < 21) {
				menor++;
			} else if (idade > 50) {
				maior++;
			}
		}

		System.out.println("Total de pessoas menores de 21 anos: " + menor);
		System.out.println("Total de pessoas maiores de 50 anos: " + maior);

	}

}
