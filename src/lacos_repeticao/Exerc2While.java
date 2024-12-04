package lacos_repeticao;

import java.util.Scanner;

public class Exerc2While {

	public static void main(String[] args) {

		int idade, genero, desenvolvedor;
		int pessoas = 0, media = 0, somaIdade = 0;
		int mulherCis = 0, homemCis = 0, naoBinario = 0, mulherTrans = 0, homemTrans = 0, outros = 0;
		int backend = 0, frontend = 0, mobile = 0, fullStack = 0;

		String letra = "s";

		Scanner leia = new Scanner(System.in);

		while (letra.equals("s")) {

			System.out.println("Idade: ");
			idade = leia.nextInt();
			somaIdade += idade;

			System.out.println("########## Identidade de Gênero ##########");
			System.out.println("1 - Mulher cis: ");
			System.out.println("2 - Homem cis: ");
			System.out.println("3 - Não binério: ");
			System.out.println("4 - Mulher trans: ");
			System.out.println("5 - Homem trans: ");
			System.out.println("6 - outros: ");
			genero = leia.nextInt();

			System.out.println("########## Pessoa Desenvolvedora ##########");
			System.out.println("1 - Backend: ");
			System.out.println("2 - Frontend: ");
			System.out.println("3 - Mobile: ");
			System.out.println("4 - FullStack: ");
			desenvolvedor = leia.nextInt();

			switch (genero) {
			case 1:
				mulherCis++;
				break;

			case 2:
				homemCis++;
				break;

			case 3:
				naoBinario++;
				break;

			case 4:
				mulherTrans++;
				break;

			case 5:
				homemTrans++;
				break;

			case 6:
				outros++;
				break;

			}

			switch (desenvolvedor) {
			case 1:
				backend++;
				break;

			case 2:

				if (genero == 1 || genero == 4) {
					frontend++;
				}
				break;

			case 3:

				if (genero == 2 || genero == 5 && idade > 40) {
					mobile++;
				}
				break;

			case 4:

				if (genero == 3 && idade < 30) {
					fullStack++;
				}
				break;

			}

			pessoas++;
			media = somaIdade / pessoas;

			System.out.println("Deseja continuar (s/n): ");
			letra = leia.next();

		}

		System.out.println("Total de pessoas desenvolvedoras Backend: " + backend);
		System.out.println("Total de Mulheres Cis e Trans desenvolvedoras Frontend:: " + frontend);
		System.out.println("Total de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: " + mobile);
		System.out.println("Total de Pessoas Não Binárias desenvolvedoras FullStack menores de 30 anos:" + fullStack);
		System.out.println("O número total de pessoas que responderam à pesquisa: " + pessoas);
		System.out.println("A média de idade das pessoas que responderam à pesquisa: " + media);

	}

}
