package colecoes;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Questao02Collections {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> valores = new ArrayList<Integer>();
		Random numAleatorio = new Random();
		
		int minimo = 1, maximo = 100, resposta;
		
		// Coloca valores aleatórios no Array
		for(int i = 0; i < 10; i++) {
			int num = minimo + numAleatorio.nextInt(maximo - minimo); // para que os números aleatórios gerados não sejam muito grandes
			valores.add(num);
		}
		
		
		// Pede para o usuário digitar um número
		System.out.println("Digite o número que você deseja encontrar: ");
		resposta = input.nextInt();
		
		// Verificar se o número digitado pelo usuário está contido no Array
		if(valores.contains(resposta) == true) {
			System.out.println("O número está localizado na posição: " + valores.indexOf(resposta));
		}else {
			System.out.println("O número " + resposta + " não foi encontrado!");
		}
		
		
		input.close();
	}

}
