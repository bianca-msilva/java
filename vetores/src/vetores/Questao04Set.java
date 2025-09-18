package vetores;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Questao04Set {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Set<Integer> valores = new HashSet<Integer>();
		Random numAleatorio = new Random();
		
		int min = 1, max = 100, resposta;
		
		for(int i = 0; i < 10; i++) {
			int num = 0;
			num = min + numAleatorio.nextInt(max - min);
			valores.add(num);
		}
		
		System.out.println("Digite o número que deseja encontrar: ");
		resposta = input.nextInt();
		
		if(valores.contains(resposta) == true) {
			System.out.println("O número " + resposta + " foi encontrado!");
		}else {
			System.out.println("O número " + resposta + " não foi encontrado!");
		}
		
		System.out.println(valores);
		

	}

}
