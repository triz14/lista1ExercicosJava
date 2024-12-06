package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Exerc1CollectionList {

	public static void main(String[] args) {

		ArrayList<String> cores = new ArrayList<String>();
		String corDigitada;

		Scanner leia = new Scanner(System.in);

		for (int i = 1; i < 6; i++) {
			System.out.print("Digite a " + i + " º cor: ");
			corDigitada = leia.next();
			cores.add(corDigitada);
		}

		System.out.println("Listar todas as cores: " + cores);

		cores.sort(null);
		System.out.println("Ordenar as cores: " + cores);
	}

}
