package condicionais;

import java.util.Scanner;

public class Texto {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int num;
		String texto;
		
		System.out.println("Digite uma frase: ");
		num = leia.nextInt();
		
		System.out.println("Digite uma frase: ");
		leia.skip("\\R");  // Ignorar o \n e lê a string normalmente
		// necessecário para quando é pedido um número ou outra coisa 
		// antes da String que não seja String
		texto = leia.nextLine();
		
		System.out.println("A frase digitada foi: "+ texto);
		
		leia.close();
	}

}
