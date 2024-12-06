package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exerc2CollectionList {

	public static void main(String[] args) {

		ArrayList<Integer> numeros = new ArrayList<Integer>();
		int num;
		boolean encontrado = false;

		Scanner leia = new Scanner(System.in);
		
		Collections.addAll(numeros, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		System.out.println("Digite o número que você deseja encontrar: ");
		num = leia.nextInt();

		for (Integer numero : numeros) {
			if (numero == num) {
				System.out.println("O número " + num + " está localizado na posição: " + numeros.indexOf(numero));
				encontrado = true;
			}
		}

		if (encontrado == false) {
			System.out.println("O número " + num + " não foi encontrado!");
		}

	}

}
