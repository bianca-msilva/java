package exerciciosIfeSwitch;

import java.util.Scanner;

public class Questao3If {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String nome;
		int idade;
		boolean primeira_doacao;
		
		System.out.println("Digite seu nome completo: ");
		nome = input.nextLine();
		
		System.out.println("Digite sua idade: ");
		idade = input.nextInt();
		
		System.out.println("É sua primeira vez doando? ");
		primeira_doacao = input.nextBoolean();
		
		if(idade >= 18 || idade <=69) {
			
		}
		
		input.close();
	}

}
