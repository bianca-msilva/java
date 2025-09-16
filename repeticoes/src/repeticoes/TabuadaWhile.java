package repeticoes;

import java.util.Scanner;

public class TabuadaWhile {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int numero;
		int contador = 1;
		
		System.out.println("Digite um número inteiro: ");
		numero = input.nextInt();
		
		while(contador <= 10) {
			System.out.printf("%d * %d = %d%n", numero, contador, numero*contador);
			contador++;
		}
		
		input.close();
	}

}
