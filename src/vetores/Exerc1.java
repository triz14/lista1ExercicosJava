package vetores;

import java.util.Scanner;

public class Exerc1 {

	public static void main(String[] args) {

		int numeros[] = { 1, 5, 10, 2, 7, 8, 6, 12, 15, 20 };
		int numDesejado;
		boolean encontrado = false;

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o número que você deseja encontrar: ");
		numDesejado = leia.nextInt();

		for (int i = 0; i < 10; i++) {

			if (numeros[i] == numDesejado) {
				System.out.println("O número " + numDesejado + " está localizado na posição: " + i);
				encontrado = true;
				break;
			}
		}

		if (encontrado == false) {
			System.out.println("O número " + numDesejado + " não foi encontrado!");
		}

	}

}
