package helloworld;

import java.util.Scanner;

public class Soma {

	public static void main(String[] args) { 

	Scanner leia = new Scanner(System.in);
		double num1, num2;
		
		System.out.println("Digite o primeiro número: ");
		num1 = leia.nextDouble();
		
		System.out.println("Digite o segundo número: ");
		num2 = leia.nextDouble();
		
		System.out.printf("%.2f + %.2f = %.2f", num1, num2, num1 + num2);
		System.out.println("\nA divisão dos dois números é: " + (num1 / num2) );
		 
		/* 
		 * O espaço nas operações é obrigatório
		 */

	leia.close();
	}

}
