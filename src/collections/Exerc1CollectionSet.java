package collections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exerc1CollectionSet {

	public static void main(String[] args) {
		
		Set<Integer> setNumeros = new HashSet<Integer>();
		int num;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite 10 números sem repetições");
		for (int i = 1; i < 11; i++) {
			System.out.println("Digite o " + i + " º número: ");
			num = leia.nextInt();
			setNumeros.add(num);
		}
		
		System.out.println("Listar dados do Set: ");
		for (Integer n : setNumeros) {
			System.out.println(n);
		}

	}

}
