package vetores;

import java.util.Scanner;

public class Exerc2 {

	public static void main(String[] args) {

		int numeros[] = { 2, 5, 7, 8, 6, 23, 1, 3, 9, 10 };
		int soma = 0, media = 0;

		Scanner leia = new Scanner(System.in);

		System.out.print("Elementos nos índices ímpares: ");
		for (int iImpar = 0; iImpar < numeros.length; iImpar++) {
			if (iImpar % 2 != 0) {
				System.out.print(numeros[iImpar] + " ");
			}
		}

		System.out.print("\nElementos pares: ");
		for (int iPar = 0; iPar < numeros.length; iPar++) {
			if (numeros[iPar] % 2 == 0) {
				System.out.print(numeros[iPar] + " ");
			}
		}

		for (int iSoma = 0; iSoma < numeros.length; iSoma++) {
			soma += numeros[iSoma];
		}

		System.out.println("\nSoma: " + soma);

		media = soma / numeros.length;
		System.out.println("Média: " + media);

	}
}
