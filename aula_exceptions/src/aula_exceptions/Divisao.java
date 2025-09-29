package aula_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Divisao {

	static Scanner ler = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int dividendo = 0;
		int divisor = 0;
		boolean loop = true;
		
		do {
			try {  // Parte que tenta executar sem erro
				System.out.println("Digite o Dividendo: ");
				dividendo = ler.nextInt();
						
				System.out.println("Digite o Divisor: ");
				divisor = ler.nextInt();
						
				divide(dividendo, divisor);
				loop = false;  // se tudo do try for executado sem erros, sai do loop 
				
			}catch(InputMismatchException e) { // Coloca o erro e "e" é a variável que está capturando o erro
				System.err.println("Digite valores inteiros! " + e);  // o "err" é o print específico para mostrar erros
				ler.nextLine();	// Sem ele, o ln/pular linha desse print cai no .nextInt() do valor do try
				// Aqui pula, para não cair em loop infinito de erro
			}catch(ArithmeticException e) {
				System.err.println("Não existe divisão por zero!");
				ler.nextLine();
			}finally {
				System.out.println("Obrigada pela preferência!");
			}
		}while(loop); // Enquanto houver erros, o loop continuará infinito
	}

	public static void divide(int dividendo, int divisor) {
		System.out.println("Divisão = " + (dividendo / divisor));
	}

}
