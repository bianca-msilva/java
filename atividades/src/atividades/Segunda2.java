package atividades;

import java.util.Scanner;

public class Segunda2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		float notaTotal = 0;
		
		System.out.print("Digite a primeira nota <Se necessário, utilizar vírgula ',' "
				+ "para números não inteiros>: ");
		notaTotal += leia.nextFloat();
		
		System.out.print("Digite a segunda nota <Se necessário, utilizar vírgula ',' "
				+ "para números não inteiros>: ");
		notaTotal += leia.nextFloat();
		
		System.out.print("Digite a terceira nota <Se necessário, utilizar vírgula ',' "
				+ "para números não inteiros>: ");
		notaTotal += leia.nextFloat();
		
		System.out.print("Digite a quarta nota <Se necessário, utilizar vírgula ',' "
				+ "para números não inteiros>: ");
		notaTotal += leia.nextFloat();
		
		System.out.printf("A média final de acordo com as notas digitadas é: %.1f", notaTotal / 4);
		
		leia.close();

	}

}
