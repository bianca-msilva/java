package exerciciosIfeSwitch;

import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int a, b, c, soma;
		
		System.out.println("Digite o número A: ");
		a = input.nextInt();
		
		System.out.println("Digite o número B: ");
		b = input.nextInt();
		
		System.out.println("Digite o número C: ");
		c = input.nextInt();
		
		soma = a + b;
		
		if(soma > c) {
			System.out.printf("%d + %d = %d > %d\nA soma de A + B é maior do que C", a, b, soma, c);
		}else if(soma < c) {
			System.out.printf("%d + %d = %d < %d\nA soma de A + B é menor do que C", a, b, soma, c);
		}else {
			System.out.printf("%d + %d = %d = %d\nA soma de A + B é igual a C", a, b, soma, c);
		}
		
		input.close();
	}

}
