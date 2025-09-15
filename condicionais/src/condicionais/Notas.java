package condicionais;

import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float n1, n2, n3, n4, media;
		
		
		// especificar se o numero <0 não é aceito
		System.out.println("Digite a primeira nota: ");
		n1 = leia.nextFloat();

		System.out.println("Digite a segunda nota: ");
		n2 = leia.nextFloat();
		
		System.out.println("Digite a terceira nota: ");
		n3 = leia.nextFloat();
		
		System.out.println("Digite a quarta nota: ");
		n4 = leia.nextFloat();
		
		media = (n1 + n2 + n3 + n4)/4;
		
		if(media >= 7) {
			System.out.println("Aluno foi aprovado!");
		}else if(media >= 5 && media < 7){
			System.out.println("Aluno em recuperação!");
		}else {
			System.out.println("Aluno foi reprovado!");
		}
		
		leia.close();

	}

}
