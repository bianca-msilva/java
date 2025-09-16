package repeticoes;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int opcao = 1, contador = 1, numero;
		
		do {
			System.out.println("Digite a opção desejada: ");
			opcao = input.nextInt();
			
		}while(opcao ==  0);
		
		System.out.println("Digite um número inteiro: ");
		numero = input.nextInt();
				
		do {
			System.out.printf("%d * %d = %d%n", numero, contador, numero*contador);
			contador++;
			
		}while(contador <= 10);
		
		input.close();
	}

}
