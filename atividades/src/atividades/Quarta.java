package atividades;

import java.util.Scanner;

public class Quarta {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float n1, n2, n3, n4;
		
		System.out.println("Digite o primeiro número: ");
		n1 = leia.nextFloat();
		
		System.out.println("Digite o segundo número: ");
		n2 = leia.nextFloat();
		
		System.out.println("Digite o terceiro número: ");
		n3 = leia.nextFloat();
		
		System.out.println("Digite o quarto número: ");
		n4 = leia.nextFloat();
		
		System.out.printf("diferença do produto entre o %.1f e %.1f pelo produto entre o %.1f e o %.1f é igual a %.1f", n1, n2, n3, n4, (n1 * n2) - (n3 * n4));
		
		leia.close();

	}

}
