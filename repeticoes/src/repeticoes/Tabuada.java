package repeticoes;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite um número inteiro: ");
		numero = input.nextInt();
		
		for(int contador = 1; contador <= 10; contador++ ) {
			System.out.printf("%d * %d = %d%n", numero, contador, numero*contador);
		}
		
		input.close();
	}

}
