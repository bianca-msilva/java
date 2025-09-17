package vetores;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ExemploVetor {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String nomes[] = {"Ana", "Cintia", "Patricia", "Bianca", "Elisa"};
		
		int numeros[] = new int[5];
		
		System.out.println("\nListagem vetor de nomes ");
		
		// Ordenar o vetor (importar a classe arrays)
		
		Arrays.sort(numeros);
		Arrays.sort(nomes, Collections.reverseOrder()); // inverte a ordem dos elementos
		
		for(int i = 0; i < nomes.length; i++) {  //vai trazer sozinho o tamanho (qtde) indices do vetor
			System.out.printf("nomes[%d] = %s%n", i, nomes[i]);
			// %s é para trazer as Strings 
		}
		
		System.out.println("\nInput de dados ");
		for(int i = 0; i < numeros.length; i++) {  //vai trazer sozinho o tamanho (qtde) indices do vetor
			System.out.println("Digite um número: ");
			numeros[i] = input.nextInt();
		} 
		
		
		System.out.println("\nListagem vetor de números ");
		for(int i = 0; i < numeros.length; i++) {  //vai trazer sozinho o tamanho (qtde) indices do vetor
			System.out.printf("numeros[%d] = %d%n", i, numeros[i]);
		}
	
		input.close();

	}

}
