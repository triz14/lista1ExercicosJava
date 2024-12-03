package estrutura_decisao;

import java.util.Scanner;

public class Exerc1Lista1 {

	public static void main(String[] args) {
		
		int a;
		int b;
		int c;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o número A: ");
		a = leia.nextInt();
		
		System.out.println("Digite o número B: ");
		b = leia.nextInt();
		
		System.out.println("Digite o número C: ");
		c = leia.nextInt();
		
		if (a + b > c) {
			System.out.println("A soma de A + B é Maior do que C");
		} else if(a + b < c) {
			System.out.println("A soma de A + B é Menor do que C");
		} else {
			System.out.println("A soma de A + B é Igual a C");
		}

	}

}
