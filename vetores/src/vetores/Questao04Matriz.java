package vetores;


import java.util.Scanner;

public class Questao04Matriz {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		float soma = 0; 
		float notas[][] = new float[10][4]; 
		float media[] = new float[10]; 
		
		for(int linha = 0; linha < notas.length; linha++) {
			for(int coluna = 0; coluna < notas[linha].length; coluna++) {
				System.out.print("Digite a nota do " + (linha+1) + "° aluno: ");
				notas[linha][coluna] = input.nextFloat();
				soma += notas[linha][coluna];
			}
			media[linha] = soma/4;
			soma = 0;
		}
		

		for(int i = 0; i < media.length; i++) {   
			System.out.printf("\n%.1f ", media[i]);
		}
		
		input.close();

	}

}
