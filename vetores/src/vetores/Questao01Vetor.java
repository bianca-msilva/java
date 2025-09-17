package vetores;

import java.util.Scanner;

public class Questao01Vetor {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num[] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		int nDigitado;
		
		System.out.print("Digite o número que você deseja encontrar: ");
		nDigitado = input.nextInt();
		
		for(int i = 0; i < num.length; i++) {
			if(num[i] != nDigitado) {
				System.out.printf("O número %d não foi encontrado!",nDigitado);
			}else {
				System.out.printf("número %d está localizado na posição: %d", nDigitado, num[i]);
			}
		}
		

		input.close();

	}

}
