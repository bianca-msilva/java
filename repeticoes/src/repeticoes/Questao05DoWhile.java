package repeticoes;

import java.util.Scanner;

public class Questao05DoWhile {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num = 1, soma = 0;
		
		do {
			System.out.print("Digite um número: ");
			num = input.nextInt();
			
			if(num > 0) {
				soma += num;
			}
		}while(num != 0);
		
		System.out.printf("A soma dos números positivos é: %d", soma);
		
		input.close();
	}

}
