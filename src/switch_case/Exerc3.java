package switch_case;

import java.util.Scanner;

public class Exerc3 {

	public static void main(String[] args) {

		float num1;
		float num2;
		int operacao;

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o 1º número: ");
		num1 = leia.nextFloat();

		System.out.println("Digite o 2º número: ");
		num2 = leia.nextFloat();

		System.out.println("###################   Operações   ####################");
		System.out.println("1º operação - Soma");
		System.out.println("2º operação - Subtração");
		System.out.println("3º operação - Multiplicação");
		System.out.println("4º operação - Divisão");
		System.out.println("Operação: ");
		operacao = leia.nextInt();

		switch (operacao) {

		case 1:
			System.out.println(num1 + num2);
			break;

		case 2:
			System.out.println(num1 - num2);
			break;

		case 3:
			System.out.println(num1 * num2);
			break;

		case 4:
			System.out.println(num1 / num2);
			break;

		default:
			System.out.println("Operação inválida");

		}

	}

}
