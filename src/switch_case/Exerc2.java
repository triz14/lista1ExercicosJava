package switch_case;

import java.util.Scanner;

public class Exerc2 {

	public static void main(String[] args) {
		
		String nome;
		int cargo;
		float salario;
		float novoSalario;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Nome do colaborador: ");
		nome = leia.next();
		
		System.out.println("###################   Cargos   ####################");
		System.out.println("1 - cargo Gerente reajuste 10%");
		System.out.println("2 - cargo Vendedor reajuste 7%");
		System.out.println("3 - cargo Supervisor reajuste 9%");
		System.out.println("4 - cargo Motorista reajuste 6%");
		System.out.println("5 - cargo Estoquista reajuste 5%");
		System.out.println("6 - cargo Técnico de TI reajuste 8%");
		System.out.println("Cargo: ");
		cargo = leia.nextInt();
		
		System.out.println("Salário: ");
		salario = leia.nextFloat();
		
		switch (cargo) {
		case 1:
			
			System.out.println("Nome do colaborador: " + nome);
			System.out.println("Cargo: Gerente");
			novoSalario = salario + (0.10f * salario);
			System.out.println(novoSalario);
			break;
			
		case 2:
			
			System.out.println("Nome do colaborador: " + nome);
			System.out.println("Cargo: Vendedor");
			novoSalario = salario + (0.07f * salario);
			System.out.println(novoSalario);
			break;
			
		case 3:
			
			System.out.println("Nome do colaborador: " + nome);
			System.out.println("Cargo: Supervisor");
			novoSalario = salario + (0.09f * salario);
			System.out.println(novoSalario);
			break;
		
		case 4:
			
			System.out.println("Nome do colaborador: " + nome);
			System.out.println("Cargo: Motorista");
			novoSalario = salario + (0.06f * salario);
			System.out.println(novoSalario);
			break;
		
		case 5:
			
			System.out.println("Nome do colaborador: " + nome);
			System.out.println("Cargo: Estoquista");
			novoSalario = salario + (0.05f * salario);
			System.out.println(novoSalario);
			break;
		
		case 6:
			
			System.out.println("Nome do colaborador: " + nome);
			System.out.println("Cargo: Técnico de TI");
			novoSalario = salario + (0.08f * salario);
			System.out.println(novoSalario);
			break;
			
		default:
			System.out.println("Opção inválida");
			
		}
	}

}