package operadores;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// Instanciar (criar um novo objeto) um objeto baseado na classe Scanner
		Scanner leia = new Scanner(System.in);
		
		// Definir as variáveis para receber os valores
		double num1, num2;
		
		// Receber os dados (Entrada dados do usuário)
		System.out.print("Digite o 1° número: ");
		num1 = leia.nextDouble();
		
		System.out.print("Digite o 2° número: ");  // Para indicar o que o usuário deva digitar
		num2 = leia.nextDouble();	// Se não tiver o sysout a pessoa só vai ter o cursor sem saber o que digitar na tela
		
		System.out.printf("%.2f + %.2f = %.2f%n", num1, num2, num1 + num2);
		// %n faz o mesmo que o \n 
		System.out.printf("%.2f - %.2f = %.2f ", num1, num2, num1 - num2);
		System.out.printf("\n%.2f * %.2f = %.2f ", num1, num2, num1 * num2);
		System.out.printf("\n%.2f / %.2f = %.2f ", num1, num2, num1 / num2);

		// Operações matemáticas com a classe Math
		System.out.printf("\n%.2f ^ %.2f = %.2f ", num1, num2, Math.pow(num1, num2));
		System.out.printf("\nRaiz quadrada de %.2f = %.2f ", num1, Math.sqrt(num1) );
		
		
		leia.close();
		
		
	}

}
