package helloworld;

import java.util.Scanner;

public class Variaveis {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite seu peso: ");
		int peso = leia.nextInt();
		char opcao = leia.next().charAt(0);
		float valor = leia.nextFloat();
		
		System.out.println("O valor da variável peso é: " + peso);
		System.out.println("O valor da variável opção é: " + opcao);
		System.out.printf("O valor da variável valor é: %.2f \n ", valor); //"%.2f" especifica que seria um n° mostrando as duas casas decimais
															// é "," pois é quais variáveis a serem exibidas
						// f no final é para "formato"
		leia.close();
		
		

	}

}
