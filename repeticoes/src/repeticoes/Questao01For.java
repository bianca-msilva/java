package repeticoes;

import java.util.Scanner;

public class Questao01For {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int entrada1, entrada2;
		
		System.out.print("Digite o 1° número do intervalo: ");
		entrada1 = input.nextInt();
		System.out.print("Digite o 2° número do intervalo: ");
		entrada2 = input.nextInt();
		
		if(entrada2<entrada1) {
			System.out.println("Intervalo inválido!");
		}else {
		
			for(int num = entrada1; num <= entrada2; num++) {
				if(num % 3 == 0 && num % 5 ==0) {
					System.out.println(num + " é múltiplo de 3 e 5");
				}
			}
		}
		
		input.close();
	}

}
