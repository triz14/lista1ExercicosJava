package switch_case;

import java.util.Scanner;

public class Exerc4 {

	public static void main(String[] args) {

		int operacao;
		float saldo = 1000.00f;
		float saque;
		float deposito;

		Scanner leia = new Scanner(System.in);

		System.out.println("###################   Operações do banco   ####################");
		System.out.println("1 - Saldo");
		System.out.println("2 - Saque");
		System.out.println("3 - Depósito");
		System.out.println("Operação: ");
		operacao = leia.nextInt();

		switch (operacao) {

		case 1:

			System.out.println("Operação - Saldo");
			System.out.println(saldo);
			break;

		case 2:

			System.out.println("Valor: ");
			saque = leia.nextFloat();

			if (saldo < saque) {
				System.out.println("Saldo insuficiente");
			} else {
				saldo = saldo - saque;
				System.out.println("Novo saldo: " + saldo);
			}
			break;

		case 3:

			System.out.println("Valor: ");
			deposito = leia.nextFloat();
			saldo = saldo + deposito;
			System.out.println("Novo saldo: " + saldo);
			break;
			
		default:
			System.out.println("Operação inválida");

		}

	}

}
