package repeticoes;

import java.util.Scanner;

public class Questao03While {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int idade = 0, menor21 = 0, maior50 = 0;
		
		while(idade >= 0) {
			System.out.print("Digite uma idade: ");
			idade = input.nextInt();
			
			if(idade <= 21 && idade > 0) {
				menor21++;
			}else if(idade >= 50) {
				maior50++;
			}
		}
		
		System.out.printf("Total de pessoas menores de 21 anos: %d%nTotal de pessoas maiores de 50 anos: %d", menor21, maior50 );
		
		input.close();
	}

}
