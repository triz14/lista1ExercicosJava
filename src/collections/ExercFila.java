package collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ExercFila {

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<String>();
		int opcao;
		String CLIENTE;

		Scanner leia = new Scanner(System.in);

		do {
			System.out.println("############## Menu ############");
			System.out.println("\n1 - Adicionar cliente na fila");
			System.out.println("2 - Listar todos os clientes");
			System.out.println("3 - Retirar cliente da fila");
			System.out.println("0 - Sair");
			System.out.println("\n################################");
			System.out.println("Entre com a opção desejada: \n");
			opcao = leia.nextInt();
			leia.nextLine();

			switch (opcao) {

			case 1:
				System.out.println("Digite o nome: ");
				CLIENTE = leia.nextLine();
				fila.add(CLIENTE);
				System.out.println("Cliente adicionado\n");
				break;

			case 2:
				if (fila.isEmpty() == true) {
					System.out.println("A fila esta vazia!\n");
				} else {
					System.out.println("Lista de clientes na fila: ");
					for (String cliente : fila) {
						System.out.println(cliente);
					}
				}
				break;

			case 3:
				if (fila.isEmpty() == true) {
					System.out.println("A fila esta vazia!\n");
				} else {
					fila.remove();
					System.out.println("O cliente foi chamado!");
					System.out.println("Fila: ");
					for (String cliente : fila) {
						System.out.println(cliente);
					}
				}
				break;

			case 0:
				System.out.println("Programa finalizado!");
				break;

			default:
				System.out.println("Opção inválida");
				break;
			}

		} while (opcao != 0);

	}

}
