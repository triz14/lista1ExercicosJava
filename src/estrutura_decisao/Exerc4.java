package estrutura_decisao;

import java.util.Scanner;

public class Exerc4 {

	public static void main(String[] args) {

		String osso;
		String animal;
		String alimentacao;

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite vertebrado ou invertebrado: ");
		osso = leia.next();

		if (osso.equals("vertebrado")) {

			System.out.println("Digite se é usa ave, mamífero: ");
			animal = leia.next();

			if (animal.equals("ave")) {

				System.out.println("Digite qual a alimentação do animal: ");
				alimentacao = leia.next();

				if (alimentacao.equals("carnívoro")) {
					System.out.println("Águia");
				}

				if (alimentacao.equals("onívoro")) {
					System.out.println("Pomba");
				}
			}

			if (animal.equals("mamífero")) {

				System.out.println("Digite qual a alimentação do animal: ");
				alimentacao = leia.next();

				if (alimentacao.equals("onívoro")) {
					System.out.println("Homem");
				}

				if (alimentacao.equals("herbívoro")) {
					System.out.println("Vaca");
				}

			} else if (osso.equals("invertebrado")) {

				System.out.println("Digite se é usa inseto, anelídeo: ");
				animal = leia.next();

				if (animal.equals("inseto")) {

					System.out.println("Digite qual a alimentação do animal: ");
					alimentacao = leia.next();

					if (alimentacao.equals("hematófago")) {
						System.out.println("Pulga");
					}

					if (alimentacao.equals("herbívoro")) {
						System.out.println("Lagarta");
					}
				}

				if (animal.equals("anelídeo")) {

					System.out.println("Digite qual a alimentação do animal: ");
					alimentacao = leia.next();

					if (alimentacao.equals("hematófago")) {
						System.out.println("Sanguessuga");
					}

					if (alimentacao.equals("onívoro")) {
						System.out.println("Minhoca");
					}
				}
			}
		}
	}
}
