package outrosTestes;

import java.util.Scanner;

public class Questao8Switch {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int operacao;
		float saldo = 1000, resposta;
		
		System.out.println("---------------------------");
		System.out.println("| Código |    Operação    |");
		System.out.println("---------------------------");
		System.out.println("|    1   |      Saldo     |");
		System.out.println("---------------------------");
		System.out.println("|    2   |      Saque     |");
		System.out.println("---------------------------");
		System.out.println("|    3   |    Depósito    |");
		System.out.println("---------------------------");
		
		System.out.println("Qual operação você deseja realizar? ");
		operacao = input.nextInt();
		if(operacao >= 1 || operacao <= 3) {
			if(operacao == 2) {
				System.out.println("Qual o valor será sacado? ");
				resposta = input.nextFloat();
				
				if(resposta > saldo) {
					System.out.println("Saldo insuficiente!");
				}
			}else if(operacao == 3) {
				System.out.println("Qual o valor será depositado?");
				resposta = input.nextFloat();
				
			}else {
				System.out.println("Qual o valor será depositado?");
			}
		}else {
			System.out.println("");
		}
		
		input.close();

	}

}
