package switch_case;

import java.util.Scanner;

public class Exerc1 {

	public static void main(String[] args) {

		int opcao;
		int quant;
		int total;
		
		Scanner leia = new Scanner(System.in);

		System.out.println("###################   Menu   ####################");
		System.out.println("1 - Cachorro Quente R$ 10.00");
		System.out.println("2 - X-Salada R$ 15.00");
		System.out.println("3 - X-Bacon R$ 18.00");
		System.out.println("4 - Bauru R$ 12.00");
		System.out.println("5 - Refrigerante R$ 8.00");
		System.out.println("6 - Suco de laranja R$ 13.00");
		System.out.println("Código do produto: ");
		opcao = leia.nextInt();
		
		System.out.println("Quantidade: ");
		quant = leia.nextInt();

		switch (opcao) {
		
		case 1:
			
			total = quant * 10;
			System.out.println("Produto: Cachorro quante");
			System.out.println("Valor total: " + total);
			break;

		case 2:

			total = quant * 15;
			System.out.println("Produto: X-Salada");
			System.out.println("Valor total: " + total);
			break;

		case 3:

			total = quant * 18;
			System.out.println("Produto: X-Bacon");
			System.out.println("Valor total: " + total);
			break;

		case 4:

			total = quant * 12;
			System.out.println("Produto: Bauru");
			System.out.println("Valor total: " + total);
			break;

		case 5:

			total = quant * 8;
			System.out.println("Produto: Refrigerante");
			System.out.println("Valor total: " + total);
			break;

		case 6:

			total = quant * 13;
			System.out.println("Produto: Suco de laranja");
			System.out.println("Valor total: " + total);
			break;
			
		default:
			System.out.println("Opção inválida");

		}

	}

}
