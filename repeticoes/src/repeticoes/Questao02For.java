package repeticoes;

import java.util.Scanner;

public class Questao02For {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int pares = 0, impares = 0;
		
		for(int num = 0; num <10; num++) {
			int entrada;
			System.out.print("Digite o " + (num+1) + "° número: ");
			entrada = input.nextInt();
			
			if(entrada % 2 == 0 && entrada > 0) {
				pares ++; 
			}else if(entrada % 2 == 1) {
				impares++;
			}
			
		}
		
		System.out.printf("Total de números pares: %d%nTotal de números ímpares: %d", pares, impares); 
		
		input.close();
	}

}
