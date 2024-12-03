package operacoes_basicas;

import java.util.Scanner;

public class Exerc1 {

	public static void main(String[] args) {
		
		// Entrada
		float salario;
		float abono;
		float novoSalario;
		
		Scanner leia = new Scanner(System.in);
		
		// Processamento
		System.out.println("Salário: ");
		salario = leia.nextFloat();
		
		System.out.println("Abono: ");
		abono = leia.nextFloat();
		
		novoSalario = salario + abono;
		
		// Saída
		System.out.println("Novo salário: " + novoSalario);

	}

}
