package collections;

import java.util.Scanner;
import java.util.Stack;

public class ExercPilha {

	public static void main(String[] args) {

		Stack<String> pilha = new Stack<String>();
		int opcao;
		String livro;

		Scanner leia = new Scanner(System.in);

		do {
			System.out.println("############## Menu ############");
			System.out.println("1 - Adicionar livro na pilha");
			System.out.println("2 - Listar todos os livros");
			System.out.println("3 - Retirar livro da pilha");
			System.out.println("0 - Sair");
			System.out.println("################################");
			System.out.println("Entre com a opção desejada: ");
			opcao = leia.nextInt();
			leia.nextLine();

			switch (opcao) {
			case 1:
				System.out.println("Digite o nome: ");
				livro = leia.nextLine();
				pilha.push(livro);
				System.out.println("\nLivro adicionado!");
				break;

			case 2:
				if (pilha.isEmpty() == true) {
					System.out.println("A pilha está vazia!");
				} else {
					System.out.println("Pilha: ");
					for (String livros : pilha) {
						System.out.println(livros);
					}
				}
				break;

			case 3:
				if (pilha.isEmpty() == true) {
					System.out.println("A pilha esta vazia!");
				} else {
					pilha.pop();
					System.out.println("Pilha: ");
					for (String livros : pilha) {
						System.out.println(livros);
					}
					System.out.println("\nLivro removido!");
				}
				break;

			case 0:
				System.out.println("Programa Finalizado!");
				break;

			default:
				System.out.println("Opção inválida");
			}

		} while (opcao != 0);

	}

}
