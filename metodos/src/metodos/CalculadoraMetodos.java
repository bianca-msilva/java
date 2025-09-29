package metodos;

import java.util.Scanner;

public class CalculadoraMetodos {

	public static void main(String[] args) {
		// Instanciar (criar um novo objeto) um objeto baseado na classe Scanner
		Scanner leia = new Scanner(System.in);
				
		// Definir as variáveis para receber os valores
		double num1, num2;
				
		// Receber os dados (Entrada dados do usuário)
		System.out.print("Digite o 1° número: ");
		num1 = leia.nextDouble();
				
		System.out.print("Digite o 2° número: ");  // Para indicar o que o usuário deva digitar
		num2 = leia.nextDouble();
		
		// Chamar o Método soma
		System.out.printf("%.2f + %.2f = %.2f%n", num1, num2, somar(num1, num2)); 
		System.out.printf("%.2f - %.2f = %.2f%n", num1, num2, subtrair(num1, num2)); 
		System.out.printf("%.2f * %.2f = %.2f%n", num1, num2, multiplicar(num1, num2)); 
		
		double resultadoDivisao = dividir(num1, num2);
		
		if(resultadoDivisao == 0) {
			System.out.println("Não existe Divisão por zero!");
		}else {
			System.out.printf("%.2f * %.2f = %.2f%n", num1, num2, resultadoDivisao); 
		}
		
		sobre();
		
		leia.close();
	} // Método main termina aqui
	
	// Novo Método deve ser colocado aqui (dentro da classe, mas não do Método main)
	
	public static double somar(double numero1, double numero2) {  //São variáveis independentes
		return numero1 + numero2;
		// Agora precisa ser chamada onde você deseja no outro Método (main) para utilizado
	}
	
	public static double subtrair(double numero1, double numero2) {  
		return numero1 - numero2;
	}
	
	public static double multiplicar(double numero1, double numero2) {  
		return numero1 * numero2;
	}
	
	public static double dividir(double numero1, double numero2) {  
		if(numero2 == 0) {
			return 0; // Tratar isso no Método main, especificar e evitar erros
		}
		return numero1 / numero2;
	}
	
	public static void sobre() {
		System.out.println("\n******************************************");
		System.out.println("Calculadora desenvolvida por: Bianca Maria");
		System.out.println("******************************************");
	}

}  // Classe termina aqui
