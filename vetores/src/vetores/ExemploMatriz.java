package vetores;

import java.util.Scanner;

public class ExemploMatriz {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int numeros[][] = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
		};
		
		float numReais[][] = new float[3][2];  // matriz irregular
		
		System.out.println("\nListar matriz numeros ");
		// Visualizar matriz de números
		for(int i = 0; i < numeros.length; i++) {  // for externo, percorrendo linhas
			// for interno, percorrendo as colunas
			for( int j = 0; j < numeros[i].length ;j++) { 
				System.out.printf("Números[%d][%d] é igual a %d%n", i, j, numeros[i][j]);
			}
		}
		
		System.out.println("\nInput dados matriz numReais ");
		// entrada de números na matriz de numReais
		for(int i = 0; i < numReais.length; i++) {  
			for( int j = 0; j < numReais[i].length ; j++) { 
				System.out.print("Digite um número: ");
				numReais[i][j] = input.nextFloat();
			}
		}
		
		System.out.println("\nListar matriz numReais ");
		for(int i = 0; i < numReais.length; i++) {  
			//for( int j = 0; j < numReais.length ; j++) { // da erro pois a matriz é irregular
			for( int j = 0; j < numReais[i].length ; j++) { // para pegar o tamanho da linha, o tanto de colunas que tem naquela linha
				System.out.printf("NúmerosReais[%d][%d] é igual a %.0f%n", i, j, numReais[i][j]);
			}
		}
		
		
		input.close();
	}

}
