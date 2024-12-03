package estrutura_decisao;

import java.util.Scanner;

public class Exerc3Lista1 {

	public static void main(String[] args) {

		String nome;
		int idade;
		boolean primeiraVez;

		primeiraVez = false;

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o Nome do doador: ");
		nome = leia.next();

		System.out.println("Digite a Idade do doador: ");
		idade = leia.nextInt();

		System.out.println("Primeira doação de sangue? ");
		primeiraVez = leia.nextBoolean();

		System.out.println(primeiraVez);

		if (idade < 18) {
			System.out.println(nome + " não está apto para doar sangue!");
		} else {
			if (idade > 60 && primeiraVez == false) {
				System.out.println(nome + " está apto para doar sangue!");
			} else {
				System.out.println(nome + " não está apto para doar sangue!");
			}
		}
	}

}
