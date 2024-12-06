package collections;

import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exerc2CollectionSet {

	public static void main(String[] args) {

		Set<Integer> setNumeros = new HashSet();
		int numDigitado = 0;
		boolean encontrado = false;

		Scanner leia = new Scanner(System.in);

		Collections.addAll(setNumeros, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		System.out.println("Digite o número que você deseja encontrar: ");
		numDigitado = leia.nextInt();

		for (Integer num : setNumeros) {
			if (numDigitado == num) {
				System.out.println("O número " + numDigitado + " foi encontrado!");
				encontrado = true;
			}
		}

		if (encontrado == false) {
			System.out.println("O número " + numDigitado + " não foi encontrado!");
		}
	}

}
