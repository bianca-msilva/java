package exerciciosIfeSwitch;

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
		
		switch(operacao){
		
		case 1:
			System.out.printf("Operação - Saldo\n"
					+ "Seu saldo atual é: R$%.2f", saldo);
			break;
			
		case 2:
			System.out.println("Qual o valor a ser sacado? ");
			resposta = input.nextFloat();
			if(resposta > saldo) {
				System.out.println("Operação - Saldo\n"
						+ "Saldo insuficiente!");
			}else {
				saldo -= resposta;
				System.out.printf("Operação - Saque\n"
						+ "Saldo atualizado após saque de R$%.2f realizado é: R$%.2f", resposta, saldo);
			}
			break;
		
		case 3:
			System.out.println("Qual o valor a ser depositado? ");
			resposta = input.nextFloat();
			saldo += resposta;
			System.out.printf("Operação - Depósito\n"
					+ "Saldo atualizado após depósito de R$%.2f é: R$%.2f", resposta, saldo);
			break;
		
		default:
			System.out.println("Operação inválida!");
		
		}

		input.close();
	}

}
