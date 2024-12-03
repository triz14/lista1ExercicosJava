package operacoes_basicas;

import java.util.Scanner;

public class Exerc3 {

	public static void main(String[] args) {
		
		// Entrada
		float salarioBruto;
		float adicNoturno;
		float horasExtras;
		float descontos;
		float salarioLiquido;
		
		Scanner leia = new Scanner(System.in);
		
		// Processamento
		System.out.println("Salário bruto: ");
		salarioBruto = leia.nextFloat();
		
		System.out.println("Adicional noturno: ");
		adicNoturno = leia.nextFloat();
		
		System.out.println("Horas Extras: ");
		horasExtras = leia.nextFloat();
		
		System.out.println("Descontos: ");
		descontos = leia.nextFloat();
		
		salarioLiquido = salarioBruto + adicNoturno + (horasExtras * 5) - descontos;
		
		// Saída
		System.out.println("Salário líquido: " + salarioLiquido);
		
	}

}
