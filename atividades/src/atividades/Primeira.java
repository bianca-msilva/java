package atividades;

import java.util.Scanner;

public class Primeira {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float sal, abono, novoSalario;
		
		System.out.println("Digite seu salário: ");
		sal = leia.nextFloat();
		
		System.out.println("Digite o abono salarial: ");
		abono = leia.nextFloat();
		
		novoSalario = sal + abono;
		System.out.printf("O salário R$%.2f mais o abono de R$%.2f é igual a: R$%.2f", sal, abono, novoSalario);
		
		leia.close();
	}

}
