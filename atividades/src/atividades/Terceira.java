package atividades;

import java.util.Scanner;

public class Terceira {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float salBruto, adicional, horasExtras, descontos, salLiquido;
		
		System.out.println("Digite seu salário do colaborador, sem vírgulas ou pontuação: ");
		salBruto = leia.nextFloat();
		
		System.out.println("Digite o adicional noturno do colaborador, sem vírgulas ou pontuação: ");
		adicional = leia.nextFloat();
		
		System.out.println("Digite as horas extras do colaborador: ");
		horasExtras = leia.nextFloat();
		
		System.out.println("Digite os descontos do colaborador, sem vírgulas ou pontuação: ");
		descontos = leia.nextFloat();
		
		salLiquido = salBruto + adicional +  (horasExtras*5) -  descontos;
		System.out.printf("O salário líquido deste colaborador é: %.2f", salLiquido);
		
		leia.close();

	}

}
