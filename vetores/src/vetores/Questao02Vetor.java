package vetores;

import java.util.Scanner;

public class Questao02Vetor {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num[] = new int[10], soma = 0;
		float media;
		
		for(int i = 0; i < num.length; i++) {
			System.out.print("Digite o " + (i+1) + "° número: " );
			num[i] = input.nextInt();
			soma += num[i];
			
		}
		
		System.out.println("Elementos nos índices pares: ");
		for(int i = 0; i < num.length; i++){
			if(i % 2 != 0) {
				System.out.printf("%d ", num[i]);
			}
		}
		
		System.out.println("\nElementos pares: ");
		for(int i = 0; i < num.length; i++){
			if(num[i] % 2 == 0) {
				System.out.printf("%d ", num[i]);
			}
		}
		
		media = soma / 10;
		System.out.print("\nSoma: " + soma);
		System.out.printf("\nMedia: %.2f", media);

		
		input.close();
	}

}
