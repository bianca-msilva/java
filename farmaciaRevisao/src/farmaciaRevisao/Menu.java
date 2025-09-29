package farmaciaRevisao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
	private static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
	
		while(true) {
			
			System.out.println("Escolha a opção desejada: ");
			
			try {
				System.out.println("Escolha a opção desejada: ");
				int opcao = leia.nextInt();
				
				
			}catch(InputMismatchException e){
				System.out.println("Digite um número inteiro!");
			}
		}
		
	}

}
